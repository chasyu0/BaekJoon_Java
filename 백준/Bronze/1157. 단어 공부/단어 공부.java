import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        String S = sc.next().toUpperCase();
		char[] arr = S.toCharArray();
		
		// Character, String> 타입의 HashMap 생성 
		Map<Character, Integer> Alphabet = new HashMap<>();
		
		for (char c : arr) {
			Alphabet.put(c, Alphabet.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        char result = '?';

        for (char key : Alphabet.keySet()) {
            int value = Alphabet.get(key);

            if (value > max) {
                max = value;
                result = key;
            } else if (value == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}