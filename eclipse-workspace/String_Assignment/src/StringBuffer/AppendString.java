package StringBuffer;

public class AppendString {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("String buffer");
		sb.append("is a peer class of string");
		sb.append("that provides much of");
		sb.append("the functionality of strings");
		System.out.println(sb);
		sb.insert(7,"insert text");
		System.out.println(sb);
		System.out.println(sb.reverse());
		

	}

}
