package com.tyss.assignment2;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
	public static void main(String[] args) {
		StackImplementation si = new StackImplementation();

		si.push(1);
		si.push(2);
		si.push(3);

		System.out.println(si.pop());
		System.out.println(si.pop());

		si.push(4);

		System.out.println(si.pop());
		System.out.println(si.pop());
		
	}
}

class StackImplementation {
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();

	public void push(int val) {
		q1.add(val);
	}

	public int pop() {
		if (q1.isEmpty()) {
			return -1;
		}

		while (q1.size() != 1) {
			q2.add(q1.remove());
		}

		int val = q1.remove();

		Queue<Integer> t = q1;
		q1 = q2;
		q2 = t;

		return val;
	}

}