import java.util.Scanner;

public class W6_bigass {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("กรอกจำนวนวินาทีทั้งหมด: ");
        int seconds =kb.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " วินาที มีค่าเท่ากับ " 
                   + hours + " ชั่วโมง " 
                   + minutes + " นาที " 
                   + remainingSeconds + " วินาที");
        kb.close();
    }
}
