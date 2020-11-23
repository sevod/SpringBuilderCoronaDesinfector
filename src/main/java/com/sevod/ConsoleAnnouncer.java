package com.sevod;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

public class
ConsoleAnnouncer implements Announcer {
    private Recommendator recommendator = ObjectFactory.getInstance().createObject(Recommendator.class);

    public ConsoleAnnouncer() throws FileNotFoundException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
    }

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
