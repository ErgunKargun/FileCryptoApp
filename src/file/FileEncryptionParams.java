package file;

import java.io.File;

public class FileEncryptionParams {

	private File file; 
	private int encryptionKey;
	private String resultFileName;
	
	public FileEncryptionParams(File file, int encryptionKey, String resultFileName) {
		
		this.file = file;
		this.encryptionKey = encryptionKey;
		this.resultFileName = resultFileName;
	}

	public File getFile() {
		return file;
	}

	public int getEncryptionKey() {
		return encryptionKey;
	}

	public String getResultFileName() {
		return resultFileName;
	}
}
