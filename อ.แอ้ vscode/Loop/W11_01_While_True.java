package Loop;

import java.util.Scanner;

public class W11_01_While_True {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        //System.out.print("Enter Number: ");
        //int num = kb.nextInt();
        
        
while(true) {     
        //No.1เขียนโปรแกรมรับจัวเลขจากคีย์บอร์ดไปเรื่อยๆ จนกระทั่งเบอร์ 9 จึงจะออกจากโปรกแกรม   
//System.out.print("Enter Number: ");
   //int num = kb.nextInt();
 // if(num == 9) {  //ตัวคำสั่งที่ใช้ตรวจสอบการออกจากลูป
   // break; // คำสั่งที่ใช้ในการออกจากลูป
               // }
                
         //   }
 //No.2เขียนโปรแกรมรับจัวเลขจากคีย์บอร์ดไปเรื่อยๆ จนกระทั่ง E จึงจะออกจากโปรกแกรม
            
    System.out.print("Enter Number: ");
    String tex = kb.nextLine();
    
    if(tex.equals("E")) { 
    break;
            
        }

    }
}
}