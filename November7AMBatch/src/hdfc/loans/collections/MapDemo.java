package hdfc.loans.collections;

import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(100, 100);
		h.put(2, 200);
		h.put(101, 300);
		h.put(15, 200);
		h.put(4, 400);
		
		System.out.println(h);
		System.out.println(h.get(10));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		Set<Integer> keys = h.keySet();
		for(Integer key :keys)
		{
			System.out.println(key + "----" +h.get(key));
		}

	}

}
