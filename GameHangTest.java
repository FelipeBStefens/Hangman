package exercises106;
import java.util.Scanner;
import java.util.Arrays;

public class GameHangTest {
	
	public static int wrongQuantity = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose a word...");
		char[] wordChoose = scanner.next().toCharArray();
		char[] mistery = new char[wordChoose.length];
		Arrays.fill(mistery, '_');
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		for (int i = 0; i < mistery.length; i++) {
			System.out.print(mistery[i] + " ");
		}
		System.out.println();
		
		while (true) {
			
			boolean value  = false;
			System.out.println("type a letter...");
			char attempt = scanner.next().charAt(0);
			
			for (int i = 0; i < wordChoose.length; i++) {
				if (attempt == wordChoose[i]) {
					mistery[i] = attempt;
					value = true;
				}
			}
			
			if (!value) {
				wrongQuantity++;
				System.out.printf("You typed the wrong value, you have more %d times!%n", 6 - wrongQuantity);
				
				if (wrongQuantity == 1) {
					System.out.println(" ___   ");
					System.out.println("/   \\ ");
					System.out.println("\\___/ ");
				}
				
				else if (wrongQuantity == 2) {
					System.out.println(" ___  ");
					System.out.println("/   \\");
					System.out.println("\\___/");
					System.out.println("  ||  ");
					System.out.println("  ||  ");
					System.out.println("  ||  ");
				}
				
				else if (wrongQuantity == 3) {
					System.out.println(" ___  ");
					System.out.println("/   \\");
					System.out.println("\\___/");
					System.out.println(" /||  ");
					System.out.println("/ ||  ");
					System.out.println("  ||  ");
				}
				
				else if (wrongQuantity == 4) {
					System.out.println(" ___   ");
					System.out.println("/   \\ ");
					System.out.println("\\___/ ");
					System.out.println(" /||\\ ");
					System.out.println("/ || \\");
					System.out.println("  ||   ");
				}
				
				else if (wrongQuantity == 5) {
					System.out.println(" ___   ");
					System.out.println("/   \\ ");
					System.out.println("\\___/ ");
					System.out.println(" /||\\ ");
					System.out.println("/ || \\");
					System.out.println("  ||   ");
					System.out.println(" /     ");
					System.out.println("/      ");
				}
				
				else if (wrongQuantity == 6) {
					System.out.println(" ___   ");
					System.out.println("/   \\ ");
					System.out.println("\\___/ ");
					System.out.println(" /||\\ ");
					System.out.println("/ || \\");
					System.out.println("  ||   ");
					System.out.println(" /  \\ ");
					System.out.println("/    \\");
					
					System.out.println("You lose the game!!!");
					break;
				}
				
			}
			
			else {
				System.out.println("You typed it correct!!");
				for (int i = 0; i < mistery.length; i++) {
					System.out.print(mistery[i] + " ");
				}
				
				if (Arrays.equals(wordChoose, mistery)) {
					System.out.println("You won the game!!!");
					break;
				}
			}
		}
		
		scanner.close();
	}
}

