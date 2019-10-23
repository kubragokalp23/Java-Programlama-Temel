import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue <Integer>kuyruk=new LinkedList<>();
		
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			
			System.out.println("kuyruða eklenecek degeri gir");
			int str=sc.nextInt();
			
			if(kuyruk.add(str)){
				System.out.println("eklendi");
				
				
			
		}
			else {
				
				
				System.out.println("eklenemedi");
			}
			
			for (Integer inte: kuyruk) {
				System.out.println(inte);
			}
		
			
		}
		
		
		
		

	}

}
