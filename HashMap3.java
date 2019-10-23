import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hash = new HashMap<Integer, String>(); 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("N adet sehir giriniz");
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println((i+1)+".ilce");
			String ilce=sc.next();
			System.out.println((i+1)+".posta kodu");
			int posta=sc.nextInt();
			
			
		hash.put(posta, ilce);

			}
		
	for (Map.Entry m : hash.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}

	}
}
