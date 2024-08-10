// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class ex2dz{
    public static void main(String[] arg){

        List<Integer> list = new ArrayList<>();
        FillSpisok(list);
        OutPutSpisok(list);
        DelEvenNum(list);

    }
    public static void FillSpisok(List<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(100); 
            list.add(rand);
        }
    }
    public static void OutPutSpisok(List<Integer> list){
        list.sort(null);
        for (Integer integer : list){
            System.out.print(integer + " ");
        }

    }
    public static void DelEvenNum(List<Integer> list){
        System.out.println("                       ");
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(new Integer[0]);
        System.out.println("                       ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] = null;
            }
        }
        for (Integer integer : arr) {
            if (integer != null){
                System.out.print(integer + " ");
            }
        }
    }
}
