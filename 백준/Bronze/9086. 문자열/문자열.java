import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		
		for (int i = 0; i < T; i++) {
            String text = sc.nextLine().trim(); // 공백 제거
            if (text.length() >= 1) {
                char first = text.charAt(0);
                char last = text.charAt(text.length() - 1);
                System.out.println(first +""+ last);
            }
		}
            sc.close();
	}
}
	