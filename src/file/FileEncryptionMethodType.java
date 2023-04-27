package file;

import util.Constants;

public enum FileEncryptionMethodType {

	None(""),
	Sezar(Constants.SEZAR_ENCRYPTION_METHOD),
	XOR(Constants.XOR_ENCRYPTION_METHOD);
	
	private String encryptionMethod;
	
	FileEncryptionMethodType(String m) {
		this.encryptionMethod = m;
	}
	
	public String getEncryptionMethod() {
		return encryptionMethod;
	}
	
	public static FileEncryptionMethodType getValue(String encryptionMethod) {
		for (FileEncryptionMethodType v : values()) {
			if(v.encryptionMethod.equalsIgnoreCase(encryptionMethod)) {
				return v;
			}
		}
		return FileEncryptionMethodType.None;
	}
	
	public IFileEncryptionProcess getFileEncryptionProcess(FileEncryptionParams params) {

		switch (this) {
		case None:
			throw new IllegalArgumentException("Şifreleme yöntemi seçilmemiş!");
		case Sezar: 
			return new SezarEncryptionProcess(params);			
		case XOR:
			return new XOREncryptionProcess(params);					
		}
		return null;
	}
}
