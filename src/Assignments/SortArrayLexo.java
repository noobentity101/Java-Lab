package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayLexo {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scn.nextInt();
        System.out.print("Enter the names of students:");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }

        System.out.println("The names of students:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        scn.close();
    }
}