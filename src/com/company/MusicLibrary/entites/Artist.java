package com.company.MusicLibrary.entites;
import java.util.*;

    public class Artist {
        public static int counter = 1;

        private int artistId;
        private String firstName;
        private String lastName;
        private List<Song> releasedSong;
        private Date registrationTime;

        public Artist(String firstName, String lastName, Date registrationTime) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.releasedSong = new ArrayList<>();
            this.registrationTime = registrationTime;
            this.artistId = counter;
            counter++;
        }

        public int getArtistId() {
            return artistId;
        }

        public String getName() {
            return firstName+" "+lastName;
        }

        public List<Song> getReleasedSong() {
            return releasedSong;
        }

        public Date getRegistrationTime() {
            return registrationTime;
        }

        public void releaseSong(Song song){
            releasedSong.add(song);
        }
    }


