package com.sevod;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

public class CoronaDisinfector {

    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public CoronaDisinfector() throws FileNotFoundException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
    }

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
