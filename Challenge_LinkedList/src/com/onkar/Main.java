package com.onkar;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Loved","Tamizh");
        album.addSong("Uyire",4.2);
        album.addSong("Master Title",4.2);
        album.addSong("Polakattum Para Para",4.2);
        album.addSong("Wake Me Up",4.2);
        albums.add(album);

        album = new Album("EDM","AVICII");
        album.addSong("The Nights",5.0);
        album.addSong("Waiting For Love",4.3);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You Can't do it right",playList);
        albums.get(0).addToPlayList("Hole",playList);
        albums.get(0).addToPlayList("Speed King",playList);
        albums.get(0).addToPlayList(3,playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now Playing "+listIterator.next().toString());
        }
    }


}
