import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[8];
        
        for(int i=0; i<8; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean asc = true;
        boolean desc = true;
        
        for(int i=0; i<8; i++) {
            if(arr[i] != i+1) asc = false;
            if(arr[i] != 8-i) desc = false;
        }
        
        if(asc) System.out.println("ascending");
        else if(desc) System.out.println("descending");
        else System.out.println("mixed");
        
        sc.close();
    }
}