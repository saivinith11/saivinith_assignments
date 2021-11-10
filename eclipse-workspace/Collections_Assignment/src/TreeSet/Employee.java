package TreeSet;

public class Employee implements Comparable<Employee> {
	int employeeid;
	String employeename;
	int employeedept;
	long employeesal;

    Employee(int employeeid,String employeename,int employeedept,long employeesal)
    {
    	this.employeeid=employeeid;
    	this.employeename=employeename;
    	this.employeedept=employeedept;
    	this.employeesal=employeesal;
    }

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeeid = employeeid;
	}

	public int getEmployeedept() {
		return employeedept;
	}

	public void setEmployeedept(int employeedept) {
		this.employeedept = employeedept;
	}

	public long getEmployeesal() {
		return employeesal;
	}

	public void setEmployeesal(long employeesal) {
		this.employeesal = employeesal;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeedept="
				+ employeedept + ", employeesal=" + employeesal + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.employeename.compareTo(o.employeename);
	}
    

}
