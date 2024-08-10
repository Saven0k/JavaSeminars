// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф из этого списка.

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class ex3dz{
    public static void main(String[] arg){
        List<Integer> list = new ArrayList<Integer>();
        // Если самому задать!!!!!!!!!!!!!!!!!!!!!
        list.add(0);
        list.add(15);
        list.add(-34);
        list.add(-15);
        list.add(1987);
        list.add(5);

        //Если рандомно задать !!!!!!!!!!!!!!!
        // FillSpisok(list);
        // System.out.println("             ");
        // OutPutSpisok(list);
        // System.out.println("             ");
        MinNumber(list);
        System.out.println("             ");
        MaxNumber(list);
        System.out.println("             ");
        Average(list);
        System.out.println("             ");

    }
    // public static void FillSpisok(List<Integer> list){
    //     Random random = new Random();
    //     for (int i = 0; i < 10; i++) {
    //         int rand = random.nextInt(100);
    //         list.add(rand);
    //     }
    // }
    // public static void OutPutSpisok(List<Integer> list){
    //     list.sort(null);
    //     for (Integer integer : list){
    //         System.out.print(integer + " ");
    //     }
    // }
    public static void MinNumber(List<Integer> list){
        int min = list.get(0);
        for (Integer integer : list) {
            if (integer < min){
                min = integer;
            }
        }
        System.out.print("Минимальное число = "+min);
    }
    public static void MaxNumber(List<Integer> list){
        int max = list.get(0);
        for (Integer integer : list) {
            if (integer > max){
                max = integer;
            }
        }
        System.out.print("Максимальное число = "+max);
    }
    public static void Average(List<Integer> list){
        int sum = 0;
        int len = list.size();
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.print("Среднее арифмитическое = " + (sum/len));
    }
}
