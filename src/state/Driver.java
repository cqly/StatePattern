package state;

import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		Button button = new Button();
		while (true) {
			System.out.print("-------");
			sc.nextLine();
			button.push();
		}

	}
}
