package linearDataStructure;

class StackByArray{
	//In Array we take top=last index inserted
	final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    
    public StackByArray() {
		this.top = -1;
	}
    
    //Insert The Elements to Stack
    public boolean Push(int num){
    	//if Stack is full
    	if(this.top >= MAX-1) {
    		System.out.println("Stack Overflow");
    		return false;    	
    	} else {
    		this.a[++this.top] = num;
    		return true;
    	}
    }
    
    //Remove Elements from Stack
    public int Pop(){
    	//if Stack is empty
    	if(this.top < 0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	} else {
    		int x = this.a[this.top];
    		this.top--;
    		return x;	
    	}
    	
    }
    
    //Return latest inserted value
    public int Peek(){
    	//if Stack is empty
    	if(this.top < 0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	} else {
    		int x = this.a[this.top];
    		return x;
    	}
    }
    
    public boolean isEmpty(){
    	if(this.top < 0) {
    		return true;
    	} else{
    		return false;
    	}
    }
    
    public boolean isFull(){
    	if(this.top >= MAX-1) {
    		return true;
    	} else{
    		return false;
    	}
    }
    
    void getStackElements(){
        for(int i = this.top;i>-1;i--){
          System.out.print(" "+ this.a[i]);
        }
    }
}

class StackByLinkedList{
	int data;
	StackByLinkedList next;
	StackByLinkedList top;
	
	StackByLinkedList(){
		top = null;
	}
	StackByLinkedList(int data){
		this.data = data;
		this.next = null;
	}
	
	//Insert The Elements to Stack
    public boolean Push(int num){
    	StackByLinkedList newNode = new StackByLinkedList(num); 
    	if(top == null) {
    		top = newNode;
    		return true;    	
    	} else {
    		StackByLinkedList temp = top;
    		top = newNode;
    		newNode.next = temp;
    		return true;
    	}
    }
	
    //Remove Elements from Stack
    public int Pop(){
    	if(top == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	} else {
    		StackByLinkedList temp = top;
    		int x = temp.data;
    		top = temp.next;
    		temp.next = null;
    		return x;
    	}
    }
  //Return latest inserted value
    public int Peek(){
    	if(top == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	return top.data;
    }
    
    public boolean isEmpty(){
    	if(top == null) {
    		return true;    	
    	} else {    		
    		return false;
    	}
    }
    
    void getStackElements(){
    	for(StackByLinkedList q = top; q.next != null; q=q.next) {
    		System.out.print(" "+q.data);
    	}
    }
}

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Stack implementation using Array
//		StackByArray stack = new StackByArray();
//		System.out.println("Doing the stack Operation using Array: ");
//		System.out.println("-------------------------------------------");
//		System.out.println("Checking Stack Empty or not: "+ stack.isEmpty());
//		System.out.println();
//		System.out.println("Checking Stack Full or not: "+ stack.isFull());
//		System.out.println();
//		System.out.println("Add 12 To the Stack: "+ stack.Push(12));
//		System.out.println("Add 13 To the Stack: "+ stack.Push(13));
//		System.out.println("Add 14 To the Stack: "+ stack.Push(14));
//		System.out.println("Add 15 To the Stack: "+ stack.Push(15));
//		System.out.println("Add 16 To the Stack: "+ stack.Push(16));
//		System.out.println();
//		System.out.println("The Element on the top os the stack: "+ stack.Peek());
//		System.out.println();
//		System.out.println("Removing Top Element from the Stack: "+ stack.Pop());
//		System.out.println();
//		System.out.println("The Element on the top os the stack: "+ stack.Peek());
//		System.out.println();
//		System.out.print("Elements present in stack :");
//        stack.getStackElements();
		
		//Stack implementation using Linked List
		StackByLinkedList stack = new StackByLinkedList();
		System.out.println("Doing the stack Operation using Linked List: ");
		System.out.println("-------------------------------------------");
		System.out.println("Checking Stack Empty or not: "+ stack.isEmpty());
		System.out.println();
		
		System.out.println("Add 12 To the Stack: "+ stack.Push(12));
		System.out.println("Add 13 To the Stack: "+ stack.Push(13));
		System.out.println("Add 14 To the Stack: "+ stack.Push(14));
		System.out.println("Add 15 To the Stack: "+ stack.Push(15));
		System.out.println("Add 16 To the Stack: "+ stack.Push(16));
		System.out.println();
		System.out.println("The Element on the top os the stack: "+ stack.Peek());
		System.out.println();
		System.out.println("Removing Top Element from the Stack: "+ stack.Pop());
		System.out.println();
		System.out.println("The Element on the top os the stack: "+ stack.Peek());
		System.out.println();
		System.out.print("Elements present in stack : ");
        stack.getStackElements();
	}
}
