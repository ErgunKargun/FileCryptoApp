package file;

public class XOREncryptionProcess extends FileEncryptionProcessBase {

	public XOREncryptionProcess(FileEncryptionParams encryptionParams) {
		super(encryptionParams);
	}

	@Override
	protected void encodeFile(FileEncryptionParams params) throws Exception {

		String encryptedData = "";

		String data = FileProcessBuilder.getFileReader().readFile(params.getFile().getAbsolutePath());
		Integer encryptionKey = params.getEncryptionKey();

		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			ch = (char) (ch ^ encryptionKey);
			encryptedData += ch;
		}

		FileProcessBuilder.getFileWriter().writeFile(params.getResultFileName(), encryptedData);
	}

	@Override
	protected void decodeFile(FileEncryptionParams params) throws Exception {

		String decryptedData = "";

		String data = FileProcessBuilder.getFileReader().readFile(params.getFile().getAbsolutePath());
		Integer encryptionKey = params.getEncryptionKey();

		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			ch = (char) (ch ^ encryptionKey);
			decryptedData += ch;
		}

		FileProcessBuilder.getFileWriter().writeFile(params.getResultFileName(), decryptedData);
	}
}