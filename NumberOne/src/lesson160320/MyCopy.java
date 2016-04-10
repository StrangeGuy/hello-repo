package lesson160320;

import java.util.Arrays;

public class MyCopy {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: MyCopy<number>");
			System.exit(0);
		} else {
			System.out.println(Arrays.toString(args));

			int argument = Integer.parseInt(args[0]);
			
			if (argument >=10&& argument<= 20) {
				System.out.println("Got it!");
			} else {
				System.out.println("Sorry, missed");
			}
		}
	}

}
