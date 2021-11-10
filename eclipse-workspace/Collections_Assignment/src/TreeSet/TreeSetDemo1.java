package TreeSet;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"vinith",105,15000);
		Employee e2=new Employee(2,"monu",106,14000);
		Employee e3=new Employee(3,"anirudh",107,17000);
		Employee e4=new Employee(4,"karthik",108,18000);
		Employee e5=new Employee(5,"akshu",109,10000);
		
		Employee e6=new Employee(6,"anush",110,12000);
		Employee e7=new Employee(7,"ravula",111,20000);
		Employee e8=new Employee(8,"deepu",112,19000);
		Employee e9=new Employee(9,"vicky",113,13000);
		Employee e10=new Employee(10,"raghu",114,21000);
		
		TreeSet<Employee> ts=new TreeSet<Employee>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		ts.add(e7);
		ts.add(e8);
		ts.add(e9);
		ts.add(e10);
		System.out.println(ts);
	}

}
