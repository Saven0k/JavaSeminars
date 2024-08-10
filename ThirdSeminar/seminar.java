
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class seminar{
    public static void main(String[] arg){

        List<Integer> list = new ArrayList<>();
        FillSpisok(list);
        OutPutSpisok(list);

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
}
