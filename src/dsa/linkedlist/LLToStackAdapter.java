package dsa.linkedlist;

import java.util.LinkedList;

public class LLToStackAdapter {
	public static class LLToStack{
		LinkedList<Integer> l1 = new LinkedList() ;
		
		public int size() {
			return l1.size() ;
		}
		
		public void push(int val) {
			l1.addFirst(val);
		}
		public int pop() {
			if(l1.size() == 0) {
				return -1 ;
			}
			return l1.removeFirst() ;
		}
		
		public int top() {
			if(l1.size()==0) {
				return -1 ;
			}
			return l1.getFirst() ;
		}
		
	}
	
	public static void main(String[] args) {
		LLToStack stack = new LLToStack() ;
		stack.push(12);
		stack.push(12);
		stack.push(12);
		stack.push(12);
	}
}
