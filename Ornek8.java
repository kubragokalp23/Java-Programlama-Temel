import java.util.ArrayList;

public class Ornek8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Araba> arabalar=new ArrayList<>();
		arabalar.add(new Araba("opel","insigna",100000,"siyah"));
		arabalar.add(new Araba("voswagen","golf",50000,"beyaz"));
		arabalar.add(new Araba("opel","corsa",2000,"gümüþ"));
	
	
	for (Araba araba : arabalar) {
		
		System.out.println("arabanýn markasýý:"+araba.getMarka());
		System.out.println("arabanýn model:"+araba.getModel());
		System.out.println("arabanýn fiyat:"+araba.getFiyat());
		System.out.println("arabanýn rengi:"+araba.getRenk());
		System.out.println("--------");

}
}
}