package classQuestions;

import java.util.Scanner;

public class linSearch {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String a[]) {
        Scanner sc = SCANNER;

        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i=0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter key element: ");
        int key=sc.nextInt();

        System.out.println(key+" is found at index " + linearSearch(arr, key));
    }
}
