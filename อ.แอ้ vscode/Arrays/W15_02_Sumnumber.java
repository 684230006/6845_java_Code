package Arrays;
import java.util.Scanner;

public class W15_02_Sumnumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a [] = new double[5];   
        
        //nunber form kb
        for (int i=0; i<a.length ; i++) {
            System.out.print("Enter Number "+(i+1)+" : ");
            a[i] = kb.nextDouble();
        }
        double sumeven = 0;
        double sum = 0;
        double sumOdd = 0;
        double average =0;
        double max =a[0];
        double min =a[0];

        System.out.println("Show all Number");
        for(int i=0 ; i<a.length ; i++) {
            System.out.println("index ["+i+"] "+" value :"+ sum +a[i]);
            sum += a[i];

            if(a[i]% 2 != 0) {
            sumOdd += a[i];
        }else{
            sumeven += a[i];
        }if(a[i] > max){
             max = a[i];
        }if(a[i] < min){
            min = a[i];
        }

        




        System.out.println("Sum of all number= "+sum);
        System.out.println("Sum of Odd number= "+sumOdd);
        System.out.println("Sum of even number= "+sumeven);
        System.out.println("Odd+even = "+(sumOdd+sumeven));
        System.out.println("average = "+sum/a.length);
        System.out.println("Max number"+max);
        System.out.println("Min Number"+min);
    kb.close();
    }
    }}
