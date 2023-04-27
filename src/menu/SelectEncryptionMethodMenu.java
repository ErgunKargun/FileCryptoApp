package menu;

import file.FileEncryptionMethodType;
import util.UserInputHelper;

public class SelectEncryptionMethodMenu extends Menu {

	public SelectEncryptionMethodMenu(int menuNo, String menuName) {
		super(menuNo, menuName);
	}

	@Override
	public void execMenu() {
	
		System.out.println("Şifrelenelirken kullanılacak metodu giriniz (4A - Sezar || 4B - XOR): ");		
	
		String encryptionMethod = UserInputHelper.getUserStringAnswer();
		
		selectedEncryptionMethod = FileEncryptionMethodType.getValue(encryptionMethod);
	}
}