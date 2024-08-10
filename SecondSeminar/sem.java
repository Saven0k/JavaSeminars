import java.util.Scanner;

public class sem{
    public static Scanner  iScanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter number: ");
        int N = iScanner.nextInt();
        String c1 = "Oleg";
        String c2 = "Vasya";
        String res = "";
        for(int i = 0; i < N; i++){
            if (i % 2 == 0){
                res+=c1;
            }
            else{
                res+=c2;    
            }
        }
        System.out.println(res);
    }
}
