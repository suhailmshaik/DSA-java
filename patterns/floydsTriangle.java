import java.util.*;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = in.nextInt();
        int num = 1;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println("");
        }
    }
    
}