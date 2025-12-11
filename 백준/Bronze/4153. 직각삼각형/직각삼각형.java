import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
		
		//0 0 0이 입력되면 종료
		if(A==0 && B==0 && C==0) break;
		
		//A B C 중 배열 선언하고 최대값 구하기
		int[] arr = {A, B, C};
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int A2 = (A*A);
		int B2 = (B*B);
		int C2 = (C*C);
		int sum = (A2 + B2 + C2);
		
		if(sum - (max*max) == (max*max)) 
			System.out.println("right");
		else 
			System.out.println("wrong");	
	}
		sc.close();
		}
}