
import java.util.Scanner;

public class W09_02_BMI{
public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

System.out.print("น้ำหนัก ");

double weight = kb.nextDouble();

System.out.print("ส่วนสูง");

double height = kb.nextDouble();


double bmi = weight / (height/100*height/100);

System.out.println("BMI ของคุณเท่ากับ"+ String.format("%.2f",bmi));

if(bmi>40){
System.out.println("โรคอ้วน LV3");
}else if (bmi>=35) {
    System.out.println("โรคอ้วน LV2");
}else if (bmi>=30) {
    System.out.println("โรคอ้วน LV1");
}else if (bmi>=25) {
    System.out.println("น้ำหนักเกิน");
}else if (bmi>=18.5) {
    System.out.println("ปกติ");
}else{
System.out.println("ผอม");
}
kb.close();
}


}


// สูตรคำนวณ BMI
// BMI น้ำหนัก (กก.) / ส่วนสูง (ม.) * ส่วนสูง(ม.)
