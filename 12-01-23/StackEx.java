package Collections;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		//to add an element in stack we use the method push
		stack.push(23);
		stack.push(11);
		stack.push(32);
		stack.push(45);
		
		System.out.println(stack);
		
		System.out.println("ppping the top element of stack:"+stack.pop());
		
		System.out.println(stack);
		
		//search return -1 when the element in the stack is not present
		System.out.println("Position"+stack.search(90));
		
		stack.push(90);
		System.out.println("Top element:"+stack.peek());
		System.out.println(stack);

	}

}
