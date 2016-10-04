import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.simulationdemo.Person;

public class EntryPerson {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Person p = new Person("Anand",20);
		Person p2 = new Person("Amol",22);
		Person p3 = new Person("Atul",24);
		
		TreeSet<Person> persons = new TreeSet<Person>();
		persons.add(p);
		persons.add(p2);
		persons.add(p3);
		
		//System.out.println("Done, Tree Size = "+persons.size());
		
		Iterator itr = persons.iterator();
		
		while(itr.hasNext()){
			Person p1 = (Person)itr.next();
			//System.out.println(p);
		}
		
		TreeMap<Long, String> map =new TreeMap();
		
		map.put(8856034584L, "Telenor");
		map.put(9637487602L, "Airtel");
		map.put(7546674539L, "Telenor");
		
		//String v = map.get(8856034584L);
		String v = map.get(new Long(8856034584L));
		
		System.out.println(v);
		
//		Set<Entry<Long,String>> set = map.entrySet();
		Set<Map.Entry<Long,String>> set = map.entrySet();
		
		for(Map.Entry<Long, String> e :set){
			System.out.print("Key = "+e.getKey()+":");
			System.out.println("Value = "+e.getValue());
		}
		
		//next Exmpl
		
		HashMap<Integer, String> entries = new HashMap<Integer, String>();
		
		entries.put(121, "one two one");
		entries.put(null, "four one two");
		entries.put(null, "six four three");
		
		if(entries.containsKey(null))
			System.out.println(entries.get(null));
	}

}
