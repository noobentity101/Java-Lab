package Lab.exp5;

public class polymorphism {

    public static void main(String[] args) {

        A obj = new A();
        A obj1 = new A(34, 56);
        A obj2 = new A(88, 100);
        B obj4 = new B(56);
        B obj5 = new B();
        B obj6 = new B(23,45,67);

        obj6.print();
        obj4.print();

        obj5.print();

        int res = obj1.add();
        System.out.println(res);

        int res1 = obj2.greater();
        System.out.println(res1);

        obj1.print();
        obj.print();
    }

}

class B extends A {

    int c;

    B() {
        super();
        c = 0;
    }

    B(int c) {
        super.a = 20;
        super.b = 30;
        this.c = c;
    }

    B(int a, int b, int c) {
        super.a = a;
        super.b =b;
        this.c = c;

    }

    void print() {
        super.print();
        System.out.println("c " + c);
    }

}

class A {

    int a;
    int b;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public A() {

    }

    int add() {

        return a + b;
    }

    int greater() {
        return Math.max(a, b);
    }

    void print() {
        System.out.println("a= " + a + ",b= " + b);
    }
}

