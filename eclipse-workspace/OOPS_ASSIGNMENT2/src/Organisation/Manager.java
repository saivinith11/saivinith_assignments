package Organisation;

public class Manager extends Employee{
	int incentive=6000;
	void salary()
	{
		int sal;
		sal=25000+incentive;
		System.out.println("salary of manager"+sal);
	}

}
