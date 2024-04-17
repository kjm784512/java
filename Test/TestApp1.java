package s21210_00;

import java.util.Scanner;
import java.util.Stack;

public class TestApp1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt(); // 스택의 수를 입력
      int[]A = new int[N]; // 입력된 수만큼 배열 생성
      for (int i =0;i<N; i++ ) {
         A[i] = sc.nextInt();
      }
      Stack<Integer> stack = new Stack<>(); // 스택 생성
      StringBuffer bf = new StringBuffer(); // 스트링 버퍼 생성
      int num = 1; // 오름차순
      boolean result = true;
      
      for (int i = 0; i < A.length; i++) {
         int su = A[i];
         if (su >= num) {
            while (su >= num) {
               stack.push(num++);
                  bf.append("+\n");
               
            }
            stack.pop();
            bf.append("+\n");
         } else {
            int n = stack.pop();
            if (n > su) {
               System.out.println("NO");
               result = false;
               break;
            } else {
               bf.append("-\n");
            }
         }
      }
      if (result) System.out.println(bf.toString());
      
   }

}
