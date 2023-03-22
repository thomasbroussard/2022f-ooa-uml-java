package fr.epita.tutorials.launchers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String test = "   test-some-features   ";

//        methodOnStringParameter(test);

        
        //with java.util.Date

        Date date = new Date();
        System.out.println(date.getTime());

        Date anotherDate = new Date();
        System.out.println(date.after(anotherDate));

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        try {
            Date parsedDate = formatter.parse("21/03/2023 10:35:11.555");
            System.out.println(parsedDate.getTime());
            System.out.println(formatter.format(date));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        //with java.time
        LocalDateTime dateTime = LocalDateTime.of(2023, 03, 21, 10, 35, 11, 1000000);

        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
        String formattedString = dateTimeFormatter.format(dateTime.atZone(ZoneId.systemDefault()).toLocalDateTime());
        System.out.println(formattedString);



    }

    private static void methodOnStringParameter(String test) {
        if (test == null){
            System.out.println("the string was null");
            return;
        }
        System.out.println(test.isEmpty());
        System.out.println(test.length());
        //é =>  É
        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());
        System.out.println(test.trim());
        System.out.println(test.replace("-", "@"));
        System.out.println(test.replaceAll("[-]", ""));
        System.out.println(test.split("-").length);


        int i = Integer.parseInt("10");

        String s = String.valueOf(i);


        StringBuilder sb = new StringBuilder();
        sb.append("I want this string to be displayed ")
                .append(i)
                .append(" times");
        String formatted = "I want this string to be displayed " + i + " times";

        System.out.println(sb);
        System.out.println(formatted);

        String fakeInputFromNetwork = "{}";
        byte[] bytes = fakeInputFromNetwork.getBytes();

        String readString = new String(bytes);


    }
}