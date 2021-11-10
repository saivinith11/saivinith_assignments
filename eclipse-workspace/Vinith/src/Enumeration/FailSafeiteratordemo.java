package Enumeration;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeiteratordemo {

	public static void main(String[] args) {
		Map<String,String> mp=new ConcurrentHashMap<>();
		mp.put("apple","iphone");
		mp.put("oneplus","nord");
    Set<String> KeySet =mp.keySet();
    Iterator<String> itr=KeySet.iterator();
    while(itr.hasNext()) {
    	String S=itr.next();
    	mp.put("sony","xperia");
    	System.out.println(S+"\t"+mp.get(S));
    }
	}

}
