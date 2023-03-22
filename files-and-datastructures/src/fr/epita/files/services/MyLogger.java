package fr.epita.files.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyLogger {


    private final String loggerName;
    private final String filePath;

    public MyLogger(String filePath, String loggerName) {
        this.filePath = filePath;
        this.loggerName = loggerName;
    }

    public String formatMessage(String message, String level) {
        String datePart = "";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        datePart = formatter.format(new Date());
        return datePart + ":" + loggerName + ": [" + level + "] " + message;
    }

    public void log(String message) {

    }

    public void info(String message) {
        String line = formatMessage(message, "INFO");
        try {
            outputToLog(filePath, line);
        } catch (Exception ignored) {
        }
    }



    public void warn(String message) {

    }

    public void error(String message) {

    }

    public void debug(String message) {

    }

    private static synchronized void outputToLog(String pathname, String logLine) throws IOException {
        File logFile = new File(pathname);
        Files.writeString(logFile.toPath(), logLine + "\n",
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
}
