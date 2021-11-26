package com.palkos.springlearningproject.controller;

import java.util.ArrayList;
import java.util.List;

import com.palkos.springlearningproject.models.Room;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {
    private static final List<Room> rooms = new ArrayList<>();

    static {
        for(int i=0; i<10; i++) {
            rooms.add(new Room(i, "Room "+i, "R "+i, " Bed Info "+i));
        }
    }

    @GetMapping("/rooms")
    public String getAllRooms(Model model) {
       model.addAttribute("rooms", rooms);
       return "rooms"; //this is the name of template file rooms.html
    }
}
