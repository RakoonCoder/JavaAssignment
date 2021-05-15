package Assignment_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q7 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
        map.put(1,"Rita");
        map.put(2,"Sita");
        map.put(3,"Mita");
        List<String> list1=new ArrayList<String>(map.values());
        List<Integer> list2=new ArrayList<Integer>(map.keySet());
        StringBuilder sb=new StringBuilder();
        for(String s:list1){
            sb.append(s);
        }
        for(Integer s1:list2){
            sb.append(s1);
        }
        System.out.println(sb.toString());

	}

}
