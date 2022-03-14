package com.company.MusicLibrary.entites;

public class Song {


    public static int counter=1;
    private int songId;
    private int artistId;
    private String title;
    private String genre;
    private int releaseYear;
    private String language;
    private int totalListens;

    public Song(int artistId, String title, String genre,
                int releaseYear, String language) {
        this.artistId = artistId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.language = language;
        this.totalListens = 0;
        this.songId = counter;
        counter++;
    }

    public int getSongId() {
        return songId;
    }

    public int getArtistId() {
        return artistId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getLanguage() {
        return language;
    }

    public int getTotalListens() {
        return totalListens;
    }

    public void markPlayed(){
        totalListens++;
    }
}