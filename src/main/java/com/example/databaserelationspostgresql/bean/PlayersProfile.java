package com.example.databaserelationspostgresql.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
@Table(name = "playerprofile")
public class PlayersProfile {
        @Id
        private int id;
        private String twittername;

    public PlayersProfile() {
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTwittername() {
            return twittername;
        }

        public void setTwittername(String twittername) {
            this.twittername = twittername;
        }

}
