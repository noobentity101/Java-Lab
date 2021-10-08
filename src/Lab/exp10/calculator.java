package Lab.exp10;

import java.util.Scanner;

class Add extends Thread {
    int a, b;

    Add(int x, int y) {
        a = x;
        b = y;
    }

    public void run() {

        System.out.println(a + b);
    }
}

class Sub extends Thread {
    int a, b;

    Sub(int x, int y) {
        a = x;
        b = y;
    }

    public void run() {

        System.out.println(a - b);
    }
}

class Mul extends Thread {
    int a, b;

    Mul(int x, int y) {
        a = x;
        b = y;
    }

    public void run() {

        System.out.println(a * b);
    }
}

class Div implements Runnable {
    float a, b;

    Div(int x, int y) {
        a = x;
        b = y;
    }

    @Override
    public void run() {

        System.out.println(a / b);
    }
}

class Power implements Runnable {
    int a, b;

    Power(int x, int y) {
        a = x;
        b = y;
    }

    @Override
    public void run() {
        System.out.println(Math.pow(a, b));
    }
}

class Rem implements Runnable {
    int a, b;

    Rem(int x, int y) {
        a = x;
        b = y;
    }

    @Override
    public void run() {
        System.out.println(a % b);
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER TWO VALUES FOR ARITHMETIC  OPERATIONS");
        int a = scn.nextInt();
        int b = scn.nextInt();
        Add ob1 = new Add(a, b);
        Sub ob2 = new Sub(a, b);
        Mul ob3 = new Mul(a, b);
        Div ob4 = new Div(a, b);
        Power ob5 = new Power(a, b);
        Rem ob6 = new Rem(a, b);
        ob1.start();
        ob2.start();
        ob3.start();
        ob4.run();
        ob5.run();
        ob6.run();
    }
}
