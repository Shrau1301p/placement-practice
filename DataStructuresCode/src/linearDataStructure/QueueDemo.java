package linearDataStructure;

//Queue implementation using array
class QueueByArray{
	final int MAX = 1000;
    int front;
    int rear;
    int a[] = new int[MAX]; // Maximum size of Stack
    
    public QueueByArray() {
    	front = 0;
    	rear = 0;
    }
    
    public void EnQueue(int val) {
    	if(rear == MAX) {
    		System.out.println("Queue is overflow");
    		return;
    	}
    	else {
    		a[rear++] = val;
    		System.out.println(val + " is added in Queue");	
    	}
    }
    
    public void DeQueue() {
    	int b[] = new int[MAX]; // Maximum size of Stack
        
    	if(front == rear) {
    		System.out.println("Queue is underflow");
    		return;
    	}else {
    		for(int i = front; i < rear;i++) {
    			b[i] = a[i+1];
    		}
    		rear = rear-1;
    		a = b;
    	}
    	
    }
    
    public int Peek() {
    	if(front == rear) {
    		System.out.println("Queue is Empty");
    		return 0;
    	}else {
    		return a[front];
    	}
    }
    
    public boolean isEmpty() {
    	if(front == rear) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public void getQueue() {
    	for (int i = 0; i < rear; i++) {
    		System.out.print(" "+ a[i]);
		}
    }
}

class QueueByLinkedList{
	int data;
	QueueByLinkedList next;
	
	QueueByLinkedList front;
	QueueByLinkedList rear;

    public QueueByLinkedList() {
    	 front = null;
    }
    
    public QueueByLinkedList(int data) {
    	this.data = data;
    	this.next = null;
    }
    
    public void enQueue(int val) {
    	QueueByLinkedList newNode = new QueueByLinkedList(val);
    	if(front == null) {
    		front = rear = newNode;
    		System.out.println(val + " is added in Queue");	
    	} else {
    		rear.next = newNode;
    		rear = newNode;
    		System.out.println(val + " is added in Queue");	
    	}
    }
    
    public void deQueue() {
    	if(front == null) {
    		System.out.println("Queue is empty");
    		return;
    	}
    	if(front == rear) {
    		front = rear = null;
    	} else {
    		QueueByLinkedList p = front;
    		front = front.next;
    		p.next = null;
    	}
    }
        
    public void getQueue(){
    	for(QueueByLinkedList q = front; q.next != null; q=q.next) {
    		System.out.print(" "+q.data);
    	}
    }
}

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		//Queue by array 
//		QueueByArray queueByArray = new QueueByArray();
//		System.out.println();
//		
//		System.out.println("Is their are entries in Queue?");
//		System.out.println(queueByArray.isEmpty());
//		
//		System.out.println("Adding enteries in queue:");
//		queueByArray.EnQueue(2);
//		queueByArray.EnQueue(3);
//		queueByArray.EnQueue(4);
//		queueByArray.EnQueue(5);
//		queueByArray.EnQueue(6);
//		System.out.println();
//		
//		System.out.println("Display all the entries of Queue:");
//	    queueByArray.getQueue();
//	    System.out.println();
//		
//	    queueByArray.DeQueue();
//		System.out.println();
//		System.out.println("Display all the entries of Queue After DeQueue:");
//	    queueByArray.getQueue();
//	    
//	    System.out.println();
//		
//	    System.out.println("Display First the entries of Queue:");
//		System.out.println(queueByArray.Peek());
//	    System.out.println();
//		
//	    System.out.println("Is their are entries in Queue?");
//		System.out.println(queueByArray.isEmpty());
		
		
		//Queue by linked List 
		QueueByLinkedList queue = new QueueByLinkedList();
		System.out.println();
		System.out.println("Adding enteries in queue:");
		
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(6);
		
		System.out.println();
		System.out.println("Display all the entries of Queue:");
		
		queue.getQueue();
	    
		System.out.println();
		
	    queue.deQueue();
		
	    System.out.println();
		System.out.println("Display all the entries of Queue After DeQueue:");
		
		queue.getQueue();
		 
		System.out.println();
		
		queue.enQueue(23);
		queue.enQueue(56);
	    
		System.out.println();
	    System.out.println();
		System.out.println("Display all the entries of Queue After EnQueue:");
		
		queue.getQueue();
	    
	}

}
