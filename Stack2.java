import java.util.Stack;

public class Stack_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*push:listeye eleman ekleme iþlemi yapar
		 * 
		 * pop:listenin eüste bulunan elemaný siler.Eðer liste boþ ise
		 * EmptyStacKException hatasý verir
		 * 
		 * 
		 * peek:listenin en üstündeki elemaný dömdürmek için.Bu elemaný silmez,sadece gösterir
		 * 
		 * empty:listenin boþ olup olmama durumunu kontrol eder
		 * 
		 * search:listede eleman arama iþlemi yapmamýz için kullanýlýr.Eleman listede varsa indisini döner
		 * listede yoksa - döner
		 * 
		 * ilk eklenen en son sýraya,en son eklenen ilk sýrayaeklenir.
		 * 
	
		 * 
		 */
		
		
		
		/*Stack stack=new Stack();
		 stack.push("Burom");
		 stack.push("Küb");
		 stack.push("Fatmik");
		 System.out.println(stack);
		  System.out.println(stack.search("Küb"));
		 System.out.println(stack.peek());
		 System.out.println(stack.pop());*/
		
		
		Stack <String> stack =new Stack();
		stack.push("MECLÝSÝ");
		stack.push("MÝLLET");
		stack.push("BÜYÜK");
		stack.push("TÜRKÝYE");
		
		
		for (int i = 0; i <4 ; i++) {
			
			System.out.println(stack.pop());
			
		}
	
		
		
	}

}
