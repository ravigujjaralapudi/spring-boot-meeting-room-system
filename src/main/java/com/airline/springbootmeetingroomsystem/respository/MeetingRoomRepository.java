package com.airline.springbootmeetingroomsystem.respository;

import com.airline.springbootmeetingroomsystem.entity.MeetingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, Long> {

}
