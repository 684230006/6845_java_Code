package Loop;

import java.util.Random;
import java.util.Scanner;

public class W13_01_GuessNumber {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random ra  =  new Random();

        int answer = ra.nextInt(10)+1; 

        //System.out.println("Ramdom Number is generated : "+answer);     
        boolean win = false;
        int i=0;

            while (i<3) { 
            System.out.print("กรุณากรอกตัวเลข :");
            int x = kb.nextInt();

            if(answer==x){
                System.out.println("=======================");
            System.out.println("เก่งจังพี่ ทายถูกได้ไง");
            win = true;
            break;
            }else{
                System.out.println("ผิดไอน้อง ใส่ใหม่");
                System.out.println("===========อ่อน===========");
            } i++;

        }
        if(win==false)
        System.out.println("อ่อนจัดไปเล่นใหม่ ตอบ "+answer+(" ต่างหาก"));
    
        kb.close();
    }


}

