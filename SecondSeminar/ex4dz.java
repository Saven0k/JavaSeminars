// 4) К калькулятору из предыдущего дз добавить логирование.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex4dz{
    public static void main (String[] args){
    Scanner iScanner = new Scanner(System.in);
    
    String systemEncoding = "UTF-8";
    System.out.print("Привет, это калькулятор, если хочешь что посчитать вводи число 1, если выйти напиши 0 ");
    int temp = iScanner.nextInt();
    try(FileWriter fw = new FileWriter("1.txt"))
    {
       
        while (temp != 0) {
            System.out.print("Введи первое число: ");
            int FirstNumber = iScanner.nextInt();
            fw.write("Пользователь ввел первое число " + FirstNumber +"\n" );

            System.out.print("Теперь введи второе число : ");
            int SecondNumber = iScanner.nextInt();
            fw.write("Пользователь ввел второе число " + SecondNumber +"\n" );

            System.out.print("Теперь введи арифмитическую операцию ( + - * / ): ");
            char Operation = iScanner.next().charAt(0);
            fw.write("Пользователь ввел операцию" + Operation +"\n" );

            if (Operation == '+'){
               System.out.println("Сумма равна " + (FirstNumber + SecondNumber));
               fw.write("Сумма равна " + (FirstNumber + SecondNumber)+"\n");} 

            else if (Operation == '-'){
                System.out.println("Разность равна " + (FirstNumber - SecondNumber));   
                fw.write(("Разность равна " + (FirstNumber - SecondNumber)+"\n"));}

            else if (Operation == '*'){
                System.out.println("Произведение равно " + (FirstNumber * SecondNumber));
                fw.write("Произведение равно " + (FirstNumber * SecondNumber)+"\n");}
            
            else if (Operation == '/'){
                System.out.println("Частное равно " + (FirstNumber / SecondNumber));
                fw.write("Частное равно " + (FirstNumber / SecondNumber)+"\n");}

            else {
                System.out.println("Такого знака я не знаю");
                fw.write("Такого знака я не знаю"+"\n");}
            System.out.print("продолжить вводи число 1, если выйти напиши 0 ");
            int temp1 = iScanner.nextInt();
            if (temp1 == 1) continue;
            else break; 
        }
        System.out.println("Пока");
    }
    catch(IOException ex){
             
        System.out.println(ex.getMessage());
    }
    

}
}