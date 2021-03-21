package lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class Exercise1 {
	public static List getValues(HashMap map) {
        List values = new ArrayList();
        for(Object o: map.values()) {
            values.add(o);
        }
        Collections.sort(values);
        return values;
    }
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");
        map.put("Key1", "Value4");  //Override value of Key1
        map.put("Key4", "Value1"); 
        List res = getValues(map);
        for(Object o:res) {
            System.out.println(o.toString());
        }
	
	}

}
