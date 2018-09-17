package com.lucasmarques.designpatterns.composite;

public class File implements FileSystem {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String printFormatted() {
        return this.name;
    }

}
