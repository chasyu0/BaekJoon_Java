import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		// N장의 카드 선택
		for(int i=0; i<N; i++) { 
			arr[i] = sc.nextInt();		
		}
		
		int maxSum = 0;
		// M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if(sum<=M && maxSum<sum) {
						maxSum = sum;
					}
				}
			}
		}
		System.out.println(maxSum);
		sc.close();
	}
}
	