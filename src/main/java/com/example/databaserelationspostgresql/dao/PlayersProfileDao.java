package com.example.databaserelationspostgresql.dao;

import com.example.databaserelationspostgresql.bean.PlayersProfile;

import java.util.List;

public interface PlayersProfileDao {
    List <PlayersProfile> getAllPlayersProfiles();

    List<PlayersProfile> getPlayersProfileById();


}
