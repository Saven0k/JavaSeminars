import java.time.LocalTime;
import java.util.Scanner;
public class seminar {
    public static void main (String[] args){
        int[] arr = new int[] {3,2,1,2,3};
        System.out.println(Valing(arr));    
    }
    
    public static int[] Valing(int[] arr) {
        int val = 3;
        for(int i = 0; i < arr.length+1; i++){
            if (arr[i] == val){
                int temp = arr[i];
                arr[i] = arr[i-1-i];
                arr[i-1-i] = temp;
            }
        }
        return arr;
    }
    // public static void main (String[] args){
    //     int[] arr = new int[] {1 , 1 ,0 , 1 , 1, 1, 1};
    //     System.out.println(findOne(arr));
    // }
    // public static int findOne(int[] arr) {
    //     int count = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] == 1)
    //             count++;
    //         else if (arr[i] != 1)
    //             count = 0;   
    //     }
    //     return count;

    // }
}

        // String  encoding = System.getProperty("console.encoding", "cp866");
        // // LocalDateTime now = LocalDateTime.now();
        // // System.out.println(now);;
        // // System.out.println("Hello world!");
        // Scanner iScanner = new Scanner(System.in, encoding);
        // String name = iScanner.next();
        // // System.out.println(now + " " + name);
        // System.out.println(Print(name));
        // iScanner.close();
    
    // public static String Print(String name) {
    //     LocalTime now = LocalTime.now();
    //     if(now.isAfter(LocalTime.of(5, 0)) && now.isBefore(LocalTime.of(11, 59)))
    //         return "Доброе утро, " + name;
    //     else if(now.isAfter(LocalTime.of(12, 0)) && now.isBefore(LocalTime.of(17, 59)))
    //         return "Добрый день " + name;
    //     else if(now.isAfter(LocalTime.of(18, 0)) && now.isBefore(LocalTime.of(22, 59)))
    //         return "Добрый вечер " + name; 
    //     return "Доброе ночи, " + name;
    // }

