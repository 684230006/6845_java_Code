package Loop;

import java.util.Scanner;
import javax.swing.text.JTextComponent;

public class W16_Tewit006 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int star , end  ;
        int odd = 0;
        int evene = 0;
        do {
            System.out.print("Enter start Number: ");
            star = kb. nextInt();
            System.out.print("Enter end Number: ");
            end = kb. nextInt();
            if (star  >= end) {
                System.out.println("==============Warning================");
                System.out.println("Start number must be less than end number ");
                System.out.println("Please enter again");
                System.out.println("=====================================");
            }
        } while (star >= end);
        System.out.println("=============Result=============");
        System.out.print("Show All Number : ");
        for(int i = star ; i <= end; i++){
            System.out.print(i+" ");
            
            if (i % 2 == 0) {
                evene++;
            }else{
                odd++;
            }
        }
        System.out.println(" ");
        System.out.println("Amount of Even Numbers = " +evene);
        System.out.println("Amount of Odd Numbers = "+odd);
    }  
    
} 

        
