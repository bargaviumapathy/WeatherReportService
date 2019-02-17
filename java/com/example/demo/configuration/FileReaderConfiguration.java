package com.example.demo.configuration;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

@Configuration
@ConfigurationProperties
public class FileReaderConfiguration {
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	@Value("${fileName}")
	String fileName;

	public String getFileName() throws IOException {
		return resourceLoader.getResource(fileName).getFile().getAbsolutePath();
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
}