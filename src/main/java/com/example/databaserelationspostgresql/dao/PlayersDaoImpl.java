package com.example.databaserelationspostgresql.dao;

import com.example.databaserelationspostgresql.bean.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class PlayersDaoImpl implements PlayersDao{
   @Value("${queryToFetchAllPlayers}")
   private String queryToFetchAllPlayers;

   @Value("${queryToFetchPlayersByName}")
   private String queryToFetchPlayersByName;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Players> getAllPlayers() {

        return jdbcTemplate.query(queryToFetchAllPlayers, new PlayersRowMapper());
    }

    @Override
    public List<Players> getPlayersByName(String name) {
        return jdbcTemplate.query(queryToFetchPlayersByName,new Object[]{name} , new PlayersRowMapper());
    }

    public class PlayersRowMapper implements RowMapper<Players>{

        @Override
        public Players mapRow(ResultSet rs , int rowNum) throws SQLException {
            Players players = new Players();
            players.setId(rs.getInt("id"));
            players.setName(rs.getString("name"));
            return players;
        }

    }
}
