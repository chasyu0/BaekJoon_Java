import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++) {
            String quiz = sc.next();
            int sum = 0;
            int total = 0; 
            
            for(int j=0; j<quiz.length(); j++) {
                if(quiz.charAt(j) == 'O') {
                    sum++;
                    total += sum;
                } else {
                    sum = 0;
                }
            }
                System.out.println(total);
            }
            sc.close();
        }
    }