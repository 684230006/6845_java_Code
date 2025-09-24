package Loop;
import java.util.Scanner;
import javax.swing.text.JTextComponent;
public class W11_04_doWhile_True_ChooseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//โจทย์: เขียนโปรเแกรมให้ผู้ใช้เลือกเมนู
//ถ้าเลือก1 ให้บอกเลข 2 จำนวน
//ถ้าเลือก2 ให้ลบเลข 2 จำนวน
//ถ้าเลือก3 ให้ออกจากโปรแกรม
//==========================================      
// แสดงข้อความรับตะวเลข 2 จำนวน



//==========================================
//แสดงเมนูเพื่อรับ choice
System.out.println("=======================");
System.out.println("Menu:");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Exit");
System.out.println("========================");

int choice;

do { 
    
    System.out.print("Enter you choice: ");
    choice = kb.nextInt();
    System.out.println("========================");
    
    switch(choice){
        case 1 :
        
        System.out.print("กรุณากรอกตัวเลขที่ 1 :");
        int x = kb.nextInt();
        System.out.print("กรุณากรอกตัวเลขที่ 2 :");
        int y = kb.nextInt();
        int sum = x + y;
        System.out.print("Addition Result : "+ sum );
        break ;//ออกจากswitchcase
        
        case 2 :
        
        System.out.print("กรุณากรอกตัวเลขที่ 1 :");
        x = kb.nextInt();
        System.out.print("กรุณากรอกตัวเลขที่ 2 :");
        y = kb.nextInt();
        sum = x-y ;
        System.out.print("Subtraction Result: "+(x-y));
        break ;
        
        case 3 :
        System.out.print("Exit the program. Goodbey");
        break ;
        
        default :
        System.out.println("There is no such option, little brother.");
        System.out.println("===========================");   
    }break ;

    if(choice=1) {
    break;
    }else if(choice == 2) {
    break;
    }else if(choice == 3) {
    break;
    }else {
        System.out.println("There is no such option, little brother.");
        System.out.println("===========================");
} while(choice!=3);






kb.close();
}
}
}