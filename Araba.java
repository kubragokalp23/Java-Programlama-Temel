
public class Araba {
	
	private String marka;
	private String model;
	private int fiyat;
	private String renk;
	
	public Araba() {
		
		
	}
	
	public Araba(String marka, String model, int fiyat, String renk) {
		super();
		this.marka = marka;
		this.model = model;
		this.fiyat = fiyat;
		this.renk = renk;
	}

	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	

}
