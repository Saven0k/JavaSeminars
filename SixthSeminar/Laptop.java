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
import java.util.List;
import java.util.ArrayList;


public class Laptop{
    String name;
    String color; 
    int OZY;
    String  OperatingSystem;
    double SizeGD;
    int cost;
    void PrintAll(){
        System.out.println("Ноутбук  с названием " + name + ", на нем стоит операционная система : " + 
            OperatingSystem + ", " + color + " цвета, " + " имеет " + SizeGD + " oбъем ЖД, " + " имеет "+ OZY + " озу ");
    }
    Laptop(String n, String c,  int OZ,  String  Operating, double Size, int co){
        name = n;
        color = c;
        OZY = OZ;
        OperatingSystem = Operating;
        SizeGD = Size;
        cost = co;
    }
    List<String> Asusl(){
        List<String> Asus = new ArrayList<String>();
            Asus.add("Asus");
            Asus.add("black");
            Asus.add("2");
            Asus.add("Windows");
            Asus.add("5.2");
            Asus.add("4666");
        return Asus;
    }
    List<String> MSIl(){
        List<String> MSI = new ArrayList<String>();
        MSI.add("MSI");
        MSI.add("Black");
        MSI.add("4");
        MSI.add("Windows");
        MSI.add("4.6");
        MSI.add("6600");
        return MSI;
    }
    List<String> hpl(){
        List<String> HP = new ArrayList<String>();
        HP.add("HP");
        HP.add("Black");
        HP.add("6");
        HP.add("IOS");
        HP.add("2.7");
        HP.add("5555");
        return HP;
    }
    
    
}
