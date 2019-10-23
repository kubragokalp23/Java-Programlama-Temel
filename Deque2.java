import java.util.Deque;
import java.util.LinkedList;

public class Deque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> sayilar = new LinkedList<>();
		
		sayilar.offer(10);
		sayilar.offer(20);
		sayilar.offer(30);
		sayilar.offer(40);
		sayilar.offer(50);
		
		
		
	for (int i = 1; i < 4; i++) {
		System.out.println(sayilar.peekFirst());
		sayilar.poll();

	}
		
		
	}

}
