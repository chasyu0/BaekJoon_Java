import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] s = { "dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z=" };
        
        String input = sc.next();
        
        for(int i=0; i<s.length; i++){
            if(input.contains(s[i])) {
                input = input.replace(s[i], "*");
            }
        }
        System.out.println(input.length());
        sc.close();
    }
}