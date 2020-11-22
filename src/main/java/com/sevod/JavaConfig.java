package com.sevod;

import org.reflections.Reflections;

import java.util.Set;


public class JavaConfig implements Config {

    private Reflections scanner;

    public JavaConfig(String packageToScan) {
        this.scanner = new Reflections(packageToScan);
    }

    public <T> Class<? extends T> getImpClass(Class<T> ifc) {
        Set<Class<? extends T>> classes = scanner.getSubTypesOf(ifc);
        if(classes.size() != 1){
            throw new RuntimeException(ifc + "hes 0 or more than one impl");
        }
        return classes.iterator().next();
    }
}
