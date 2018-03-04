package com.macys.cd.camel.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;

public class MessageConverter {

	public String getLogs(String fileName) {
		String logs = "";
		try {
			File file = new File(fileName);
			if (file.exists()) {
				FileInputStream fileInputStream = new FileInputStream(file);
				StringWriter writer = new StringWriter();
				IOUtils.copy(fileInputStream, writer);
				logs = writer.toString();
			} else {
				logs = "No Details Found";
			}
		} catch (Exception exception) {
		}
		return logs;
	}
}
