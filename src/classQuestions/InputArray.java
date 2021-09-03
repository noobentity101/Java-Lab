package classQuestions;

import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] arr = takeinput();
        display(arr);
        System.out.println("Enter the element to search : ");
        int item = scn.nextInt();
        int res = linearsearch(arr, item);
        System.out.println(res);

    }

    static Scanner scn = new Scanner(System.in);

    public static int[] takeinput() {
        System.out.println("SIZE?");
        int n = scn.nextInt();
        System.out.println("Enter elements of array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        return arr;

    }

    public static void display(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();

    }

    public static int linearsearch(int[] arr, int item) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {

                return i;
            }
        }
        return -1;
    }

}

