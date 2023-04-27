package file;

public class SezarEncryptionProcess extends FileEncryptionProcessBase {

	public SezarEncryptionProcess(FileEncryptionParams encryptionParams) {
		super(encryptionParams);
	}

	@Override
	protected void encodeFile(FileEncryptionParams params) throws Exception {

		String encryptedData = "";

		String data = FileProcessBuilder.getFileReader().readFile(params.getFile().getAbsolutePath());
		int encryptionKey = params.getEncryptionKey();

		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					ch = (char) (((int) ch + encryptionKey - 65) % 26 + 65);
				} else {
					ch = (char) (((int) ch + encryptionKey - 97) % 26 + 97);
				}
			}
			encryptedData += ch;
		}

		FileProcessBuilder.getFileWriter().writeFile(params.getResultFileName(), encryptedData);
	}

	@Override
	protected void decodeFile(FileEncryptionParams params) throws Exception {

		String decryptedData = "";

		String data = FileProcessBuilder.getFileReader().readFile(params.getFile().getAbsolutePath());
		int encryptionKey = params.getEncryptionKey();

		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (Character.isUpperCase(ch)) {
				ch = (char) (((int) ch - encryptionKey - 65) % 26 + 65);
			} else if (Character.isLowerCase(ch)) {
				ch = (char) (((int) ch - encryptionKey - 97) % 26 + 97);
			}
			decryptedData += ch;
		}

		FileProcessBuilder.getFileWriter().writeFile(params.getResultFileName(), decryptedData);
	}
}