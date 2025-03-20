package com.shell.commands;

import com.shell.Command;
import com.shell.env.*;

public class Echo extends Command{
	
	public Echo(EnvironmentVariable envs) {
		super(envs);
	}
	
	@Override
	public void execute(String[] args) {
		for (int i = 1; i < args.length; i++) {
			if (super.is_env(args[i]))
				args[i] = super.get_env(args[i]);
			
			System.out.print(args[i]+" ");
		}
		System.out.println("");
	}
}
