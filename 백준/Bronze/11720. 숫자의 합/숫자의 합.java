import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String s = sc.next();
        
        int sum = 0;
        for(int i=0; i<N; i++) {
            sum += s.charAt(i)-'0'; //문자 -> 숫자로 변환
        }
        
        System.out.println(sum);
        sc.close();
    }
}