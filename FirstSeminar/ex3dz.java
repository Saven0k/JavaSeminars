// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)
import java.util.Scanner;

import javax.lang.model.element.TypeElement;
public class ex3dz{
    public static void main (String[] args){
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Привет, это калькулятор, если хочешь что посчитать вводи число 1, если выйти напиши 0 ");
    int temp = iScanner.nextInt();
    while (temp != 0) {
        System.out.print("Введи первое число: ");
        int FirstNumber = iScanner.nextInt();
        System.out.print("Теперь введи второе число : ");
        int SecondNumber = iScanner.nextInt();
        System.out.print("Теперь введи арифмитическую операцию ( + - * / ): ");
        char Operation = iScanner.next().charAt(0);
        if (Operation == '+') System.out.println("Сумма равна " + (FirstNumber + SecondNumber));
        else if (Operation == '-') System.out.println("Разность равна " + (FirstNumber - SecondNumber));
        else if (Operation == '*') System.out.println("Произведение равно " + (FirstNumber * SecondNumber));
        else if (Operation == '/') System.out.println("Частное равно " + (FirstNumber / SecondNumber));
        else System.out.println("Такого знака я не знаю");
        System.out.print("продолжить вводи число 1, если выйти напиши 0 ");
        int temp1 = iScanner.nextInt();
        if (temp1 == 1) continue;
        else break; 
    }
    System.out.println("Пока");
    }

}