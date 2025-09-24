import java.util.Scanner;
public class W03_01_Area_of_Triangle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //สร้างอ๊อปเจกต์ ้เพื่อรับข้อมูลจากผู้ใช้
        
// Input base and height of Triangle

        System.out.print("Enter height = "); // แสดงข้อความให้ผู้ใช้ป้อนฐานของรูปสามเหลี่ยม
        int height = kb.nextInt(); //รับค่าฐานจากผู้ใช้ที่กรอกผ่านคีย์บอร์ดเป็นจำนวนเต็ม
        
        System.out.print("Enter base = ");
        int base = kb.nextInt();
        
        Double area = 0.5 * base* height;  // หรือใส่ชนิดข้อมูลเป็น float ก็ได้
        
        System.out.println("Area of Triangle = "+area);
        
kb.close();  //ปิดอ็อปเจกต์ Scanner เพื่อนป้องกันการรั่วไหลของทรัพยากร
// Calculate area of Trianhle
    }
}

