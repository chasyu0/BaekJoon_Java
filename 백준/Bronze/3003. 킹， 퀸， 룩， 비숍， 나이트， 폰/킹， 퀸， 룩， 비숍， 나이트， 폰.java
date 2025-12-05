import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 킹, 퀸, 룩, 비숍, 나이트, 폰
		int k = 1; 
		int q = 1;
		int r = 2;
		int b = 2;
		int kn = 2;
		int pw = 8;
		
		// 입력받기
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int rock = sc.nextInt();
		int bishop = sc.nextInt();
		int knight = sc.nextInt();
		int pawn = sc.nextInt();
		
		// 선언된 수 - 입력 받은 수 
		int diff = k - king; 
		int diff2 = q - queen;
		int diff3 = r - rock;
		int diff4 = b - bishop;
		int diff5 = kn - knight;
		int diff6 = pw - pawn;

		//출력
		System.out.println(diff);
		System.out.println(diff2);
		System.out.println(diff3);
		System.out.println(diff4);
		System.out.println(diff5);
		System.out.println(diff6);
		
		sc.close();
		}
	}
