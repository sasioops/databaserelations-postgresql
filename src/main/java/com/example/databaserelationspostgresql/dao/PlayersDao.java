package com.example.databaserelationspostgresql.dao;

import com.example.databaserelationspostgresql.bean.Players;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PlayersDao {
    List<Players> getAllPlayers();
    List<Players> getPlayersByName(String name);
}
