package Remaining_sol;

import java.util.ArrayList;
import java.util.List;

public class UpperCase {

	public static void main(String[] args) {
		List<String> al= new ArrayList<String>();
		al.add("vinith");
		al.add("monu");
		al.add("akshu");
		al.add("vasu");
		System.out.println(al);
		al.replaceAll(new Myoperator());
		System.out.println("elements in the list replacing with upper case:");
		System.out.println(al);

	}

}
