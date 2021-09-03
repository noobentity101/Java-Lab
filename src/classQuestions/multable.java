package classQuestions;
import java.util.Scanner;
import java.util.Arrays;

public class multable {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner sc = SCANNER;
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int[] arr= new int[10];
        for(int i=0; i < 10; i++)
            arr[i] = (i+1) * num;
            // System.out.println(num+" * "+i+" = "+num*i);
        System.out.println(Arrays.toString(arr));
        }
}

