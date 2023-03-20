import java.util.*;

public class halfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = in.nextInt();
        for (int i = 1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
