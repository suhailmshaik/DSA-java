import java.util.*;

public class zeroOneTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = in.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                int c = i+j;
                if(c%2==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
    
}
