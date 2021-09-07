package classQuestions;

public class BoxQuestion {

    public static void main(String[] args) {

        Box box1 = new Box(22, 33, 44);

        Box box2 = new Box(10.9,33.333,56.6966);

        Box box3 = new Box(55.6);

        Box box4 = new Box();


        double vol1 = box1.volume();
        double vol2 = box2.volume();
        double vol3 = box3.volume();

        System.out.println("The volume of box1 is :" + vol1);
        System.out.println("The volume of box2 is :" + vol2);
        System.out.println("The volume of box3 is :" + vol3);

    }
}

class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d){ // constructor used when all is given

        width = w;
        height = h;
        depth = d;
    }

    Box(){ //constructor used when details are not specified

        width = -1;
        height = -1;
        depth = -1;

    }

    Box(double len){ // when box is cube

       width = depth = height = len;

    }

    double volume() {
        return width * height * depth;
    }

}
