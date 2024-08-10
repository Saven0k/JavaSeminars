// // Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - 
// возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;
import java.util.Queue;

import java.util.Scanner;
public class ex2dz{
    public static Scanner  iScanner = new Scanner(System.in);
    public static void main(String[] arg){
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        while(true){
            System.out.println(queue);
            System.out.println("Что вы хотите сделать ?\nenqueue - помещает элемент в конец очереди\ndequeue -  возвращает первый элемент из очереди и удаляет его\nfirst - возвращает первый элемент из очереди, не удаляя ");
            System.out.print(": ");
            String select = iScanner.nextLine();
            if (select.equals("enqueue")){
                System.out.print("Введите обьект, и мы поместим его в конец очереди  ");
                String obj = iScanner.nextLine();
                queue.add(obj);
            }
            else if(select.equals("dequeue")){
                System.out.println("Возращенный элемент(который мы удаляем) = " +queue.remove());
            }
            else if(select.equals("first")){
                System.out.println("Возращенный элемент = " + queue.peek());
            }
            else if(select.equals("")){
                break;
            }
        }
           
    }
}