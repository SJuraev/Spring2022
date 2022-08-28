package practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDatesAndTimes {

    public static void main(String[] args)
    {

        //Formatting Dates and Times =>
        LocalDate date = LocalDate.of(2022, Month.JUNE, 20);
        LocalTime time = LocalTime.of(17, 32);
        System.out.println(date);
        System.out.println(time);
        System.out.println("__________________________________");

        //Parsing Dates and Times =>
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        date = LocalDate.parse("06 20 2022", formatter);
        time = LocalTime.parse("17:34");
        System.out.println(date);
        System.out.println(time);
        System.out.println("__________________________________");
        LocalDate date1 = LocalDate.parse("06 07 2022", formatter);
        LocalTime time1 = LocalTime.parse("17:37");
        System.out.println(date1);
        System.out.println(time1);



    }
}
