package com.Problem4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creation of playlist object
        PlayList playList = new PlayList();

        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while(count <= 4) {
            System.out.println("Enter details of Song " + count + ":");

            System.out.print("Movie name: ");
            String movie = scanner.nextLine().trim();

            System.out.print("Song name: ");
            String song = scanner.nextLine().trim();

            playList.addSong(new Song(movie, song));

            //Asking the user to re-enter details of the song if the song was already in the playlist
            if(playList.songs.size() != count) {
                System.out.println("Please re-enter details of Song " + count + "\n");
                continue;
            }

            System.out.println();
            count++;
        }

        //Playing the songs one by one
        for(Song song: playList.songs) {
            song.play();
        }

    }
}
