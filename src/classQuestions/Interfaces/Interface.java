package classQuestions.Interfaces;

public interface Interface {

    void draw1();
    default void draw(){
        System.out.println("Default");
    }
    class Rectangle implements Interface{
        @Override
        public void draw1() {
        }
        public void draw(){System.out.println("drawing rectangle");}
    }
    class Circle implements Interface{
        @Override
        public void draw1() {

        }
        public void draw(){System.out.println("drawing circle");}
    }
}
