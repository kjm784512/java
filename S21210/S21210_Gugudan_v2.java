package s21210_00;

import java.util.Random;
import java.util.Scanner;

public class S21210_Gugudan_v2 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int x, y;
        Random ran = new Random();
        
        if (args.length != 0) {
           x = Integer.parseInt(args[0]);
        } else {
           x = Math.abs(ran.nextInt() % 9) + 1;
        }
//        
        y = Math.abs(ran.nextInt() % 9) + 1;
        int num = x * y;
        
        System.out.println();
        System.out.println("* 구구단 " + x + "단에 대한 문제입니다");
        System.out.println();
        System.out.print(x + " * " + y + " = ");
        int result = scn.nextInt();
        if (result == num)
        {
            System.out.println("맞았습니다!");
            System.out.println("입력된 데이터는 아래와 같습니다");
        }
        else
        {
            System.out.println("틀림");
        }
    }
}
