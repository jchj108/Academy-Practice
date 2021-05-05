package com.kh.homework.IO.file.model.dao;

import java.io.File;

public class FileDAO {

	public boolean checkName(String file) {
		File f = new File(file);
		boolean result = f.exists();
		return result;
	}
	
	public void fileSave(String file, String s) {
		
	}
	public StringBuilder fileOpen(String file) {
		
	}
	public void fileEdit(String file, String s) {
		
	}
}
