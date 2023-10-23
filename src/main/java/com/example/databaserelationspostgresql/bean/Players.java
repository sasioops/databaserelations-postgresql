package com.example.databaserelationspostgresql.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "players")
public class Players {
    public Players() {

    }

    @Id
    private int id;
    private String name;


    private PlayersProfile playersprofile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
