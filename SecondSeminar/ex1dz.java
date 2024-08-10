// ) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
// Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class ex1dz {
    public static void main(String[] args){
        Map<String,String> arr = new HashMap<String,String>();
        
        arr.put("name", "Oleg");
        arr.put("counntry", "Russia");
        arr.put("city", "Moscow");
        arr.put("age", null);
        
        String namep = arr.get("name");
        String countryp = arr.get("counntry");
        String cityp = arr.get("city");
        String agep = arr.get("age");
        String str1 = "select * from students where ";
        // String str = "select * from students where 'name':'"+namep+"','country':'"+ countryp+"','city':'"+cityp+"','age':'"+agep+"'";
        if(namep != null) str1 += "'name':'"+ namep +"'";
        else str1 = str1;
        if(countryp != null) str1 +=  ",'country':'"+ countryp;
        else str1 = str1;
        if(cityp != null) str1 += ",'city':'"+cityp;
        else str1 = str1;
        if(agep != null) str1 += ",'age':'"+agep+"'";
        else str1 = str1;
        System.out.println(str1);
        }



}

