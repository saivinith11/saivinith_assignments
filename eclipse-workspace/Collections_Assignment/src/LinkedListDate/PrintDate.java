package LinkedListDate;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class PrintDate {

	public static void main(String[] args) {
		List<LocalDate> li=new LinkedList<>();
		li.add(LocalDate.of(2000,Month.APRIL,22));
		li.add(LocalDate.of(2001,Month.MARCH,15));
		li.add(LocalDate.of(2002,Month.SEPTEMBER,20));
		li.add(LocalDate.of(2003,Month.MAY,18));
		li.add(LocalDate.of(2004,Month.JUNE,21));
		li.add(LocalDate.of(2005,Month.DECEMBER,30));
		System.out.println(li);
		for(LocalDate l:li)
		{
		 if(l.isLeapYear())
		 {
			System.out.println("Your date of birth is:"+l+"it was a leap year");
		 }
		 else {
			 System.out.println("Your date of birth is:"+l+"it was not a leap year");
		 }
		}

	}

}
