// Вывести все простые числа от 1 до 1000
public class ex2dz{
    public static void main (String[] args){
        for (int i = 2; i <= 1000; i++) {
            Boolean isPrime = i > 2;
            for (int j = 2; j < i; j++) {
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                  }
            if(isPrime)
                    System.out.println(i);
                  }
        
    }
}