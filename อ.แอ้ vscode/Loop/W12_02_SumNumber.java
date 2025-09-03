package Loop;
import java.util.Scanner;
public class W12_02_SumNumber {
    public static void main(String[] args) {
Scanner kb = new Scanner(System.in);

int X, Y;
    do{
        System.out.println("ใส่ใหม่");
        System.out.print("start");
        X = kb.nextInt();
        System.out.println("===================");
        System.out.print("stop");
        Y = kb.nextInt();
        System.out.println("===================");
        
        int sum = 0; 
        int T = 1;
        
        if (Y>X) {
            for(int J=X ; J<=Y ; J++){
                
                System.out.println("รอบที่ "+ T+" : "+sum+" + "+J+" = "+(sum+J));
                sum = sum+J;
                T++;
            }
            
            
        }else{
            System.out.println("ใส่ใหม่");
        }
    } while(X>=Y);

kb.close();

}
}

    
