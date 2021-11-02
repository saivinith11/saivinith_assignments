package Armstrongnumber;

public class ArmstrongNumberRange {

	public static void main(String[] args) {
		for(int k=100;k<=999;k++)
		{
			int n=k,r=0,s=0;
			while(n>0)
			{
				r=n%10;
				s=s+(r*r*r);
				n=n/10;
				if(k==s)
				{
					System.out.println (k + "is Armstrong number");
				}
			}
		}

	}

}
