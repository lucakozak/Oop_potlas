package hasabtarol;

import sikidom.*;

public class HasabFut {
	public static void main(String[] args) {
		HasabTarol hT = new HasabTarol(5);

		hT.setHasabRef(0, new Henger(1, 7));
		hT.setHasabRef(1, new Henger(3, 3));
		hT.setHasabRef(2, new Teglatest(2, 7, 4));
		hT.setHasabRef(3, null);
		hT.setHasabRef(4, null);
		
		for (int i = 0; i < 5; i++) {
			if (hT.getIndexofHasab(i) != null)
				System.out.println(hT.getIndexofHasab(i).toString());
		}

		System.out.println("A hasábok átlagos térfogata: " + hT.getHasabAverageVolume());
		System.out.println("A hengerek száma: " + hT.getHengerHasabokSzama());
		System.out.println("A null elemek száma: " + hT.getNotNullElements());

	}

}