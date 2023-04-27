package menu;

import file.FileEncryptionMethodType;

public abstract class Menu implements IMenu {

	private int menuNo;
	private String menuName;	
	FileEncryptionMethodType selectedEncryptionMethod = FileEncryptionMethodType.None;
	
	public Menu (int menuNo, String menuName) {
		this.menuNo = menuNo;
		this.menuName = menuName;
	}
	
	public int getMenuNo() {
		return menuNo;
	}
	
	public abstract void execMenu() throws Exception;
	
	@Override
	public String printMenu() {
		System.out.println("" + menuNo + ". " + menuName);
		return menuName;
	}
	
}
