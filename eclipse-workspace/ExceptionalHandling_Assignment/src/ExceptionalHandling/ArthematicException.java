package ExceptionalHandling;

public class ArthematicException {

	public static void main(String[] args) {

		int a=10;
		int b=0;int result;
		try {
	    result=a/b;
		System.out.println(result);
		}
		catch(Exception ae)
		{
			System.out.println(ae);	
		}
		System.out.println("successfully processed");

	}

}
