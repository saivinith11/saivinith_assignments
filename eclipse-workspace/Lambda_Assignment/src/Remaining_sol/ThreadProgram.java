package Remaining_sol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ThreadProgram {

	public static void main(String[] args) {
		Consumer<Integer> display=(i)-> System.out.println(i);
		List<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		for(Iterator iterator= al.iterator();iterator.hasNext();)
		{
			Integer integer = (int) iterator.next();
			display.accept(integer);	
		}
		Thread lamdathread=new Thread();
		lamdathread.run();

	}

}
