package polynomial;

import java.util.Scanner;

import math.IPolynomial;

public class Fut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearPolynomial[] lpArray = new LinearPolynomial[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Kérem az " + i + ". polinom 'a' együtthatóját: ");
			double a = sc.nextDouble();
			System.out.println("Kérem az " + i + ". polinom 'b' együtthatóját: ");
			double b = sc.nextDouble();

			lpArray[i] = new LinearPolynomial(a, b);
		}

		for (LinearPolynomial p : lpArray)
			System.out.println(p.toString());

		getLookupTable(lpArray[4]);
		sc.close();

	}

	public static void getLookupTable(IPolynomial polyref) {
		for (double i = 0.0; i <= 1.0; i = i + 0.1) {
			System.out.println(i + " : " + polyref.getY(i));
		}
	}

}