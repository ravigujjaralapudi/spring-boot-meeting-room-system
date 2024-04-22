package com.airline.springbootmeetingroomsystem.exception;

public class MeetingNotFoundException extends RuntimeException {
    public MeetingNotFoundException(String meetingRoomNotFound) {
        super(meetingRoomNotFound);
    }
}
