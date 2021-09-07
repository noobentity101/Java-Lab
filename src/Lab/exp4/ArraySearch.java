package Lab.exp4;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array : ");

        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements of the array : ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scn.nextInt();
        }

        for (int j : arr) {

            System.out.print(j + " ");
        }

        System.out.println();

        System.out.println("Enter element you want to search : ");

        int item = scn.nextInt();

        boolean res = search(arr, item);

        System.out.println(res);


    }

    public static boolean search(int[] array, int item) {

        boolean isFound = false;

        for (int j : array) {

            if (j == item) {

                isFound = true;
                break;
            }


        }

        return isFound;
    }


}
