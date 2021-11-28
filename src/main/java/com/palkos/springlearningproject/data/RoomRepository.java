package com.palkos.springlearningproject.data;

import com.palkos.springlearningproject.models.Room;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
