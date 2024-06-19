package queueexamples;
import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) 
	{
	
		Queue<String> q = new PriorityQueue<String>();
		q.add("Dog");
		q.add("Cat");
		q.add("Lion");
		q.add("Tiger");
		System.out.println(q);
		
		
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(50);
		q1.add(10);
		q1.add(100);
		System.out.println(q1);
		
		q1.poll();
		System.out.println(q1);
		
		q1.remove();
		System.out.println(q1);
		
		q1.offer(-1);
		System.out.println(q1);
	}

}
