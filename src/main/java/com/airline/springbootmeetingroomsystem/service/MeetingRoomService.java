package com.airline.springbootmeetingroomsystem.service;

import com.airline.springbootmeetingroomsystem.config.RoomType;
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
        int roomSize = meetingRoom.getRoomSize();
        if (roomSize < 3) {
            meetingRoom.setRoomType(RoomType.SMALL);
        } else if (roomSize > 3 && roomSize <= 5) {
            meetingRoom.setRoomType(RoomType.MEDIUM);
        } else {
            meetingRoom.setRoomType(RoomType.LARGE);
        }
        meetingRoomRepository.save(meetingRoom);
    }

    public Optional<MeetingRoom> findMeetingRoomById(Long id) {
        return meetingRoomRepository.findById(id);
    }
}
