import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	DEQUE
add(element): Adds an element to the tail.
addFirst(element): Adds an element to the head.
addLast(element): Adds an element to the tail.
offer(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
offerFirst(element): Adds an element to the head and returns a boolean to explain if the insertion was successful.
offerLast(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
iterator(): Returna an iterator for this deque.
descendingIterator(): Returns an iterator that has the reverse order for this deque.
push(element): Adds an element to the head.
pop(element): Removes an element from the head and returns it.
removeFirst(): Removes the element at the head.
removeLast(): Removes the element at the tail.
poll(): Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
pollFirst(): Retrieves and removes the first element of this deque, or returns null if this deque is empty.
pollLast(): Retrieves and removes the last element of this deque, or returns null if this deque is empty.
peek(): Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
peekFirst(): Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
peekLast(): Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
*/
		 Deque<String> deque = new LinkedList<String>();
		 
		 
		deque.add("kubra");
		deque.add("buro");
		deque.add("mero");
		deque.add("ilknur");
		deque.add("elif");
		deque.addFirst("seza");
		
		System.out.println(deque);
		
		deque.remove("mero");
		System.out.println(deque);
		
		
		deque.poll();
		System.out.println(deque);
		
		
		deque.push("deniz");
		System.out.println(deque);
		
		
		deque.removeLast();
		System.out.println(deque);
		
		
		deque.offerLast("elif");
		System.out.println(deque);
		
System.out.println(deque.peekLast());
		
		
	}

}
