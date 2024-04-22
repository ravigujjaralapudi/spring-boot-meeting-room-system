package com.airline.springbootmeetingroomsystem.entity;

import com.airline.springbootmeetingroomsystem.config.RoomType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "meeting_room")
@Data
public class MeetingRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long roomId;
    private String roomName;
    private String roomLocation;
    private int roomSize;
    @JsonIgnore
    private RoomType roomType;
}
