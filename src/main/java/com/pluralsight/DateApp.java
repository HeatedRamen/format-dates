package com.pluralsight;

import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class DateApp {
    public static void main(String[] args) {

        ZonedDateTime timeNow = LocalDateTime.now().atZone(ZoneId.systemDefault());

        DateTimeFormatter firstFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(timeNow.format(firstFormatter));

        DateTimeFormatter secondFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(timeNow.format(secondFormatter));

        DateTimeFormatter thirdFormatter = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        System.out.println(timeNow.format(thirdFormatter));

        // GMT time
        DateTimeFormatter fourthFormatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy\tHH:mm")
                                     .withZone(ZoneId.of("GMT"));
        System.out.println(timeNow.format(fourthFormatter));

        // Central Time
        DateTimeFormatter fifthFormatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy\tHH:mm")
                                     .withZone(ZoneId.of("America/Chicago"));
        System.out.println(timeNow.format(fifthFormatter));

    }

}
