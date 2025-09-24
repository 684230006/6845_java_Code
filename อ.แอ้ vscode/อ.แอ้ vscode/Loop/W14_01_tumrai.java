package Loop;

import java.util.Scanner;

public class W14_01_tumrai {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int stu = kb.nextInt();

int passed=0;
int failed =0;

        for (int i=1;i<=stu; i++) { 
            System.out.println("=====================================");
            System.out.print("Enter score for student "+ i + ": ");
            int score = kb.nextInt();

            if(score>=50){
                System.out.println("Student "+i+" : "+"Passed");
            passed++;
            
            }else{
                System.out.println("Student "+i+" : "+"Failed");
            failed++;

            }
            
        }
        System.out.println("=====================================");
        System.out.println("Number of students passed = "+passed+" persons");
        System.out.println("Number of students failed = "+failed+ " persons");
        kb.close();
    }
}