import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        boolean isPalindrome = true;
        
        for(int i=0; i<S.length()/2; i++) {
            if(S.charAt(i) != S.charAt(S.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
            
            if(isPalindrome) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        sc.close();
    }
}