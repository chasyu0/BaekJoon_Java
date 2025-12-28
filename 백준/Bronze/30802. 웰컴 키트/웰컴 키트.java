import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();	//참가자의 수
		
		int[] size = new int[6];	//사이즈 선언
		
		for(int i=0; i<6; i++) {
			size[i] = sc.nextInt();
		}
		
		int T = sc.nextInt();	// 티셔츠 한 묶음당 T장
		int P = sc.nextInt();	// 펜 한 묶음당 P자루
			
		int TshirtBundles = 0;	// 티셔츠의 묶음수
		
		for(int i=0; i<6; i++) {
			TshirtBundles += (size[i] + T - 1)/T;	// 올림 나눗셈으로 필요한 묶음 수
		}
		
		int PenBundle = N / P;	// 펜 묶음 개수
		int PenSingle = N % P;	// 펜 낱개 개수
				
		System.out.println(TshirtBundles);
		System.out.println(PenBundle + " " + PenSingle);
		
		sc.close();
		
			}	
		}
   
