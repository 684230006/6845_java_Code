
import java.util.Scanner;

public class W09_01_CalculareGrade {
 public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);

System.out.println("ใส่คะแนน");

double score = scanner.nextDouble();

//ตรวจสอบว่าตะแนน อยู้ใน 0-100
if(score >= 0 && score <= 100){
//เปรียบเทียบคะแนนและแสดงเกรด
    if(score>=80) {
System.out.println("A");
}else if(score>=70){
    System.out.println("B");
}else if(score>=60){
    System.out.println("C");
}else if(score>=50){
    System.out.println("D");
}else {
    System.out.println("F");}

}else{
    System.out.println("error");

scanner.close();

  }
}
}