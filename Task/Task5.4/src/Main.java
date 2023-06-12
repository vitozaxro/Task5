
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Dungeon dungeon = new Dungeon();

		while (true) {
			System.out.println("1)View treasures.\n2)View the most valuable treasure.\n3)Find treasure by price.\n4)Exit.\n");
			switch (in.nextInt()) {
				case 1: {
					System.out.println();
					dungeon.viewTreasures();
					break;
				}
				case 2: {
					System.out.println("\nThe most valuable treasure:");
					dungeon.findTheMostValuableTreasure();
					break;
				}
				case 3: {
					System.out.print("\nInput price: ");
					dungeon.findTreasureByPrice(in.nextDouble());
					break;
				}
				case 4: {
					return;
				}
				default: {
					System.out.println("\nSomething wrong...\n");
				}
			}
		}
	}
}
