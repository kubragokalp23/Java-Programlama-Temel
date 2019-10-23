import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * HashMap, Key(anahtar),value iliþkisinde deger saklayabilmemizi saðlayan map sýnýfýr
		 * HashMap belirtilen tipte key ve yine ayrýca belirtilen tipte value almaktadýr.
		 * 
		 * 
		 * */
		 
		
		//***********ilki anahtar ikinci value deger gönderir*****
		 HashMap<String, String> kelimeler = new HashMap<String, String>(); 
		 kelimeler.put("elma","apple");
		 kelimeler.put("kalem","pencil");
		 kelimeler.put("araba","car");
		 kelimeler.put("bilgisayar","computer");
		 
		 System.out.println(kelimeler.get("elma"));
		 
		 
		 
		 /*HashMap metodlarý:
		  * out-veri eklemek için
		  * get-belirtilen keye sahip elemanýn value çaðýrmak içn
		  * isEmpty-HashMap boþ mu dolu mu kontrol eder
		  * remove-belirtilen isimdeki tanýmlamayý siler
		  * size-hashmap in eleman sayýsýný döner
		  * replace-ismi belirtilen ketyin degerini deðiþtirir
		  * containsKey-bir anahtartýn varlýðýný sorgulamak için
		  * containsValue-bir degerin varlýðýný sorgulamak için
		  * values-tüm value larý döndürmek için
		  * keySet-tüm key lerý döndürmek için
		  * getOrDefault-
		  * 
		  */

	}

}
