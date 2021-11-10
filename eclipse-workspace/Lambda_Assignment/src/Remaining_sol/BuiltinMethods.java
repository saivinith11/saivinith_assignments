package Remaining_sol;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltinMethods {

	public static void main(String[] args) {
		Supplier<Double> randomvalue=()->Math.random();
		Consumer<Integer> display=(i)->System.out.println(i);
		Predicate<Integer> greaterthan=(i)->(i>50);
		Function<Integer,Double> half=(i)->i/2.0;
		System.out.println(randomvalue.get());
		
		System.out.println("printing Consumer");
		display.accept(500);
		
		System.out.println(greaterthan.test(60));
		
		System.out.println(half.apply(200));

	}

}
