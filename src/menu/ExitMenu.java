package menu;

import util.UserInputHelper;

public class ExitMenu extends Menu {

	public ExitMenu(int menuNo, String menuName) {
		super(menuNo, menuName);
	}

	@Override
	public void execMenu() {
		System.out.println("Çıkış yapılıyor... Hoşçakalın!");
		UserInputHelper.endApp();
		System.exit(0);
	}

}
