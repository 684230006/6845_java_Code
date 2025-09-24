package Loop;
import java.util.Scanner;
public class W10_03_Taxi {
    public static void main(String[] args) {
System.out.println("=========== INPUT ===========");

        Scanner kb = new Scanner(System.in);

System.out.print("Customer Name : ");
String Name = kb.nextLine();

System.out.print("Distance (km): ");
double Distance = kb.nextDouble();

System.out.print("Rate per km (Baht): ");
double km = kb.nextDouble();

System.out.println("========== OUTPUT ===========");
double sum=(Distance*km);

System.out.println("Customer Name : "+Name);
System.out.println("KM X Rate : "+Distance+" x "+km+" = "+sum+" Baht");
int Base=35;

System.out.println("Base Fare : "+Base+" Baht");
System.out.println("-----------------------------------");

double TOTAL=Base+(Distance*km);
System.out.println("TOTAL FARE   :"+TOTAL+" Baht");
System.out.println("=====================================");

kb.close();

    }
}
