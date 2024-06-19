package queueexamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Rose");
		dq.add("Tulip");
		dq.add("Lotus");
		dq.add("Marigold");
		System.out.println(dq);
	
		dq.offerFirst("SunFlower");
		dq.offerLast("Habiscus");
		dq.forEach(q -> System.out.println(q));
		
		dq.pollFirst();
		dq.pollLast();
		System.out.println("after deleting ");
		dq.forEach(q -> System.out.println(q));
	}

}
