import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        int[] time = {
                3,3,3, 
				4,4,4,
				5,5,5,
				6,6,6,
				7,7,7,
				8,8,8,8,
				9,9,9,
				10,10,10,10
        };
        
        int sum = 0;
        
        for(int i=0; i<S.length(); i++) {
            sum += time[S.charAt(i) - 'A'];
        }
        
        System.out.println(sum);
        sc.close();
    }
}