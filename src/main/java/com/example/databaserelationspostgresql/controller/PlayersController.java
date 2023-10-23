package com.example.databaserelationspostgresql.controller;

import com.example.databaserelationspostgresql.bean.Players;
import com.example.databaserelationspostgresql.dao.PlayersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayersController {
    @Autowired
     PlayersDao playersDao;

    @GetMapping("/getallplayers")
    public List<Players> getAllPlayers(){
        return playersDao.getAllPlayers();
    }

    @GetMapping("getstudentsbyname")
    public List<Players> getPlayersByName(@RequestParam String name){
        return playersDao.getPlayersByName(name);
    }

}
