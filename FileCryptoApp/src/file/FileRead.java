package file;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {

	public String readFile(String fileName) throws Exception {

		try(FileReader fr = new FileReader(fileName)) {
			
			BufferedReader br = new BufferedReader(fr);
			
		    StringBuilder sb = new StringBuilder();
		    
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    
		    return sb.toString();
		}
	}
}