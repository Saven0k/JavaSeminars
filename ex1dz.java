// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// 1. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет выборку: имя ноутбука и выбранный критерий .
// Критерии фильтрации можно хранить в Map.
// Сделать выборку.
// Например:
// Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Пользователь ввел 1. Вывести в виде.
// |Имя| ОЗУ|
// |--------|-----------|
// | Asus | 2ГБ |
// | HP | 4ГБ |
// | MSI | 6ГБ |
// 2. Отфильтровать ноутбуки первоначального множества. По имени ноутбука в алфавитном порядке, по цене по убыванию
// Например, по алфавиту
// |Имя| ОЗУ| Цена
// |--------|-----------|-----------|
// | Asus | 2ГБ | 4666|
// | MSI | 4ГБ |6600|
// | HP | 6ГБ| 5555|
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Iterable;
import java.util.List;  
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;



public class ex1dz {
    public static void main(String[] args){   
        Ask();    
    }
    public static void Ask(){
        Scanner iScanner = new Scanner(System.in);
        Laptop Asus = new Laptop("Asus" , "Black" , 2 , "Windows", 5.2 ,4666 );
        Laptop MSI = new Laptop("MSI" , "Black" , 4 , "Windows", 4.6 ,6600 );
        Laptop HP = new Laptop("HP" , "Black" , 6 , "IOS", 2.7 ,5555 );
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Название\n6 - Цена");
        int cl = iScanner.nextInt();
        if (cl == 1 ){
            System.out.println("|Имя|" + "|ОЗУ|\n" +"| -----||-----|\n" +  "|"+Asus.Asusl().get(0)+" | " + Asus.Asusl().get(2) + " | \n" + "| " +  MSI.MSIl().get(0) + " | " + MSI.MSIl().get(2)  + " | \n" + "|  " + HP.hpl().get(0) +" | " + HP.hpl().get(2) + " | ");
        }
        else if (cl == 2){
            System.out.println("|Имя|" + "|Объем ЖД|" + "\n| ----- ||-----|\n" + "|"+Asus.Asusl().get(0)+" | " + Asus.Asusl().get(4) + " | \n" + "| " +  MSI.MSIl().get(0) + " | " + MSI.MSIl().get(4)  + " | \n" + "|  " + HP.hpl().get(0) +" | " + HP.hpl().get(4) + " | ");
            // System.out.println(Asus.Asusl().get(4) + MSI.MSIl().get(4) + HP.hpl().get(4));
        }
        else if (cl == 3){
            System.out.println("|Имя|" + "|Операционная система|\n"  + "| ------- ||-----|\n" + "|"+Asus.Asusl().get(0)+" | " + Asus.Asusl().get(3) + " | \n" + "| " +  MSI.MSIl().get(0) + " | " + MSI.MSIl().get(3)  + " | \n" + "|  " + HP.hpl().get(0) +" | " + HP.hpl().get(3) + " | ");
            // System.out.println(Asus.Asusl().get(3) + MSI.MSIl().get(3) + HP.hpl().get(3));
        }
        else if(cl == 4){
            System.out.println("|Имя|" + "|Цвет|\n" + "| ------ ||-----|\n" + "|"+Asus.Asusl().get(0)+" | " + Asus.Asusl().get(1) + " | \n" + "| " +  MSI.MSIl().get(0) + " | " + MSI.MSIl().get(1)  + " | \n" + "|  " + HP.hpl().get(0) +" | " + HP.hpl().get(1) + " | ");
            // System.out.println(Asus.Asusl().get(1) + MSI.MSIl().get(1) + HP.hpl().get(1));
        }
        else if (cl == 5){
            List<String> abc = new ArrayList<String>();
            abc.add(Asus.Asusl().get(0));
            abc.add( MSI.MSIl().get(0));
            abc.add(HP.hpl().get(0));
            // Collections.sort(costs , Collections.reverseOrder());
            Collections.sort(abc);

            String str = "|Имя|" + "|Цена|\n" + "| ------ ||-----|\n";
            for (String st : abc) {
                if (st.equals("Asus")){
                    str = str + "|"+Asus.Asusl().get(0)+" | " + Asus.Asusl().get(5) + " | \n";
                }
                else if (st.equals("MSI")){
                    str = str + "| " +  MSI.MSIl().get(0) + " | " + MSI.MSIl().get(5)  + " | \n";
                }
                else if (st.equals("HP")){
                    str = str + "|  " + HP.hpl().get(0) +" | " + HP.hpl().get(5) + " | \n";
                }
            }
            System.out.println(str);
        }
        else if (cl == 6){
            List<Integer> costs = new ArrayList<Integer>();
            costs.add(Integer.valueOf(Asus.Asusl().get(5)));
            costs.add(Integer.valueOf(MSI.MSIl().get(5)));
            costs.add(Integer.valueOf(HP.hpl().get(5)));
            Collections.sort(costs , Collections.reverseOrder());

            HashMap<String, Integer> costmap = new HashMap<>();
            
            costmap.put("ASUS", Integer.valueOf(Asus.Asusl().get(0)));
            costmap.put("MSI", Integer.valueOf(MSI.MSIl().get(0)));
            costmap.put("HP",Integer.valueOf(HP.hpl().get(0)));

            List<Integer> ggs = new ArrayList<Integer>();
            for (Integer itg : costmap.values()) {
                ggs.add(itg);
            }
            Collections.sort(ggs);
            int max = costs.get(0);
            String str = "|Имя|" + "|Цена|\n" + "| ------ ||-----|\n";

            for (int i = 0; i < costmap.size(); i++) {
                if (costmap.get("Asus") > max){
                    str = str +  "|"+Asus.Asusl().get(0)+" | " + Asus.Asusl().get(5) + " | \n";
                }
                else if (costmap.get("MSI") > max){
                    str = str + "| " +  MSI.MSIl().get(0) + " | " + MSI.MSIl().get(5)  + " | \n";
                }
                else if (costmap.get("HP") > max ){
                    str = str + "|  " + HP.hpl().get(0) +" | " + HP.hpl().get(5) + " | \n"; 
                }
            }
        }  
    }
}
    


    
