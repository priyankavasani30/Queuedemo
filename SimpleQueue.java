package queueexamples;

import java.util.*;

public class SimpleQueue {

	public static void main(String[] args) {
		
		Queue <Integer> q = new LinkedList<Integer>();
		q.add(25);
		q.add(35);
		q.offer(45);
		
		q.forEach(obj-> System.out.println(obj));
		System.out.println(q);
		
		System.out.println(q.peek());
		
		q.poll();
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
	}

}
