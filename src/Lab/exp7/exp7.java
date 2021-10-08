package Lab.exp7;

class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

    Person(int umar, String naam) {
        name = naam;
        age = umar;
    }
}

class Student extends Person {
    Student(int umar, String naam, int roll, String b) {
        super(umar, naam);
        rollno = roll;
        branch = b;
    }

    int rollno;
    String branch;

    void display() {
        super.display();
        ;
        System.out.println("Roll No: " + rollno + "\nBranch: " + branch);
    }
}

class Employee extends Person {
    Employee(int umar, String naam, int Ecn, String Dj) {
        super(umar, naam);
        Ecno = Ecn;
        Doj = Dj;
    }

    int Ecno;
    String Doj;

    void display() {
        super.display();
        System.out.println("EC no.: " + Ecno + "\nDate of joining: " + Doj);
    }
}

class Faculty extends Employee {
    Faculty(int umar, String naam, int Ecn, String Dj, String D) {
        super(umar, naam, Ecn, Dj);
        desig = D;
    }

    String desig;

    void display() {
        super.display();
        System.out.println("\nDesignation: " + desig);
    }
}

class Staff extends Employee {
    Staff(int umar, String naam, int Ecn, String Dj, String D) {
        super(umar, naam, Ecn, Dj);
        desig = D;
    }

    String desig;

    void display() {
        super.display();
        System.out.println("\nDesignation: " + desig);
    }
}

public class exp7 {
    public static void main(String[] args) {

        Staff ob1 = new Staff(25, "Mohan", 8001, "12/07/2000", "Clerical");
        Faculty ob2 = new Faculty(35, "Jeetu", 1001, "22/06/2003", "Professor");
        Employee ob3 = new Employee(40, "Arjun", 4001, "10/08/2009");
        Student ob4 = new Student(18, "Titiksha", 23, "CSE");
        Person ob5 = new Person(23, "Nidhi");

        System.out.println("Class Staff\n");
        ob1.display();
        System.out.println("Class Faculty\n");
        ob2.display();
        System.out.println("Class Employee\n");
        ob3.display();
        System.out.println("Class Student\n");
        ob4.display();
        System.out.println("Class Person\n");
        ob5.display();

    }
}
