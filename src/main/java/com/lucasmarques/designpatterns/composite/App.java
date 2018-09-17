package com.lucasmarques.designpatterns.composite;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        FileSystem flowersFolder = new Folder("flowers", Arrays.asList(new File("flower-01"), new File("flower-02"), new File("flower-03")));
        FileSystem picturesFolder = new Folder("pictures", Arrays.asList(flowersFolder, new Folder("cars", Collections.singletonList(new File("ferrari")))));

        System.out.println(picturesFolder.printFormatted());

    }

}
