package sldjfrnf;
import java.util.Scanner;

public class YootMap1024 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String[] m = {    "▣","ㅇ", "ㅇ", "ㅇ", "ㅇ",
                        "▣","ㅇ", "ㅇ", "ㅇ", "ㅇ",
                        "▣","ㅇ", "ㅇ", "ㅇ", "ㅇ",
                        "▣","ㅇ", "ㅇ", "ㅇ", "ㅇ"    , ""    };
       
        printMap(m);
        String p1_name = "찌민";
        int p1_pos = 0;
       
        while(true) {
            System.out.print("몇칸 이동할래?  ");
           
            p1_pos = p1_pos + sc.nextInt();
           
            if(p1_pos > 20 ) {
                System.out.println("골인~~");
                break;
            } else if(p1_pos == 20) {
                m[0] = p1_name;
            } else {
                m[p1_pos] = p1_name;
            }
           
            printMap(m);
        }
       
    }

    private static void printMap(String[] mParameter) {
        System.out.println("===========================================");
        System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \n",
                mParameter[10],mParameter[9],mParameter[8],mParameter[7],mParameter[6],mParameter[5]);
        System.out.println();System.out.println();
        System.out.printf("%s \t \t \t \t \t %s \n", mParameter[11],mParameter[4]);
        System.out.println();System.out.println();
        System.out.printf("%s \t \t \t \t \t %s \n", mParameter[12],mParameter[3]);
        System.out.println();System.out.println();
        System.out.printf("%s \t \t \t \t \t %s \n", mParameter[13],mParameter[2]);
        System.out.println();System.out.println();
        System.out.printf("%s \t \t \t \t \t %s \n", mParameter[14],mParameter[1]);
        System.out.println();System.out.println();
        System.out.printf("%s \t %s \t %s \t %s \t %s \t %s \n",
            mParameter[15],mParameter[16],mParameter[17],mParameter[18],mParameter[19],mParameter[0]);
        System.out.println("===========================================");        
        System.out.println();System.out.println();        
    }

}
