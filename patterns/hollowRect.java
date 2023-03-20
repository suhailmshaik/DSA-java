import java.util.*;

class hollowRect {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number of rows");
    int row = in.nextInt();
    System.out.println("enter the number of columns");
    int col = in.nextInt();
    for(int i=1; i<=col; i++) {
      for(int j=1; j<=row; j++) {
        if(i==1 || j==1 || i==col || j==row) {
                  System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
}