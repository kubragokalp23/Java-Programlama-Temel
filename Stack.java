import java.util.Stack;

public class Stack_Ornek1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack=new Stack();
		/*Stack sýnýfý vector sýnýfýndan türemiþtir.
		 * bu nedennle Stacj sýnýfý içerisinde Vector de bulunan isimleri ile
		 * karþýlaþabilir.
		 * Fakat,vector da olmayýp stacj de ayrýca eklenmiþ metot isimleri ile karþýlassabilirz
		 * 
		 * 
		 * add
		 * addElement
		 * capacity
		 * elementsAt
		 * empty
		 * firstElement
		 * lastElement
		 * get
		 * isEmpty
		 * lastIndexOf
		 * indexOf
		 * removeAllElement
		 * clear
		 * 
		 * 
		 * peek
		 * pop
		 * push
		 
		 */
		
		/*
		 stack.push("Londra");
		 stack.push("Moskova");
		 stack.push("Ankara");
		 stack.push("Paris");
		 stack.push("Viyana");
		 System.out.println(stack);
		 System.out.println(stack.search("Ankara"));
		 System.out.println(stack.peek());
		 System.out.println(stack.pop());
		 System.out.println(stack); */
		
		
		
		// Pushing element on the top of the stack 
	    static void stack_push(Stack<Integer> stack) 
	    { 
	        for(int i = 0; i < 5; i++) 
	        { 
	            stack.push(i); 
	        } 
	    } 
	      
	    // Popping element from the top of the stack 
	    static void stack_pop(Stack<Integer> stack) 
	    { 
	        System.out.println("Pop :"); 
	  
	        for(int i = 0; i < 5; i++) 
	        { 
	            Integer y = (Integer) stack.pop(); 
	            System.out.println(y); 
	        } 
	    } 
	  
	    // Displaying element on the top of the stack 
	    static void stack_peek(Stack<Integer> stack) 
	    { 
	        Integer element = (Integer) stack.peek(); 
	        System.out.println("Element on stack top : " + element); 
	    } 
	      
	    // Searching element in the stack 
	    static void stack_search(Stack<Integer> stack, int element) 
	    { 
	        Integer pos = (Integer) stack.search(element); 
	  
	        if(pos == -1) 
	            System.out.println("Element not found"); 
	        else
	            System.out.println("Element is found at position " + pos); 
	    } 
	  
	  
	    public static void main (String[] args) 
	    { 
	        Stack<Integer> stack = new Stack<Integer>(); 
	  
	        stack_push(stack); 
	        stack_pop(stack); 
	        stack_push(stack); 
	        stack_peek(stack); 
	        stack_search(stack, 2); 
	        stack_search(stack, 6); 
	 
	}

}
