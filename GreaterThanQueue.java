package queueexamples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class GreaterThanQueue {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
		  Deque<Integer> numberQueue = new ArrayDeque<>();

		  System.out.println("Enter 5 numbers:");
		  for (int i = 0; i < 5; i++) {
	            int num = scanner.nextInt();
	            if (num > 50) {
	                numberQueue.addLast(num); // Add to the end of the queue
	            }
	        }
		  
		  System.out.println("Numbers greater than 50 in the queue:");
	        while (!numberQueue.isEmpty()) {
	            System.out.println(numberQueue.pollFirst()); // Remove and print from the front
	        }


	        scanner.close();


	}

}
