package Stack;

public class StackClient {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub

        Stack s = new Stack(4);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        s.pop();
        s.pop();

        s.display();

    }

}
