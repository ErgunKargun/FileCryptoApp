package menu;

import java.io.File;

import file.FileEncryptionMethodType;
import file.FileEncryptionParams;
import file.IFileEncryptionProcess;
import util.UserInputHelper;

public class FileDecodeMenu extends Menu {

	public FileDecodeMenu(int menuNo, String menuName) {
		super(menuNo, menuName);
	}

	@Override
	public void execMenu() throws Exception {
		
		System.out.println("Deşifre edilecek dosya adını giriniz: ");		
		String fileNameToBeDecrypted = UserInputHelper.getUserStringAnswer();
		
		System.out.println("Şifreleme anahtarını giriniz: ");
		int encryptionKey = UserInputHelper.getUserIntegerAnswer();
		
		System.out.println("Deşifre edilecek verilerin kaydedileceği dosya adını giriniz: ");		
		String decryptedFileNameToBeSaved = UserInputHelper.getUserStringAnswer();
		
		if(selectedEncryptionMethod == FileEncryptionMethodType.None) {
			System.out.println("Şifrelenelirken kullanılmış metodu giriniz (4A - Sezar || 4B - XOR): ");		
			String encryptionMethod = UserInputHelper.getUserStringAnswer();
			selectedEncryptionMethod = FileEncryptionMethodType.getValue(encryptionMethod);				
		}
		
		FileEncryptionParams encryptionParams = new FileEncryptionParams(new File(fileNameToBeDecrypted), encryptionKey, decryptedFileNameToBeSaved);
		
		IFileEncryptionProcess fileEncryptionProcess = selectedEncryptionMethod.getFileEncryptionProcess(encryptionParams);
		
		fileEncryptionProcess.decode();
		
		System.out.println("Dosyanın şifresi çözüldü!");
	}

}
