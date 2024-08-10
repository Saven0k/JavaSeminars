// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;
public class ex1dz{
    public static void main(String[] arg){
        LinkedList linklist = new LinkedList<>();
        linklist.add("X");
        linklist.add("e");
        linklist.add("n");
        linklist.add("o");
        for (int index = 0; index < linklist.size(); index++) {
            System.out.print(linklist.get(index));
        }
        System.out.println(" ");
        for (int i = linklist.size()-1; i > -1; i--) {
            System.out.print(linklist.get(i));   
        }

    }
}