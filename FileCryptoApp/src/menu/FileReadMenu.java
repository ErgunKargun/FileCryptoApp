package menu;

import file.FileProcessBuilder;
import file.FileRead;
import util.UserInputHelper;

public class FileReadMenu extends Menu {

	public FileReadMenu(int menuNo, String menuName) {
		super(menuNo, menuName);
	}

	@Override
	public void execMenu() throws Exception {
		
		System.out.println("Okunacak dosyanın adını giriniz: ");
		
		String fileName = UserInputHelper.getUserStringAnswer();
		
		FileRead fr = (FileRead) FileProcessBuilder.getFileReader();
		
		String everythingInFile = fr.readFile(fileName);
		
		System.out.println(everythingInFile);
	}
}