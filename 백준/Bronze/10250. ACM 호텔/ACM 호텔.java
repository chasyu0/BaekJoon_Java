import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		// H 높이, W 넓이, N번째 손님 
		for(int i=0; i<T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();	
	
		//층수 구하기 
		int floor = (N%H);		
		
		//호실 구하기	
		int room = (N/H+1);	
        
        //예외 처리
        if(N % H == 0) {
            floor = H;
            room = N/H;
        } else {
            floor = N%H;
            room = N/H+1;
        }
			
		System.out.println(floor + String.format("%02d", room));	
		} 
		sc.close();
    }
}