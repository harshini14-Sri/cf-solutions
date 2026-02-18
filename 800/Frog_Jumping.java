import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++){
        long a=sc.nextInt();
        long b=sc.nextInt();
        long k=sc.nextInt();
        
        long odd=(k+1)/2;
        long even=k/2;
        long sum=odd*a-even*b;
        
        
        System.out.println(sum);
      }
    }
}