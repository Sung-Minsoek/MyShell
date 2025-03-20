package com.shell.commands;

import com.shell.Command;
import com.shell.env.*;

public class Cat extends Command{
	public Cat(EnvironmentVariable envs) {
		super(envs);
	}

	@Override
	public void execute(String[] args) {
		String result = "";
		
		for (int i = 1; i < args.length; i++) {
			if (args[i].startsWith("$"))
				args[i] = super.get_env(args[i]);
			
			result = result.concat(args[i]);
		}
		
		System.out.println(result);
		
		return;
	}
}
