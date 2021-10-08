package Lab.exp8;

class o{
    o(){
        System.out.println("Constuctor of Class o");
    }

}

class s extends o{
    s(){
        super();
        System.out.println("Constructor of class s");
    }
}

public class single {

    public static void main(String[] args) {
        s ob1=new s();
    }
}