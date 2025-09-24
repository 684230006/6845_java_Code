import java.util.Scanner;
public class W07_02_square_root {
    public static void main(String[] args) {
    System.out.print("กรุณากรอกตัวเลข :");
        Scanner kb = new Scanner(System.in);
// Input: prompt the user for anumber
        Double x =kb.nextDouble();

//Process: calculate the square root of the number

double squareRoot = Math.sqrt(x);

if(x > 0) {
// output the square root of the number
//System.out.println(squareRoot);
System.out.println("square Root of "+x+" is "+squareRoot);
//System.out.print(Math.sqrt(x)); ฉันทำเอง
        }else {
            System.out.println("Error: กรอกเลขจำนวน+เท่านั้น");
        }
    }
}
