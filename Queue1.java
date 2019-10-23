import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Bu sýnýf stack sýnýfýndan farklý olarak özel durumlar dýþýnda ilk giren ilk çýkar mantýðý ile
		çalýþmaktadýr.
		FIFO (first in first out)
		Bu sýnýfa ait metotlar;
		add(eleman): Parametrede verilen elemaný kuyruða ekler. Ýþlemin baþarýsýz olmasý
		durumunda hata fýrlatýr.
		offer(eleman): Parametrede verilen elemaný kuyruða ekler. Ýþlemin baþarýsýz olmasý
		durumunda null döner.
		poll(): Kuyruðun baþýndaki elemaný kuyruktan çýkartýr.
		peek(): Kuyrukta sýradaki elemana ulaþmak için kullanýlýr.
		clear() Kuyruðu temizlemek için 
		
		element: peek ile benzer  */
		  Queue<Integer> q = new LinkedList<>(); 
		  
		for (int i = 1; i <= 5; i++) {
			
			q.add(i);
			
		}
		System.out.println(q);
		q.offer(6);
		System.out.println(q);
		q.poll();
		System.out.println(q);
	
		System.out.println(q.peek());
		
	
		
		q.remove(3);
		System.out.println(q);
		

		System.out.println(q.element());
		
		
	}

}
