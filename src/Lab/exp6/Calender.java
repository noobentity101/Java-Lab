package Lab.exp6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        System.out.println("------------Calender------------");
        System.out.print("Enter the Year: ");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        int diff = 100;
        System.out.println("Showing calender from " + (year - diff) + "-" + year);
        LocalDate localDate = LocalDate.of(year - diff, 1, 1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int spaces = dayOfWeek.getValue() - 1;
        String[] months = {"January", "February", "march", "April", "may", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int y = (year - diff); y <= year; y++) {
            days[1] = 28;
            for (int m = 0; m < 12; m++) {
                if ((((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) && m == 1) { //checking for leap year
                    days[m] = 29;
                }
                System.out.println("___________________________________________________________");
                System.out.println("\t\t\t\t\t\t" + months[m] + " " + y);
                System.out.println("___________________________________________________________");
                System.out.println("\tmon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat\t\tSun\t");

                for (int i = 0; i < spaces; i++) {
                    System.out.print("\t\t");
                }
                for (int i = 1; i <= days[m]; i++) {
                    System.out.print("\t" + i + "\t");
                    if (((i + spaces) % 7 == 0) || (i == days[m])) System.out.println();
                }
                spaces = (days[m] + spaces) % 7;
                System.out.println();
            }
        }
    }
}