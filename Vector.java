import java.util.Vector;

public class Vector_Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector=new Vector<>(1);//parantez içine 3 yazmazsam 10 tane üretiyor.RAM de 3 elemanlý alan açýlmýþ oluyo(kapasite)
		vector.setSize(2);
		vector.add("burom");
		vector.add("fatmik");
		vector.add("küb");
		
		
		for (String string : vector) {
			System.out.println(string);
			
		}
		
		System.out.println("capacity:"+vector.capacity());
		System.out.println("Size:"+vector.size());
		
		
		/*addElement-verieklemek için
		 * capacity
		 * clear-degerleri temizler
		 * contains-listede deger aramak için
		 * get-indisini bildiðimi< degeri çaðýrmak
		 * indexOf
		 * lastIndexOf
		 * removeAllElements-tüm elemanlarý silmek için
		 * set-var olan degeri degistirmek için
		 * remove-belirtilen indisteki/isimdeki elemaný silmek için
		 * size-vector un eleman sayýsýný döner
		 */
		
	}

}
