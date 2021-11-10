package TreeMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Contact c1=new Contact(889774919,"vinith","saivinithravula@gmail.com");
		Contact c2=new Contact(944099294,"anirudh","anirudhsunny@gmail.com");
		Contact c3=new Contact(765992502,"monu","monutatipally@gmail.com");
		
		
		TreeMap<Long,Contact> mp= new TreeMap<Long,Contact>(Collections.reverseOrder());
		
		mp.put((long) 8897749191L,c1);
		mp.put((long) 944099294,c2);
		mp.put((long) 765992502,c3);
		
	    Set<Entry<Long,Contact>> entryset=mp.entrySet();
		Iterator<Entry<Long,Contact>> iterator=entryset.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Long,Contact> entry=(Map.Entry<Long,Contact>) iterator.next();
			long Long=entry.getKey();
			Contact con=entry.getValue();
			System.out.println(Long);
			System.out.println(con);
			//System.out.println(entry);//
			System.out.println(entry);
		}

	}

}
