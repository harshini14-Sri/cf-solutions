import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      int co=0,ct=0,cth=0,cf=0;
      String s=sc.next();
      //c
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
          co++;
        }
        else if(s.charAt(i)=='2'){
          ct++;
        }
        else if(s.charAt(i)=='3'){
          cth++;
        }
        else{
          cf++;
        }
      }
      
      int sum=(co*a)+(ct*b)+(cth*c)+(cf*d);
      System.out.println(sum);
      
    }
}