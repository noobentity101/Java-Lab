package Lab.exp8;

class H{
    H(){
        System.out.println("Constuctor of Class H");
    }
}

interface I{
    void print();
}

class J  extends H implements I{
    J(){
        super();
        System.out.println("Constructor of class J");
    }

    @Override
    public void print() {
        System.out.println("Inside Interface H");
    }
}

public class multiple {
    public static void main(String[] args) {

        J ob1=new J();
        ob1.print();
    }
}