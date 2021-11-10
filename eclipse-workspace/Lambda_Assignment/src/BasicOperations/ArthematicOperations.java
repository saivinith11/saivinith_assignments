package BasicOperations;
interface Addition{
	int add(int a ,int b);
}

interface Subtraction{
	int sub(int a,int b);
}

interface Multiply{
	int mul(int a,int b);
}

interface division{
	int div(int a,int b);
}

public class ArthematicOperations {

	public static void main(String[] args) {
		System.out.println("Addition:");
		Addition Add=(a,b)->(a+b);
		System.out.println(Add.add(20,30));
		
		System.out.println("subtraction:");
		Subtraction Sub=(a,b)->(a-b);
		System.out.println(Sub.sub(30,20));
		
		System.out.println("Multiplication:");
		Multiply Mul=(a,b)->(a*b);
		System.out.println(Mul.mul(10,5));
		
		System.out.println("Division:");
		division Div=(a,b)->(a/b);
		System.out.println(Div.div(10, 2));
		

	}

}
