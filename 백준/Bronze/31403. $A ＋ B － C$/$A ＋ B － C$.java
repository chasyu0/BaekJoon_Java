import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        String str1 = String.valueOf(A);
        String str2 = String.valueOf(B);
        
        System.out.println(A+B-C);
        System.out.println(Integer.valueOf(str1+str2)-C);
        
        sc.close();
    }
}