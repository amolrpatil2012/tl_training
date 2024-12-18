/*
 * 		Stack is LIFO --- last in First Out DS
 * 	
 * 		Only accessible element is top element -- last
 * 
 * 
 * 		push(10)		10
 * 		push(20)		10	20 [top]
 * 		push(30)		10	20	30[top]
 * 		push(40)		10	20	30	40[top]
 * 
 * 		pop				40			10	20	30[top]
 * 		pop				30			10	20[top]
 * 		pop				20			10[top]
 * 		pop				10			empty
 * 
 * 	push
 *  pop
 *  peek
 *  isEmpty
 * 		
 * 
 */

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<String> stringStack = new Stack<String>();
		
		stringStack.push("A");
		stringStack.push("B");
		stringStack.push("C");
		stringStack.push("D");
		
		System.out.println(" Current Stack :" + stringStack);
		
		System.out.println(" Pop : " + stringStack.pop());
		System.out.println(" Current Stack :" + stringStack);
		
		System.out.println(" Peek : " + stringStack.peek());
		System.out.println(" Current Stack :" + stringStack);
		
		System.out.println(" Check if stack is Empty " + stringStack.isEmpty());
		
		
		
	}

}
