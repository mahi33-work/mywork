package com.example.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.lang3.SystemUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.SystemPropertyUtils;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
//		File f=new File(SystemUtils.getUserDir()+"/infolog.txt");
//		//SystemPropertyUtils.resolvePlaceholders(null, false);
//		f.createNewFile();
//		HashMap<String,String> loginfo=new HashMap<String,String>();
//		BufferedWriter br=new BufferedWriter(new FileWriter(f));
//		loginfo.put("for admin related  logs", "admin.log");
//		loginfo.put("for main application related logs", "admin-main.log");
//		br.write(loginfo.toString());
//		br.flush();
//		br.close();
		
	}
	

}
