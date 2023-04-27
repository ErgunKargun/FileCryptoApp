package file;

public abstract class FileEncryptionProcessBase implements IFileEncryptionProcess {

	protected FileEncryptionParams encryptionParams;
	
	public FileEncryptionProcessBase(FileEncryptionParams encryptionParams) {
		this.encryptionParams = encryptionParams;
	}
	
	protected abstract void encodeFile(FileEncryptionParams params) throws Exception;
	protected abstract void decodeFile(FileEncryptionParams params) throws Exception;
	
	@Override
	public void encode() throws Exception {
		encodeFile(encryptionParams);
	}

	@Override
	public void decode()  throws Exception {
		decodeFile(encryptionParams);
	}
}
