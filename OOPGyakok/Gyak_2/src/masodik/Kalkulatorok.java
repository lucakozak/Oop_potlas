package masodik;

import java.util.Scanner;

public class Kalkulatorok {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Egybe irnád be az egyenletet(1) vagy tagonként? (2)\n");
		int ans = sc.nextInt();
		switch (ans) {
		case 1:
			Calc1();
		case 2:
			Calc2();
		default:
			System.out.println("Érvénytelen művelet!");
		}
	}

	private static void Calc1() {
		int number1 = 0;
		int number2 = 0;
		String op = "";
		int res = 0;

		System.out.println("Kérem az egyik számot!:");
		number1 = sc.nextInt();

		System.out.println("Kérem az operátort!:");
		op = sc.next();

		System.out.println("Kérem a másik számot!:");
		number2 = sc.nextInt();

		sc.close();

		switch (op) {
		case "+":
			res = number1 + number2;
			System.out.println("Eredmény: " + res);
			break;

		case "-":
			res = number1 - number2;
			System.out.println("Eredmény: " + res);
			break;

		case "*":
			res = number1 * number2;
			System.out.println("Eredmény: " + res);
			break;

		case "/":
			if (number2 == 0) {
				System.out.println("0-val nem lehet osztani!");
				break;
			} else {
				res = number1 / number2;
				System.out.println("Eredmény: " + res);
			}
			break;
		}
	}

	private static void Calc2() {
		Scanner sc = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		String op = "";
		int res = 0;
		String array[] = new String[10];

		System.out.println("Kérem a mûveltet!:");
		array = sc.nextLine().split(" ");

		number1 = Integer.parseInt(array[0]);
		op = array[1];
		number2 = Integer.parseInt(array[2]);

		sc.close();

		switch (op) {
		case "+":
			res = number1 + number2;
			System.out.println("Eredmény: " + res);
			break;

		case "-":
			res = number1 - number2;
			System.out.println("Eredmény: " + res);
			break;

		case "*":
			res = number1 * number2;
			System.out.println("Eredmény: " + res);
			break;

		case "/":
			if (number2 == 0) {
				System.out.println("0-val nem lehet osztani!");
				break;
			} else {
				res = number1 / number2;
				System.out.println("Eredmény: " + res);
			}
			break;
		}
	}
}
