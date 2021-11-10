package Remaining_sol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StringDemo {

	public static void main(String[] args) {
	StringBuilder sb= new StringBuilder();
	Consumer<String> letter=(s)->
	{
		sb.append(s.charAt(0));
	};
	List<String> al=new ArrayList<String>();
	al.add("vinith");
	al.add("andru");
	al.add("sriker");
	al.add("monu");
	System.out.println(al);
	for(Iterator iterator=al.iterator();iterator.hasNext();)
	{
		String string=(String)iterator.next();
		letter.accept(string);
	}
    System.out.println(sb);
	}

}
