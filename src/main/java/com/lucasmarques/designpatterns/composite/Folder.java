package com.lucasmarques.designpatterns.composite;

import java.util.List;

public class Folder implements FileSystem {

    private String name;
    private List<? extends FileSystem> files;

    public Folder(String name, List<? extends FileSystem> files) {
        this.name = name;
        this.files = files;
    }

    public String printFormatted() {
        StringBuilder result = new StringBuilder(this.name);
        result.append("\n");
        for (FileSystem file : files) {
            result.append("  ").append(file.printFormatted()).append("\n");
        }
        return result.toString();
    }

}
