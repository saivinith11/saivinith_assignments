package StringOperations;

public class Performoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println("str1:"+str1);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.replace('a','$'));
		System.out.println(str1.contains("collection"));
		System.out.println(str1.equals("java string pool refers to collection of strings which are stored in heap memory"));
	}

}
