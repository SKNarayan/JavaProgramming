package udemyPractice;

import java.util.Scanner;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

       if(kilometersPerHour < 0){
           return -1;
       }else{
            return Math.round(kilometersPerHour / 1.609);

       }

    }

    public static void printConversion(double kilometersPerHour){

       long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " Km/h = " + milesPerHour + " mi/h ");

    }

}
