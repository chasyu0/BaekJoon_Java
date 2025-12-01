import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer( S , " ");
        
        //분리된 토큰 개수
        int n = st.countTokens();
        System.out.println(n);
        sc.close();
    }
}