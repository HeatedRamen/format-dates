package com.pluralsight;

import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;


public class DateApp {
    public static void main(String[] args) {

        LocalDateTime timeNow = LocalDateTime.now(ZoneOffset.UTC);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(timeNow.format(formatter));

        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(timeNow.format(formatter));

        formatter = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        System.out.println(timeNow.format(formatter));

        // Local Time
        formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy\tHH:mm")
                                     .withZone(ZoneId.of("GMT"));
        System.out.println(timeNow.format(formatter));

        // GMT time
        ZonedDateTime todayCT = LocalDateTime.now().atZone(ZoneId.of("America/Chicago"));
        formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy\tHH:mm")
                                     .withZone(ZoneId.of("America/Chicago"));
        System.out.println(todayCT.format(formatter));

    }

}
