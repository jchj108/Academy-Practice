package com.kh.homework.IO.file.controller;

import com.kh.homework.IO.file.model.dao.FileDAO;

public class FileController {

	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	public void fileSave(String file, StringBuilder sb) {
		
	}
	public StringBuilder fileOpen(String file) {
		
	}
	public void fileEdit(String file, StringBuilder sb) {
		
	}
}
