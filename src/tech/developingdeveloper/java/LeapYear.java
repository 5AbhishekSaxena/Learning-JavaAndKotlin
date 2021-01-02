package tech.developingdeveloper.java;

import java.util.Scanner;

/**
 * @author Abhishek Saxena
 * @since 04/08/19 12:25 PM
 */

class LeapYear {

    private static boolean checkLeapYear(int year){
        if(year%4 == 0){
            return (year % 100 != 0) || year % 400 == 0; // not sure
            /*if( year%100 == 0)
                return year%400 == 0;
            else
                return true;*/
        }
        else
            return false;
    }
    public static void main(String[] args) {
        int year;
        System.out.print("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        //System.out.println();
        System.out.println(year + " is " + (checkLeapYear(year) ?  "" : "not ") + "a leap year");

    }
}
