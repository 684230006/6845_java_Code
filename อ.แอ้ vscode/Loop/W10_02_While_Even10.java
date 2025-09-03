package Loop;

public class W10_02_While_Even10 {
    public static void main(String[] args) {
        int J =2;
int sum = 0;
while (J <= 20) {
sum=sum+J;
if(J<20){
System.out.print (J+"+");
}else
System.out.print (J+"="+sum);
    J=J+2;
        }
    }
}
