package com.onkar;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static LinkedList<Song> songLinkedList = new LinkedList<Song>();
    private static Scanner scanner = new Scanner(System.in);
    private static Song currentSong;

    public static void main(String[] args) {
        boolean quit = false;

        while(!quit){
            int option;
            System.out.println("Operations :\n" +
                    "1. Add Song\n" +
                    "2. Play Song\n" +
                    "3. View Song List\n" +
                    "Enter Choice : ");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    quit = true;
                    break;
                case 2:
                    addSong(songLinkedList);
                    break;
                case 3:
                    playSong(songLinkedList);
                    break;
                case 4:
                    viewSongList(songLinkedList);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

     public static boolean addSong(LinkedList<Song> songLinkedList){
        System.out.println("Enter song name : ");
        String songTitle = scanner.nextLine();
        System.out.println("Enter song duration : ");
        float songduration = scanner.nextFloat();
        songLinkedList.add(new Song(songTitle,songduration));
        System.out.println(songTitle+" succesfully added");
        return true;
    }

    public static void playSong(LinkedList<Song> songLinkedList){
        viewSongList(songLinkedList);
        System.out.println("Enter song name from the above song list : ");
        String choice = scanner.nextLine();

        ListIterator<Song> listIterator = songLinkedList.listIterator();
        while (listIterator.hasNext()){
            Song toBePlayed = listIterator.next();
            if(toBePlayed.getSongTitle().equals(choice)){
                System.out.println("Playing "+choice);
                currentSong.setSongDuration(toBePlayed.getSongDuration());
                currentSong.setSongTitle(toBePlayed.getSongTitle());
            }
        }
        return;
    }

    public static void viewSongList(LinkedList<Song> songLinkedList){
        System.out.println();
        System.out.println("Your Songs");
        ListIterator<Song> songListIterator = songLinkedList.listIterator();
        int i = 1;

        while(songListIterator.hasNext()){
            System.out.println(i+". "+ songListIterator.next().getSongTitle());
        }
        return;
    }
}
