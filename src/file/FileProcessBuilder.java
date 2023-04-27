package file;

public class FileProcessBuilder {

	private static FileRead fileReader;
	private static FileWrite fileWriter;
	private static SezarEncryptionProcess sezarEncryptionProcessor;
	private static XOREncryptionProcess xorEncryptionProcessor;
	
	public static FileRead getFileReader() {
		
		if(fileReader == null) {
			fileReader = new FileRead();
		}
		return fileReader;
	}
	
	public static FileWrite getFileWriter() {
		
		if(fileWriter == null) {
			fileWriter = new FileWrite();
		}
		return fileWriter;
	}
	
	public static SezarEncryptionProcess getSezarEncryptionProcess(FileEncryptionParams params) {
		
		if(sezarEncryptionProcessor == null) {
			sezarEncryptionProcessor = new SezarEncryptionProcess(params);
		}
		return sezarEncryptionProcessor;
	}
	
    public static XOREncryptionProcess getXOREncryptionProcess(FileEncryptionParams params) {
		
		if(xorEncryptionProcessor == null) {
			xorEncryptionProcessor = new XOREncryptionProcess(params);
		}
		return xorEncryptionProcessor;
	}
}
