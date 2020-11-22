package com.sevod;

public class ConsoleAnnouncer implements Announcer {
    public void announce(String message) {
        System.out.println(message);
    }
}
