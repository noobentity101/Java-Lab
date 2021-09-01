package Stack;
import java.util.Scanner;

// public class StackClient {

//     public static void main(String[] args) throws Exception{
//         // TODO Auto-generated method stub

//         Stack s = new Stack(4);

//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);

//         s.display();

//         s.pop();
//         s.pop();

//         s.display();

//     }

// }

// Added a menu driven interface
public class StackClient
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer Stack ");
        int n = scan.nextInt();


        Stack s = new Stack(n);

        char ch;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");

            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 :
                System.out.println("Enter integer element to push");
                try {
                    s.push( scan.nextInt() );
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;

            case 2 :
                try {
                    System.out.println("Popped Element = " + s.pop());
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;

            case 3 :
                try {
                    System.out.println("Peek Element = " + s.peek());
                }
                catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;

            default :
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
            s.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        // closing the scanner object
        scan.close();
    }
}
