package Lab.exp4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySearchButWithBufferReader {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter the size of array : ");


        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];

        System.out.println("Enter Elements of the array : ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int j : arr) {

            System.out.print(j + " ");
        }

        System.out.println();

        System.out.println("Enter element you want to search : ");

        int item = Integer.parseInt(reader.readLine());


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
