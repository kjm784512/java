package s21210_java90;

import java.util.Random;
import java.util.Scanner;

public class S21210_GugudanGame {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        int x;
        
        if (args.length == 0) {
            System.out.printf("인수 입력하세요");
             x = sc.nextInt();
        }
        else x = Integer.parseInt(args[0]);
        
        int y = Math.abs(ran.nextInt() % 9) + 1;
        int num = x * y;
        
        System.out.println("\r* 구구단 " + x + "단에 대한 문제입니다");
        System.out.printf("\r%d * %d = ", x, y);
        int result = sc.nextInt();
        
        if (result == num) System.out.println("잘했어요");
        else
        {
            System.out.println("틀렸어요.");
            System.out.println("정답은 " + num + "이에요.");
        }

    }
}
