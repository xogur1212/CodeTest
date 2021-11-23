import java.util.Stack;

class MyQueue2 {
       Stack<Integer> stackOld,stackNew;
    
    public MyQueue2() {
    stackOld=new Stack<>();
    stackNew=new Stack<>();
    }
    
    public void push(int x) {
        stackNew.push(x);
    }
    
    public int pop() {
        shiftStacks();
        return stackOld.pop();
    }
    
    public int peek() {
        shiftStacks();
        return stackOld.peek();
    }
    
    public boolean empty() {
        shiftStacks();
       
        return stackOld.isEmpty();
    }
    public int size() {
		return stackOld.size()+stackNew.size();
		
	}
    
    private void shiftStacks() {
		if(stackOld.isEmpty()) {
			while(!stackNew.isEmpty()) {
				stackOld.push(stackNew.pop());
			}
		}
	}
    
    
}