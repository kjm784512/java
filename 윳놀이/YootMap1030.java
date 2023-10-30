package sldjfrnf;

import java.util.Scanner;

public class YootMap1030 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String[] m = {    "▣","ㅇ", "ㅇ", "ㅇ", "ㅇ",
                        "▣","ㅇ", "ㅇ", "ㅇ", "ㅇ",
                        "▣","ㅇ", "ㅇ", "ㅇ", "ㅇ",
                        "▣","ㅇ", "ㅇ", "ㅇ", "ㅇ", ""    };
        
        
        String[] p1 = { "","", "", "", "",
                		"","", "", "", "",
                		"","", "", "", "",
                		"","", "", "", "", ""    };
        
        
        String[] p2 = { "","", "", "", "",
                		"","", "", "", "",
                		"","", "", "", "",
                		"","", "", "", "", ""    };
       
        printMap(m ,p1 ,p2);
        String p1_name = "찌민";
        int p1_pos = 0;
        
        printMap(m ,p1 ,p2);
        String p2_name = "ㄹㅇㅋㅋ";
        int p2_pos = 0;
       
        while(true) {
        	System.out.print("몇칸 이동할래?  ");
        	p1_pos = move(p1, p1_name, p1_pos, sc.nextInt());
            printMap(m, p1, p2);
            
        	System.out.print("몇칸 이동할래?  ");
        	p2_pos = move(p2, p2_name, p2_pos, sc.nextInt());
            printMap(m, p1, p2);
        }
       
    }

    private static int move(String[] p, String p_name, int p_pos, int 칸) {
        p[p_pos] = "";
        
        p_pos = p_pos + 칸;
       
        if(p_pos > 20 ) {
            System.out.println("골인~~");
            System.exit(0);
        } else if(p_pos == 20) {
            p[0] = p_name;
        } else {
            p[p_pos] = p_name;
        }
        
        return p_pos;
		
	}

	private static void printMap(String[] m, String[] p1, String[]p2) {
        System.out.println("===========================================");
        System.out.printf("%2s%2s%2s  %2s%2s%2s  %2s%2s%2s  %2s%2s%2s  %2s%2s%2s  %2s%2s%2s \n",
                p1[10],m[10],p2[10],p1[9],m[9],p2[9],p1[8],m[8],p2[8],p1[7],m[7],p2[7],p1[6],m[6],p2[6],p1[5],m[5],p2[5]);
        System.out.println();System.out.println();
        System.out.printf("%2s%2s%2s \t \t \t \t \t  %2s%2s%2s \n", 
        		p1[11],m[11],p2[11],p1[4],m[4],p2[4]);
        System.out.println();System.out.println();
        System.out.printf("%2s%2s%2s \t \t \t \t \t  %2s%2s%2s \n", 
        		p1[12],m[12],p2[12],p1[3],m[3],p2[3]);
        System.out.println();System.out.println();
        System.out.printf("%2s%2s%2s \t \t \t \t \t  %2s%2s%2s \n", 
        		p1[13],m[13],p2[13],p1[2],m[2],p2[2]);
        System.out.println();System.out.println();
        System.out.printf("%2s%2s%2s \t \t \t \t \t  %2s%2s%2s \n", 
        		p1[14],m[14],p2[14],p1[1],m[1],p2[1]);
        System.out.println();System.out.println();
        System.out.printf("%2s%2s%2s  %2s%2s%2s  %2s%2s%2s  %2s%2s%2s  %2s%2s%2s  %2s%2s%2s \n",
        		p1[15],m[15],p2[15],
        		p1[16],m[16],p2[16],
        		p1[17],m[17],p2[17],
        		p1[18],m[18],p2[18],
        		p1[19],m[19],p2[19],
        		p1[0],m[0],p2[0]);
        System.out.println("===========================================");        
        System.out.println();System.out.println();        
    }

}
