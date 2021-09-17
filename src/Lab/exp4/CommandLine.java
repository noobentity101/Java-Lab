package Lab.exp4;

public class CommandLine {

    public static void main(String[] args) {

        int ans = 0;

        int n1;

        int n2;

        n1 = Integer.parseInt(args[0]);

        n2 = Integer.parseInt(args[1]);

        ans = n1 + n2;

        System.out.println(ans);


    }
}
