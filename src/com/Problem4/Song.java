package com.Problem4;

import java.util.Objects;

public class Song {
    String movieName;
    String songName;

    public Song(String movie, String song) {
        this.movieName = movie;
        this.songName = song;
    }

    //Manual methods
    public void play() {
        System.out.println(songName + " of "+ movieName + " is playing...!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(movieName, song.movieName) && Objects.equals(songName, song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, songName);
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
