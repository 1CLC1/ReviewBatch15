package review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {

        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon Fruit",5.6);
        fruitMap.put("Pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);
        //fruitMap.forEach((key,value)-> System.out.println(key+" "+value));
        // print only those elements which contain the letter a or e in their name and their price is more than 8 dollars

        fruitMap.entrySet().removeIf(entry-> (entry.getKey().contains("a")||entry.getKey().contains("e"))&&entry.getValue()>8);
        System.out.println(fruitMap);

    }
}
