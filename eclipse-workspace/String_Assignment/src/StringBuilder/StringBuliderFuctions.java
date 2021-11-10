package StringBuilder;

public class StringBuliderFuctions {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("String buffer");
		sb.append("is a peer class of string");
		sb.append("that provides much of");
		sb.append("the functionality of strings");
		System.out.println(sb);
		sb.insert(7,"insert text");
		System.out.println(sb);
		System.out.println(sb.reverse());
		

	}

}
