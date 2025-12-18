import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        int sum = 0;
        
        for(int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
            sum += arr[i] * arr[i];
        }
        
        System.out.println(sum%10);
    }
}