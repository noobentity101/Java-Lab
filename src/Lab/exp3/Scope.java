package Lab.exp3;

public class Scope
{
  int num = 20;
  void m1()
  {
    int num = 30;
    System.out.println("Local number: " +num);
    System.out.println("Global number: " +this.num);
  }
public static void main(String[] args)
{
  Scope st = new Scope();
  System.out.println("\n");
  st.m1();
  System.out.println("\n");
}
}
