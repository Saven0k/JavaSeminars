// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class ex1dz{
    public static void main (String[] args){
        int sum = 0;
        int product = 1;
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int n = iScanner.nextInt();
        if (n < 0) System.out.println("Число отрицательное не походит");
        for(int i = 1; i<=n; i++){
            sum += i;
            product *=i;
        }
        System.out.println("Сумма от 1 до " + n + " = " + sum);
        System.out.println("!" + n + " =  " + product);
    
    }
}