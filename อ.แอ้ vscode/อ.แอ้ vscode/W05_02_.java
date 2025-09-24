
import java.util.Scanner;
public class W05_02_{
    public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.print("entter a");
    int a = kb.nextInt();
    System.out.print("entter b");
    int b = kb.nextInt();
    System.out.println("entter c");
    int c = kb.nextInt();

    System.out.println("Before enter a ="+a);
    System.out.println("Before enter b ="+b);
    System.out.println("Before enter c ="+c);


     int temp = a;
     a = b;
     b = c;
     c = temp;

    System.out.println("After enter a ="+a);
    System.out.println("After enter b ="+b);
    System.out.println("After enter c ="+c);


    int x = 6;
    System.out.println(x-- + ++x - --x - x-- + x++ + x);

double   s = 1.6, e = 5.1;
    System.out.println(s % 4);

    }


 }
