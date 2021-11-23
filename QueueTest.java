import java.util.Stack;

class MyQueue<T>{
	Stack<T> stackOld,stackNew;
	
	MyQueue(){
		stackOld=new Stack<T>();
		stackNew=new Stack<T>();
	}
	
	public int size() {
		return stackOld.size()+stackNew.size();
		
	}
	
	public void add(T value) {
		stackNew.push(value);
	}
	private void shiftStacks() {
		if(stackOld.isEmpty()) {
			while(!stackNew.isEmpty()) {
				stackOld.push(stackNew.pop());
			}
		}
	}
	public T peek() {
		shiftStacks();
		return stackOld.peek();
	}
	public T remove() {
		shiftStacks();
		return stackOld.pop();
	}
}

public class QueueTest {
	
	
	public static void main(String[] args) {
		
		MyQueue<Integer> q= new MyQueue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.peek());
		System.out.println(q.peek());
	}
}
