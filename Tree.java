import java.util.Scanner;

public class Tree {

	static int size;

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		do {
			System.out.println("Enter size:");
			size = input.nextInt();

			// rows
			for (int i = 0; i < size; i++) {
				// spaces
				for (int j = 1; j < size - i; j++) {
					System.out.print("0");
				}
				
				/*
				 * First iteration ((2*0)+1) = 1 star. Second iteration
				 * ((2*1)+1) = 3 stars. Third iteration ((2*2)+1) = 5 stars and
				 * so on
				 */
				
				// stars
				for (int k = 0; k < (2 * i + 1); k++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} while (true);

	}

}
