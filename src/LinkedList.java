import java.util.List;

public class LinkedList<E> {
	
	public int size = 0;
	Node<E> start = null;
	Node<E> current = null,temp = null;

	public int getSize() {
		return size;
	}
	
	void addNode(E e){
		temp = new Node<E>(e);
		
		if(start != null){
			current.next = temp;
			temp.prev = current ;
			current = temp;
			
		}
		else
		{
			start = temp;
			current = temp;
		}
		
	}
	
	boolean deleteNode(E e)
	{
		Node<E> tracker = start;
	  while(tracker != null){
		  if(tracker.getValue() == e)
		  {
			  tracker.prev.next = tracker.next;
			  return true;
		  }
		  tracker = tracker.next;
	  }
		
	  return false;
	}
	
	boolean isPresent(E e){
		Node<E> tracker = start;
		  while(tracker != null){
			  if(tracker.getValue() == e)
				  return true;
			  tracker = tracker.next;
		  }
		return false;
	}
	
	void printElements(){
		Node<E> tracker = start;
		  while(tracker != null){
			  System.out.print(" "+tracker.getValue());
			  tracker = tracker.next;
		  }
		  System.err.println();
	}
	
	public class Node<E> {
		Node<E> prev = null;
		Node<E> next = null;
		E value;
		
		{
			size++;
		}
		
		public Node(E e) {
			this.value = e;
		}
		
		public E getValue() {
			return value;
		}
		
		public void setValue(E value) {
			this.value = value;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public Node<E> getPrev() {
			return prev;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}
	}
}
