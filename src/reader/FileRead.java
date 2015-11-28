package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class FileRead {
private	String path;


	public FileRead(String path) {
		this.path = path;
	}

	/**
	 * Reading text from file
	 * 
	 * @return String object
	 */
	public String read() {
		StringBuilder text = new StringBuilder();
		String data;
		File file = new File(path);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((data = br.readLine()) != null) {
				text.append(data + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text.toString();
	}

}
