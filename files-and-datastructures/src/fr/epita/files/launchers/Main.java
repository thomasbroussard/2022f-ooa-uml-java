package fr.epita.files.launchers;

import fr.epita.files.services.MyLogger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        File wd = new File(".");
        System.out.println(wd.getAbsolutePath());
//        outputToLog("./test.csv", "test,from,file\n");



        //outputToLog("./my.log", logLine);
        MyLogger testLogger = new MyLogger("./my.log", Main.class.getName());
        testLogger.info("test from main!");

        //2014/05/31 - 10:06:14.795 : fr.tbr.iamcore.Main.main()[19] : [INFO] Beginning of the program
        Files.rea
    }


}