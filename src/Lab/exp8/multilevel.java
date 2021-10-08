package Lab.exp8;

class A {
    A() {
        System.out.println("Constuctor of Class A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Constructor of class B");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("Constructor of class C");
    }
}

public class multilevel {
    public static void main(String[] args) {
        C ob1 = new C();
    }
}