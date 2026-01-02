import java.util.*;

public class Main {
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();       
        int[] stack = new int[N];
        int size = 0; 
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++) {
            String number = sc.next();
            
        switch(number) {
            case "push": int x = sc.nextInt();
                stack[size++] = x;
                break;
            
           // pop: 가장 위에 있는 정수 출력, 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력.
            case "pop": if(size == 0) {
                sb.append(-1).append('\n');
            } else {
                sb.append(stack[--size]).append('\n');
            } break;
            
            // 스택에 들어있는 정수의 개수를 출력
            case "size": sb.append(size).append('\n');
                break;
           
            // empty: 스택이 비어있으면 1, 아니면 0을 출력
            case "empty": sb.append(size == 0 ? 1 : 0).append('\n'); 
                break;
           
           // 스택의 가장 위에 있는 정수를 출력. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력
           case "top": if(size == 0) {
					sb.append(-1).append('\n');
				} else {
				sb.append(stack[size -1]).append('\n');
				}
				break;
                }       
        }
            System.out.println(sb.toString()); // 마지막 한번만 출력
		    sc.close();
        }
    }
