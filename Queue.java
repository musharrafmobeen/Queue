public class Queue {
	//Variable Declaration
	private Node  front , rear;
	private Integer sizeOfQueue;
	
	
	//Constructor
	public Queue() {
		front = null;
		rear = null;
		sizeOfQueue = 0;
	}
	
	
	//Function to add data to a Queue
	public void Enqueue(Object data) {
		Node previousRear = rear;
		rear = new Node();
		rear.setData(data);
		if(isEmpty()) {
			front = rear;
		}
		else {
			previousRear.setNext(rear);
		}
		sizeOfQueue++;
		System.out.println("Data : " + data + " Has Been Added");
	}
	
	
	//Function to Remove and return data from front Queue
	public Object Dequeue(){ 
		Object data = null;
		if(!isEmpty()) {
			data = front.getData();
			front = front.getNext();
			sizeOfQueue--;
			System.out.println("Data : " + data + " Has Been Removed");
		}
		else {
			rear = null;
			front = null;
			System.out.println("Queue is Already Empty");
		}
		
		return data;
	}
	
	
	//Return front of Queue
	public Node front() {
		return front;
	}
	
	
	//Return rear of Queue
	public Node rear() {
		return rear;
	}
	
	
	//Show all data present in the Queue
	public void showAllData() {
		Node newfront = front;
		if(newfront != null) {	
			System.out.println(newfront.getData());
			
			while(newfront.getNext() != null) {
				System.out.println(newfront.getNext().getData());
				newfront = newfront.getNext();
			}
		}
		else {
			System.out.println("Queue is Empty");
		}
	}
	
	
	//Check if Queue is Empty
	public boolean isEmpty() {
		return sizeOfQueue == 0;
	}
	
	
}
