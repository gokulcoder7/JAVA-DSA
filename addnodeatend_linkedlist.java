import java.util.*;



public class ank{
	
	public static class Node{
		int data;
		Node next;
	}
	
		public static class LinkedList{
			
			int size;
			Node head;
			Node tail;
			
			
			void lastadd(int val){
				Node temp=new Node();
				temp.data=val;
				temp.next=null;
				
				if(size==0){
					
					head=tail=temp;
				}
				
				else{
					tail.next=temp;
				tail=temp;
					
					
				}
				
				size++;
			}
			
		}
		
		
	

    public static void main(String[] args) { 
	
	
	
	
	
		
		
		
	}
	
	
	
	
	
	
	
	

	
	
	}
}
