import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<N; i++) {
            String s = sc.next();
            int[] arr = new int[26];
            boolean isGroup = true;
            
        for(int j=0; j<s.length(); j++) {
            char check = s.charAt(j);
            int idx = check - 'a';
            
            if(arr[idx]==0) {
                arr[idx]++;
            } else if (j>0 && check != s.charAt(j-1)) {
                isGroup = false;
                break;
                }
            }
            if (isGroup) count++;
        }
        
        System.out.println(count); 
        sc.close();
        }      
    }
            
             