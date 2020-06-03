package com.tyss.assignment2;

import java.util.Stack;

public class QueueUsingStack {
	public static void main(String[] args) {
	    StackImpl a = new StackImpl();
	    
	    a.enqueue(1);
	    a.enqueue(2);
	    a.enqueue(3);
	    
	    System.out.println(a.dequeue());
	    System.out.println(a.dequeue());
	    
	    a.enqueue(4);
	    
	    System.out.println(a.dequeue());
	    System.out.println(a.dequeue());
	    
	  }
}
class StackImpl {
	  Stack<Integer> s1 = new Stack<>();
	  Stack<Integer> s2 = new Stack<>();
	  
	  public void enqueue(int val) {
	    s1.push(val);
	  }
	  
	  public int dequeue() {
	    if(!s2.empty()) {
	      return s2.pop();
	    }
	    
	    if(s1.empty()) {
	      return -1;
	    }
	    
	    while(!s1.empty()) {
	      s2.push(s1.pop());
	    }
	    
	    return s2.pop();
	  }
	    
	}
