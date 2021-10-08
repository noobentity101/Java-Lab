package Lab.exp8;

class D {
    D() {
        System.out.println("Constuctor of Class D");
    }
}

class E extends D {
    E() {
        super();
        System.out.println("Constructor of class E");
    }
}

class F extends D {
    F() {
        super();
        System.out.println("Constructor of class F");
    }
}

class hierarchical {
    public static void main(String[] args) {
        F ob1 = new F();
        E ob2 = new E();
    }
}