package fr.epita.files.launchers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.csv");
        Files.writeString(file.toPath(), "test,from,file\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);


    }
}