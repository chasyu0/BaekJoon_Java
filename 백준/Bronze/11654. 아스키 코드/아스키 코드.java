import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char alphabet = sc.nextLine().charAt(0);
        int num = (int)alphabet;
        
        System.out.println(num);
        sc.close();
    }
}