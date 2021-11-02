package Incometax;
import java.io.*;
import java.util.*;
import java.lang.Math;
public class IncomeTaxCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tax=0.0;
		System.out.println("Enter your salary (per annum): ");
		double salary=sc.nextDouble();
		System.out.println("Enter your salary (per annum): "+salary);
		if((salary > 0) && (salary < 180000))
		{			
		tax=0.0;		
		}
		else if((salary > 181001.00) && (salary < 300000.00))
		{
			tax=salary*(0.1);
		}
		else if((salary > 300001.00) && (salary < 500000.00))	
		{	
		tax=salary*(0.2);	
		}		
		else if((salary > 500001.00) && (salary < 1000000.00))		
		{			
		tax=salary*(0.3);		
		}		
		System.out.println("The income tax amount need to be paid is " +tax);
	}
}
