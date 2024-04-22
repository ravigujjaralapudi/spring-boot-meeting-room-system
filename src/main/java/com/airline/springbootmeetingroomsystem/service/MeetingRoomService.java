package com.airline.springbootmeetingroomsystem.service;

import com.airline.springbootmeetingroomsystem.entity.MeetingRoom;
import com.airline.springbootmeetingroomsystem.respository.MeetingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MeetingRoomService {

    @Autowired
    private MeetingRoomRepository meetingRoomRepository;

    public void createMeetingRoom(MeetingRoom meetingRoom) {
        meetingRoomRepository.save(meetingRoom);
    }

    public Optional<MeetingRoom> findMeetingRoomById(Long id) {
        return meetingRoomRepository.findById(id);
    }
}
