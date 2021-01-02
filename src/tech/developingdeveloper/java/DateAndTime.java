package tech.developingdeveloper.java;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;


//Input: 08 05 2018 or today's date

public class DateAndTime {
    //Method #2 (in.abhisheksaxena.Java 8)
    private static String getDay(int day, int month, int year){
        LocalDate localDate = LocalDate.of(year, month, day);
        LocalDate dt = LocalDate.now(ZoneId.systemDefault());
        System.out.println("dt: " + dt.getDayOfWeek());
       return localDate.getDayOfWeek().toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int monthInt = Integer.parseInt(scanner.next());
        int day = Integer.parseInt(scanner.next());
        int year = Integer.parseInt(scanner.next());
        System.out.println(getDay(day, monthInt, year));

        //Method #1 (in.abhisheksaxena.Java 7)
        Month month = Month.of(monthInt-1);
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
        String days[] = dfs.getWeekdays();
        Calendar calendar = new GregorianCalendar(Locale.US);
        //noinspection MagicConstant
        calendar.set(year, month.getValue(), day);
        System.out.println("Day of the week: " + days[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase());
    }
}
