package COLLECTIONS;

import java.util.PriorityQueue;

public class priority_queue {

	public static void main(String[] args) {
		PriorityQueue p =new PriorityQueue();
		p.add("Ali");
		p.add("Ali");
		p.add("nikki");
		p.add("mani");
		p.add("sree");
		p.add("brahmi");
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
	}
}
