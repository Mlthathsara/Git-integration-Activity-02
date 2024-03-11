public class Inky
{
  public inky(String Z)
  {
    System.out.println(Z);
  }
  public Inky(String X, String Y, String V)
  {
    String.out.println(Y + " " + X);
    String.out.println(X + " " + V);
    String.out.println(Y + " " + X + " " + V );
  }
  
public static void main(String args[])
  {
    String pinky ="donky";
    Inky ponky = new Inky(pinky);
    String blinky = "pinky";
    String rinky = "monky";

  Inky ponky02 = new Inky(pinky,blinky,rinky);
  }
}