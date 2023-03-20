import java.util.*;

class rectPattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the vertical matrix value");
    int v = in.nextInt();
    System.out.println("enter the horizontal matrix value");
    int h = in.nextInt();
    for(int i = 1; i<=v; i++) {
      for(int j = 1; j<=h; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }    
  }
}