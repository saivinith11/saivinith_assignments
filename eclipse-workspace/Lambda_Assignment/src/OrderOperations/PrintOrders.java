package OrderOperations;
interface orders{
	void result(int price,String status);
}
public class PrintOrders {

	public static void main(String[] args) {
		orders myorders=(price,status)->{
			if(price>1000)
			{
				if(status=="ACCEPTED"||status=="COMPLETED")
				{
					System.out.println("order printed");
				}
			}
			else
			{
			System.out.println("order not printed");	
			}
		};
		myorders.result(6000,"COMPLETED");
		myorders.result(15000,"ACCEPTED");
		myorders.result(900,"ACCEPTED");

	}

}
