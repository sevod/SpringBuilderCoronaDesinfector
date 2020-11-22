package com.sevod;

public class CoronaDisinfector {

    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

    public void start (Room room){
        announcer.announce("Начинаем дезинфекцию, все вон!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Рискните зайти обратно");
    }

    private void disinfect(Room room){
        System.out.println("Зачитывается молитва: корона ИЗЫДИ!");
    }
}
