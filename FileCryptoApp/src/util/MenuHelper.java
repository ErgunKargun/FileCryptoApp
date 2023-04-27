package util;

import menu.MenuType;

public class MenuHelper {

	public static void presentMenu() {
		
		MenuType.printMenu();
		
		int option = UserInputHelper.getUserIntegerAnswer();
		
		try {
			MenuType.executeMenu(option);
		} catch (Exception e) {
			System.out.println("Bir şeyler ters gitti! Sorun: " + e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
	}
}