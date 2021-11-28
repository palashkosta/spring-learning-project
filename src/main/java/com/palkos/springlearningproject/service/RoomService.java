package com.palkos.springlearningproject.service;

import java.util.List;

import com.palkos.springlearningproject.data.RoomRepository;
import com.palkos.springlearningproject.models.Room;

import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }
}
