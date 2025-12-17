import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[26];    
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;    
        }
        
        String S = sc.nextLine();
        
        for(int i=0; i<S.length(); i++) {
            char word = S.charAt(i);
            
            if(arr[word - 'a'] == -1){
                arr[word - 'a'] = i;
            }
        }
        
        for(int num : arr) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}