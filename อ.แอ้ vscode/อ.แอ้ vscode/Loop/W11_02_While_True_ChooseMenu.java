package Loop;
import com.sun.jdi.DoubleValue;
import java.util.Scanner;
public class W11_02_While_True_ChooseMenu {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//โจทย์: เขียนโปรเแกรมให้ผู้ใช้เลือกเมนู
//ถ้าเลือก1 ให้บอกเลข 2 จำนวน
//ถ้าเลือก2 ให้ลบเลข 2 จำนวน
//ถ้าเลือก3 ให้ออกจากโปรแกรม
//==========================================      
// แสดงข้อความรับตะวเลข 2 จำนวน
System.out.print("กรุณากรอกตัวเลขที่ 1 :");
int x = kb.nextInt();
System.out.print("กรุณากรอกตัวเลขที่ 2 :");
int y = kb.nextInt();



//==========================================
//แสดงเมนูเพื่อรับ choice
System.out.println("=======================");
        System.out.println("Menu:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Exit");
        System.out.println("========================");

        
while (true) { 
System.out.print("Enter you choice: ");
int choice = kb.nextInt();

int sum = x + y;

System.out.println("========================");

if(choice == 1) {
System.out.print("Addition Result : "+ sum);

break;
}else if(choice == 2) {
System.out.print("Subtraction Result: "+(x-y));
break;
}else if(choice == 3) {
System.out.print("Exit the program. Goodbey");
break;
}else {
    System.out.println("There is no such option, little brother.");
    System.out.println("===========================");
}


}



    
}
}