package fr.epita.files.launchers;

import fr.epita.files.services.MyLogger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        writeTests();

        //2014/05/31 - 10:06:14.795 : fr.tbr.iamcore.Main.main()[19] : [INFO] Beginning of the program
        List<String> strings = Files.readAllLines(Path.of("./test.csv"));
        strings.remove(0);
        for (String s : strings){
            System.out.println(s);
        }
    }

    private static void writeTests() {
        File wd = new File(".");
        System.out.println(wd.getAbsolutePath());
//        outputToLog("./test.csv", "test,from,file\n");


        //outputToLog("./my.log", logLine);
        MyLogger testLogger = new MyLogger("./my.log", Main.class.getName());
        testLogger.info("test from main!");
    }


}