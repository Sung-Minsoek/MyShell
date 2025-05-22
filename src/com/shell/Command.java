package com.shell;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

import com.shell.env.*;

public class Command implements FileManager {
	protected EnvironmentVariable envs;
	
	public Command(EnvironmentVariable envs) {
		this.envs = envs;
	}
	
	protected String get_env(String arg) {
		return envs.get_value(arg.substring(1));
	}
	
	protected boolean is_env(String arg) {
		if (arg.isEmpty())
			return false;
		
		return arg.startsWith("$");
	}
	
	public void execute(String[] args) {
		return;
	}

	@Override
	public void FileWrite(String input, String fileName) throws Exception {
		String filePath = home + "/" + fileName;		
		
		try {
			File file = new File(filePath);
			FileWriter fw = new FileWriter(file);
			
			fw.write(input);
			fw.close();
		}
		
		catch (Exception e) {
			System.out.println(e);
			throw e;
		}
	}

	@Override
	public String FileRead(String fileName) throws Exception {
		String filePath = home + "/" + fileName;
		String output = "";
		
		try {
			File file = new File(filePath);
			FileReader fr = new FileReader(file);
			
			int i = 0;
			
			while((i = fr.read()) != -1) {
				output += (char) i;
			}
			
			fr.close();
		} 
		
		catch(Exception e) {
			throw e;
		}
		
		return output;
	}
}
