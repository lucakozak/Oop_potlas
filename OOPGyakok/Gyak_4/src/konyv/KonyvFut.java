package konyv;

public class KonyvFut {

	public static void main(String[] args) {
		Konyv k1 = new Konyv("Gyakorlatias Java", "Luca", 2018, 50);

		System.out.println(k1.toString());
		k1.priceIncrement(50);
		System.out.println(k1.toString());
	}
}