import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int sum = 0;
        int start = -1;
        
        for(int i=0; i<12; i++) {
            char c = s.charAt(i);
            int isbn = ( i % 2 == 1 ) ? 3 : 1; 
            
            if(c == '*') {
                start = i;
            } else {
                sum += (c-'0')*isbn;
            }
        }
        
        int check = s.charAt(12)-'0';
        int checknum = (start % 2 == 1) ? 3 : 1;
        
        for(int x=0; x<=9; x++) {
            if((sum + x * checknum + check) % 10 == 0) {
                System.out.println(x);
                break;
            }
        }
        sc.close();
    }
}