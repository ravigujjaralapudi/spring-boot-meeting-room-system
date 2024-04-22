package com.airline.springbootmeetingroomsystem.controller;

import com.airline.springbootmeetingroomsystem.entity.MeetingRoom;
import com.airline.springbootmeetingroomsystem.exception.MeetingNotFoundException;
import com.airline.springbootmeetingroomsystem.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/meetingroom")
public class MeetingRoomController {

    @Autowired
    private MeetingRoomService meetingRoomService;

    //create Meeting Room
    @PostMapping("/createMeetingRoom")
    public ResponseEntity<String> createMeetingRoom(@RequestBody MeetingRoom meetingRoom) {
        meetingRoomService.createMeetingRoom(meetingRoom);
        return new ResponseEntity<>("Successfully created", HttpStatus.OK);
    }

    // get Meeting by id

    @GetMapping("findMeetingRoomById/{id}")
    public ResponseEntity<Optional<MeetingRoom>> findMeetingRoomById(@PathVariable Long id) {
        Optional<MeetingRoom> meetingRoom = meetingRoomService.findMeetingRoomById(id);
        if (meetingRoom.isPresent()) {
            return new ResponseEntity<>(meetingRoom, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(meetingRoom, HttpStatus.NOT_FOUND);
        }
    }

    // get all meeting rooms


    // delete meeting room

    // update meeting room


}
