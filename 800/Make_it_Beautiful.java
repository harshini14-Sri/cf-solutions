import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean allEqual = true;
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    allEqual = false;
                    break;
                }
            }

            if (allEqual) {
                System.out.println("NO");
                continue;
            }

            Arrays.sort(a);

            System.out.println("YES");

            // print max first
            System.out.print(a[n - 1] + " ");

            // then remaining elements
            for (int i = 0; i < n - 1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}