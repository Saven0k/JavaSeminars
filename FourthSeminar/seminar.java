import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
public class seminar{
    public static void main(String[] arg){
        Scanner iScanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            String line = iScanner.nextLine();
            stack.push(line);
            queue.add(line);
        }
        System.out.print(stack);
        System.out.println(queue);
       
    }
}