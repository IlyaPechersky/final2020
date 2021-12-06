package com.itp.final2020;

public class Container<T> extends AbstractContainer<T> {

    Container() {
    }

    Container(T content) {
        this.content = content;
    }

    public String toString() {
        return content.toString();
    }
}
