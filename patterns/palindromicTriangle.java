import java.util.*;

public class palindromicTriangle {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter the value of n");
            int n = in.nextInt();
            for(int i=1; i<=n; i++) {

                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }

                for(int j=i; j>=1; j--) {
                    System.out.print(j);
                }

                for(int j=2; j<=i; j++) {
                    System.out.print(j);
                }

                System.out.println("");
            }
            in.close();
        }
        
}
