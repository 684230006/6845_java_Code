import java.util.Scanner;
public class W07_03_OddEven {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
System.out.print("ใส่เลขหน่อยครับ");
int n =kb.nextInt();
//สูตรคำนวณ
int remain = n%2;

if(remain != 0) {
System.out.println("Numner "+ n + " is odd ");

}else{
 System.out.println("number"+n+"is even");
    
}
    }
}