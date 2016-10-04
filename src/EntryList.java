
public class EntryList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		list.printElements();
		
		list.deleteNode(3);
		
		list.printElements();
		System.out.println("3 in list: "+list.isPresent(3));
		System.out.println("4 in list: "+list.isPresent(4));
		list.addNode(6);
	}
}
