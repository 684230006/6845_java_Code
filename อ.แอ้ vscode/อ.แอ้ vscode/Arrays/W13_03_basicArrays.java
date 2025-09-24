package Arrays;

public class W13_03_basicArrays {
    public static void main(String[] args) {
        //การประกาศตัวแปรแบบ Arrays แบบที่1 ระบุสมาชิกในวงเล็บปีกกา
        //String [] animal;
        String animals[] = {"dog","cat","Lion"};
        //หาขนาดของ Arrays 
        System.out.println("animal :"+ animals.length);
        //การเข้าถึง Arrays
        System.out.println("animal :"+ animals[0]);
        System.out.println("animal :"+ animals[2]);

        int dice[] = {1,2,3,4,5,6};

        float avg[] ={3.5f,3.6f,2.0f};
        
//ใช้วนลูปแสดงสมาชิกในArray avgcore
System.out.println("Show all acerage scores : ");
for (int i = 0;i < avg.length; i++) {
    System.out.println(avg[i]);
}
//==========================================================================
        //การประกาศตัวแปรแบบ Arrays แบบที่2 ระบุขนาดของ Arrays
        
        String Colors[] = new String[4];
        Colors[2] = "red";
        Colors[0] = "Green";
        Colors[3] = "Blue";
System.out.println("Colors :"+Colors.length);
System.out.println("Colors :"+Colors[0]);
System.out.println("Colors :"+Colors[1]);

int k = 1;

for(int e=0;e<Colors.length;e++){
System.out.println("ช่อง:"+k++ +" :" +Colors[e]);

}


//==========================================================================
int scores [] = new int[5];
    scores[0] = 50;

    System.out.println("scores :"+ scores[4]);
    }
}
