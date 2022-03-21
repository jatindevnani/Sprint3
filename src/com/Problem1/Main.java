package com.Problem1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            //Current date
            LocalDate currentDate = LocalDate.now();

            System.out.println("Enter a date in format dd/MM/yyyy");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            //Accepting the date from the user
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            //Entered date in LocalDate
            LocalDate dob = LocalDate.parse(input, dtf);

            //Checking if the date is in the future
            if(currentDate.compareTo(dob) < 0) {
                System.out.println("Date of birth should not be in future");
                return;
            };

            //Calculating the birthdate of the user
            Period period = Period.between(dob, currentDate);
            System.out.println("You are:");
            System.out.println(period.getYears() + " Years, " + period.getMonths() + " Months & " + period.getDays() + " Days Old.");

        } catch (Exception e) {
            System.out.println("please pass the date in the proper format");
        }
    }
}
