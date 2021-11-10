package Enumeration;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratordemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
    System.out.println(al);//[1,2,3,4]
    Iterator itr=al.iterator();
    while(itr.hasNext())
    {
     Integer I=(Integer)itr.next();
     if(I%2==0)
    	 System.out.println(I);
     else 
    	 itr.remove();
	}
    System.out.println(al);
	}
}
