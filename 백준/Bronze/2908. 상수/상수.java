import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 숫자 -> 문자
		StringBuilder sbA = new StringBuilder(String.valueOf(A)); 
		StringBuilder sbB = new StringBuilder(String.valueOf(B));
		sbA.reverse();
		sbB.reverse();
		
		// 문자 -> 숫자
		int reverseA = Integer.parseInt(sbA.toString());
		int reverseB = Integer.parseInt(sbB.toString());
		
		if(reverseA>reverseB) {
			System.out.println(reverseA);
		} else {
			System.out.println(reverseB);
		}
		
		sc.close();
		}
	}