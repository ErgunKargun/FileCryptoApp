package menu;

import util.Constants;

public enum MenuType {

	FILE_READ_MENU(new FileReadMenu(Constants.FILE_READ_MENU_OPTION, Constants.FILE_READ_MENU_NAME)),
	FILE_ENCODE_MENU(new FileEncodeMenu(Constants.FILE_ENCRYPT_MENU_OPTION, Constants.FILE_ENCRYPT_MENU_NAME)),
	FILE_DECODE_MENU(new FileDecodeMenu(Constants.FILE_DECRYPT_MENU_OPTION, Constants.FILE_DECRYPT_MENU_NAME)),
	SELECT_ENCRYPTION_METHOD_MENU(new SelectEncryptionMethodMenu(Constants.SELECT_CRYPTO_METHOD_MENU_OPTION, Constants.SELECT_CRYPTO_METHOD_MENU_NAME)),
	EXIT_MENU(new ExitMenu(Constants.EXIT_MENU_OPTION, Constants.EXIT_MENU_NAME));
	
	private Menu menu;
	
	MenuType(Menu menu) {
		this.menu = menu;
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public static void printMenu() {
		System.out.println("----------------");
		for (MenuType menuType : values()) {
			menuType.getMenu().printMenu();
		}
		System.out.println("----------------");
	}

	public static void executeMenu(int option) throws Exception {
		for (MenuType menuType : values()) {
			if (menuType.getMenu().getMenuNo() == option) {
				menuType.getMenu().execMenu();
			}
		}
	}
}
