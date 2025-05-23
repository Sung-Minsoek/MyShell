package com.shell.commands;

import java.io.IOException;

import com.shell.Command;
import com.shell.env.*;

public class Cat extends Command{
	public Cat(EnvironmentVariable envs) {
		super(envs);
	}

	@Override
	public void execute(String[] args) throws Exception {
		String result = "";
		String fileContent = "";
		
		for (int i = 1; i < args.length; i++) {
			if (args[i].startsWith("$"))
				args[i] = super.get_env(args[i]);
			
			try {
				fileContent = super.FileRead(args[i]);
			}
			
			catch (IOException e) {
				System.out.printf("Shell: File not found %s\n", args[i]);
				return;
			}
			
			catch (Exception e) {
				throw e;
			}
			
			result = result.concat(fileContent);
		}
		
		System.out.println(result.trim());
		
		return;
	}
}
