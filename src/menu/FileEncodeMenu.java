package menu;

import java.io.File;

import file.FileEncryptionMethodType;
import file.FileEncryptionParams;
import file.IFileEncryptionProcess;
import util.UserInputHelper;

public class FileEncodeMenu extends Menu {

	public FileEncodeMenu(int menuNo, String menuName) {
		super(menuNo, menuName);
	}

	@Override
	public void execMenu() throws Exception {
		
		System.out.println("Şifrelenecek dosya adını giriniz: ");		
		String fileNameToBeEncrypted = UserInputHelper.getUserStringAnswer();
		
		System.out.println("Şifreleme anahtarını giriniz: ");
		int encryptionKey = UserInputHelper.getUserIntegerAnswer();
		
		System.out.println("Şifrelenmiş verilerin kaydedileceği dosya adını giriniz: ");		
		String encryptedFileNameToBeSaved = UserInputHelper.getUserStringAnswer();
		
		if(selectedEncryptionMethod == FileEncryptionMethodType.None) {
			System.out.println("Şifrelenelirken kullanılacak metodu giriniz (4A - Sezar || 4B - XOR): ");		
			String encryptionMethod = UserInputHelper.getUserStringAnswer();
			selectedEncryptionMethod = FileEncryptionMethodType.getValue(encryptionMethod);				
		}
		
		FileEncryptionParams encryptionParams = new FileEncryptionParams(new File(fileNameToBeEncrypted), encryptionKey, encryptedFileNameToBeSaved);
		
		IFileEncryptionProcess fileEncryptionProcess = selectedEncryptionMethod.getFileEncryptionProcess(encryptionParams);
		
		fileEncryptionProcess.encode();
		
		System.out.println("Dosya şifrelendi!");
	}
}