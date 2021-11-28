package com.palkos.springlearningproject.controller;

import com.palkos.springlearningproject.service.RoomService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {
    
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public String getAllRooms(Model model) {
       model.addAttribute("rooms", this.roomService.getAllRooms());
       return "rooms"; //this is the name of template file rooms.html
    }
}
