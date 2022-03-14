package com.company.MusicLibrary.application;
import com.company.MusicLibrary.entites.Artist;
import com.company.MusicLibrary.entites.Song;
import com.company.MusicLibrary.entites.User;
import java.util.Date;
import java.util.HashMap;

public class MusicLibrary {

    private HashMap<Integer, User> users = new HashMap<>();
    private HashMap<Integer, Artist> artists = new HashMap<>();
    private HashMap<Integer, Song> songs = new HashMap<>();

    public void playSong(int songId, int userId) {
        if(!users.containsKey(userId)){
            throw new RuntimeException("User is invalid!");
        }
        if(!songs.containsKey(songId)){
            throw new RuntimeException("Invalid song!");
        }
        Song song = songs.get(songId);
        song.markPlayed();
    }

    public User registerUser(String firstName, String lastName,
                             String city, String locality,
                             String state, int pinCode,
                             String emailId, String phoneNo) {
        User.Address address =
                new User.Address(city, locality, state, pinCode);
        User.Contact contact = new User.Contact(emailId, phoneNo);
        User user = new User(firstName, lastName, address, contact, new Date());
        users.put(user.getUserId(), user);
        return user;
    }

    public Artist registerArtists(String firstName, String lastName) {
        Artist artist = new Artist(firstName, lastName, new Date());
        artists.put(artist.getArtistId(), artist);
        return artist;
    }

    public Song releaseSong(int artistId, String title, String genre,
                            int releaseYear, String language) throws Exception {
        if (!artists.containsKey(artistId)) {
            throw new Exception("Artist doesn't exist");
        }
        Song song = new Song(artistId, title, genre, releaseYear, language);
        songs.put(song.getSongId(), song);
        Artist artist = artists.get(artistId);
        artist.releaseSong(song);
        return song;
    }

    public void printArtists(){
        for (Artist artists : artists.values()) {
            System.out.println(artists.getArtistId() + ", "+ artists.getName());
        }
    }
}