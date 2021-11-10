package Remaining_sol;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddLength {

	public static void main(String[] args) {
	   List<String> al= new ArrayList<String>();
	   al.add("vinith");
	   al.add("andru");
	   al.add("monu");
	   al.add("akshu");
	   System.out.println(al);
	   for (String string : al) {
			System.out.println(string);
	   }
	   al.removeIf(a->(a.length()%2!=0));
	   System.out.println("elements in the list removing odd length are:");
	   for (String string : al) {
			System.out.println(string);
	   }
	   

	}

}
