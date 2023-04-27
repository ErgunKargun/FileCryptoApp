package util;

import java.util.Scanner;

public class UserInputHelper {

	private static Scanner sc;
	
	public static String getUserStringAnswer() {
		sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static int getUserIntegerAnswer() {
		sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void endApp() {
		sc.close();
	}
}
