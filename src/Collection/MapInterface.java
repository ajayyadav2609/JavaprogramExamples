package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "FirstName");
		map.put(2, "MiddleName");
		map.put(3, "LastName");
		
		System.out.println(map);
		
		System.out.println(map.entrySet());
		
		
		
		System.out.println("Iterting map***");
		
		for(Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey() +":" + m.getValue());
		}
		

	}

}
