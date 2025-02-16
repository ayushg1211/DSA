package dsa.linkedlist;

public class ImplementALinkedlist {
		public static class Linkedlist{
			public static class Node{
				int data ;
				Node next;
			}
			
			Node head ;
			Node tail ;
			int size ;
			
//			addLast()
			public void addLast(int val) {
				Node temp = new Node() ;
				temp.data = val ;
				temp.next = null ;
				
				if(size==0) {
					head = tail = temp ;
				}
				else {
					tail.next = temp ;
					tail = temp ;
				}
				size++ ;
			}
			
//			addFirst()
			public void addFirst(int val) {
				Node temp = new Node();
				temp.data = val ;
				
				if(size==0) {
					temp.next = null ;
					head = tail = temp ;
				}
				else {
					temp.next = head ;
					head = temp ;
				}
				size++ ;
			}
			
//			addAtIndex()
			public void addAtIndex(int i, int val) {
				Node temp = new Node() ;
				temp.data = val ;
				if(i<0 || i>size) {
					System.out.println("Invalid Index");
				}
				else if(i==0) {
					addFirst(val);
				}
				else if(i==size) {
					addLast(val);
				}
				else {
					Node t = head ;
					for(int j=0 ; j< i-1 ; j++) {
						t = t.next ;
					}
					
					temp.next = t.next ; 
					t.next = temp ;
					size++ ;
				}
				
			}
			
			
			
//			getFirst()
			public int getFirst()
			{
				if(size==0) {
					return -1 ;
				}
				return head.data ;
			}
			
//			getLast()
			public int getLast()
			{
				if(size==0) {
					return -1 ;
				}
				return tail.data ;
			}
			
//			getValueAt()
			public int getValueAt(int i) {
				if(size==0) {
					return -1 ;
				}
				else if(i<0 || i >= size()) {
					return -1 ;
				}
				else {
					Node temp = head ;
					for(int j=0 ; j<i ; j++) {
						temp = temp.next ;
					}
					return temp.data ;
				}
			}
			
//			removeFirst()
			public int removeFirst() {
				int temp = -1 ;
				if(size==0) {
					return -1 ;
				}
				else if(size==1) {
					temp = head.data; 
					head = tail = null ;
				
				}
				else {
					temp = head.data ;
					head = head.next ;
					
				}
				size-- ;
				return temp ;
			}
			
//			removeLast()
			public int removeLast() {
				int temp = -1 ;
				if(size==0) {
					return -1 ;
				}
				else if(size==1) {
					temp = tail.data; 
					head = tail = null ;
				
				}
				else {
					temp = tail.data ;
					Node n = head ;
					
					for(int i=0 ; i<size-2 ; i++) {
						n = n.next ;
					}
					
					n.next = null ;
					tail = n ;
					
				}
				size-- ;
				return temp ;
			}
			
//			removeAtIndex()
			public int removeAtIndex(int i) {
				int temp = -1 ;
				if(size==0) {
					return -1 ;
				}
				else if(i<0 || i>=size) {
					System.out.println("Invalid Index");
				}
				else if(i==0) {
					removeFirst() ;
				}
				else if(i == size-1) {
					removeLast() ;
 				}
				else {
					Node n = head ;
					for(int j=0 ; j<i-1 ; j++) {
						n = n.next ;
					}
					Node t = n.next ;
					temp = t.data ;
					n.next = t.next ;
					t.next = null ;
					size-- ;
				}
				
				return temp ;
			}
			
//			getNodeAt()
			public Node getNodeAt(int i) {
				if(size == 0) {
					return null ;
				}
				else if(i<0 || i>=size) {
					System.out.println("Invalid Index");
					return null ;
				}
				else if(i==0) {
					return head ;
				}
				else if(i==size-1) {
					return tail ;
				}
				else {
					Node temp = head ;
					for(int j=0 ; j<i ; j++) {
						temp = temp.next ;
					}
					return temp ;
				}
			}
			
//			reverse() data driven
			public void reverse() {
				if(size==0) {
					return ;
				}
				int st = 0;
				int end = size-1 ;
				while(st<end) {
					Node n1 = getNodeAt(st) ;
					Node n2 = getNodeAt(end) ;
					
					int temp = n1.data ;
					n1.data = n2.data ;
					n2.data = temp ;
					
					st++ ;
					end-- ;
				}
			}
			
//			reverseP() pointer Driven
			public void reverseP() {
				if(size==0) {
					return ;
				}
				Node p = null ;
				Node cur = head;
				
				while(cur != null) {
					Node org = cur.next ;
					cur.next = p ;
					p = cur ;
					cur = org ;
				}
				Node temp = head ;
				head = tail ;
				tail = temp ;
			}
			
//			kth node from last
			public Node getKthFromLast(int k) {
				Node s = head ;
				Node f = head ;
				
				for(int i=0 ; i<k ; i++) {
					f = f.next ;
				}
				
				while(f != tail) {
					f = f.next ;
					s = s.next ;
				}
				return s ;
			}
			
//			get mid of linkedlist without size, in 1 iteration
			public Node getMiddleNode() {
				Node s = head ;
				Node f = head ;
				
				while(f.next != null && f.next.next != null) {  // f.next.next is checking even size()
					s = s.next ;
					f = f.next.next ;
				}
				return s ;
			}
			
//			size()
			public int size() {
				return size ;
			}
			
//			display()
			public void display() {
				Node temp = head ;
				while(temp != null) {
					System.out.print(temp.data + " ");
					temp = temp.next ;
				}
				System.out.println();
			}
			
		}
		
		public static void main(String[] args) {
			Linkedlist l1 = new Linkedlist();
			l1.addLast(10) ;
			l1.addLast(20) ;
			l1.addLast(30) ;
			l1.addLast(40) ;
			l1.addLast(50) ;
			l1.addLast(60) ;
			l1.addLast(70) ;
			l1.addLast(80) ;
			l1.addLast(91) ;
			
			System.out.println(l1.size() );
			
			l1.display();
			
			l1.removeFirst() ;
			
			l1.display();
			
			System.out.println(l1.getValueAt(3));
			
			
			l1.addFirst(11);
			l1.display();
			
			l1.addAtIndex(4, 66);
			l1.display();

			System.out.println(l1.getLast()); 
			
			l1.removeLast() ;
			l1.display();

			
			l1.removeAtIndex(4) ;
			l1.display();
			
			l1.reverse();
			l1.display();
			
			l1.reverseP();
			l1.display();
			

			System.out.println(l1.size());
			Linkedlist.Node n = l1.getKthFromLast(3) ;
			System.out.println(n.data);
			

			l1.removeFirst() ;
			l1.display();
			
			Linkedlist.Node n2 = l1.getMiddleNode() ;
			System.out.println(n2.data);
		}

}
