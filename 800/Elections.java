import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x = 0, y = 0, z = 0;

        if (a > b && a > c) {
          x = 0;
        } else {
          x = Math.max(b, c) - a + 1;
        }

        if (b > a && b > c) {
          y = 0;
        } else {
          y = Math.max(a, c) - b + 1;
        }

        if (c > a && c > b) {
          z = 0;
        } else {
          z = Math.max(a, b) - c + 1;
        }

        System.out.println(x + " " + y + " " + z);    
        
      }
    }
}