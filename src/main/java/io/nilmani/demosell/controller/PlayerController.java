package io.nilmani.demosell.controller;

import io.nilmani.demosell.entity.Player;
import io.nilmani.demosell.serviceIface.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService ps;

    @GetMapping("/")
    public String home(){
        return "Controller called by browser";
    }
    @PostMapping("/addNewPlayer")
    public Player addPlayer(Player player){
        return ps.savePlayer(player);
    }
}
