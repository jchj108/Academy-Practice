package com.kh.homework.IO.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
		File f = new File(file);
		boolean result = f.exists();
		return result;
	}

	public void fileSave(String file, String s) {
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public StringBuilder fileOpen(String file) {

		StringBuilder read = new StringBuilder();
		try (FileReader fr = new FileReader(file)) {
			int value;
			while ((value = fr.read()) != -1) {
				read.append((char) value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return read;
	}

	public void fileEdit(String file, String s) {
		try(FileWriter fw = new FileWriter(file, true);) {
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
