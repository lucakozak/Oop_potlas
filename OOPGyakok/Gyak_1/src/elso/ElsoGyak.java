package elso;

import java.util.Scanner;

public class ElsoGyak {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Mit szeretnel kiprobalni? \n 1.Hello World \n 2.Bumm \n 3. Beolvasas \n 4.Muveletek tombbel!");
		int answer = scanner.nextInt();
		switch(answer) {
		case 1 : HelloWorld();
		case 2 : Bumm();
		case 3:Bekeres();
		case 4:Array();
		default : System.out.println("Érvénytelen mûvelet");
		}
	
	}

	public static void HelloWorld() {
		System.out.println("Hello World");

	}

	public static void Bumm() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("Bumm");
	}

	public static void Bekeres() {
		

		System.out.print("Kerem a nevet: ");
		String read = scanner.next();

		System.out.println("A beolvasott nev: " + read);

		int sum = 0;

		System.out.println("Kérem a számot: ");
		int readNumber = scanner.nextInt();
		
		System.out.println("Másodfokú egyenletet fogunk megoldani! \n Add meg a másodfokú tagot!");
		double firstOperand = scanner.nextDouble();
		System.out.println("Add meg az elsõfogú tagot!");
		double secondOperand =scanner.nextDouble();
		System.out.println("Add meg a konstans tagot!");
		
		double constant =scanner.nextDouble();
		quadraticEquation(firstOperand, secondOperand, constant);
		scanner.close();

		System.out.println("A beolvasott szám: " + readNumber);

		for (int i = 0; i <= readNumber; i++) {
			sum += i;
		}

		System.out.println("Az összeg: " + (sum / readNumber));
	}
	public static void Array() {
		int[] tomb = new int[10];
		boolean found = false;
		
		for(int i=0;i<tomb.length;i++) {
			tomb[i] +=1;
			System.out.println("Az " + i + ".elem: " + tomb[i]);
		}
		
		int max = tomb[0];
		for(int i=0;i<tomb.length;i++) {
			if(tomb[i] > max)
				max = tomb[i];
		}
		System.out.println("\nA legnagyobb elem: " + max);
				
		
		int searched = 6;
		for(int i=0;i<tomb.length;i++) {
			if(tomb[i] == searched) 
				found = true;
		}
			
		if(found)
			System.out.println("\nMegtalálható a tömbben a keresett elem! : " + searched);
		else
			System.out.println("\nNincs a tömbben a keresett elem!" +searched);
	}
	
	private static void quadraticEquation(double firstOperand, double secondOperand, double constant) {
        double a=0,b=0,c=0;
         a = firstOperand;
         b = secondOperand;
         c = constant;

        double root1=0, root2=0;

        double determinant = (b * b) - (4 * a * c);

        if (determinant > 0) {
            root1 = ((-1)*b + Math.sqrt(determinant)) / (2 * a);
            root2 = ((-1)*b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("First root: "+ root1 + "\n "+ "Second root : "+root2);
        }

        else if (determinant == 0) {
            root1 = ((-1)*b) / (2 * a);

            System.out.println("The two roots are equal : " +root1);
        }

        else {
            double realPart = ((-1)*b) / (2 * a);
            double imaginaryPart = Math.sqrt((-1)*determinant) / (2 * a);

            System.out.println("First complex root: " + realPart + " + " + imaginaryPart + "i"
                    + " Second complex root: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}