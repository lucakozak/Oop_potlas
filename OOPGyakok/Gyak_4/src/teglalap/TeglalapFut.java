package teglalap;

public class TeglalapFut {
	public static void main(String[] args) {
		Teglalap a = new Teglalap(1, 10);
		Teglalap b = new Teglalap(5, 3);
		Teglalap c = a;

		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());

		a.setOldalak(4, 10);
		System.out.println(a.getAdatok());
		System.out.println(b.getAdatok());
		System.out.println(c.getAdatok());

		a.setOldalak(3, 7);
		System.out.println("Az a==b: " + (a == b));
		System.out.println("Az a==c: " + (a == c));

		System.out.println("Az a==b metódussal: " + (a.getOldalakEgyeznekE(b)));

	}
}