package com.itp.final2020;

public abstract class AbstractContainer<T> implements InterfaceContainer {

    T content;

    @Override
    public void show() {
        System.out.println(content.toString());
    }
}
