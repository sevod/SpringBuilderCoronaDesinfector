package com.sevod;

public interface Config {
    <T> Class<? extends T> getImpClass(Class<T> ifc);
}
