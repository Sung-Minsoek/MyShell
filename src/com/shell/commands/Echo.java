package com.shell.commands;

import com.shell.Command;
import com.shell.env.*;

public class Echo extends Command{
	
	public Echo(EnvironmentVariable envs) {
		super(envs);
	}
	
	private void do_redirection(String output, String target, boolean isAppend) {
		try {
			output += "\n";
			super.FileWrite(output, target, isAppend);
		}
		
		catch (Exception e) {
			System.out.printf("Fail to redirect to %s\n", target);
			return;
		}
	}
	
	@Override
	public void execute(String[] args) {
		String output = "";
		
		for (int i = 1; i < args.length; i++) {
			if (super.is_env(args[i]))
				args[i] = super.get_env(args[i]);
			
			if (args[i].equals(">")) {
				do_redirection(output.trim(), args[i + 1], false);
				return;
			}
			
			if (args[i].equals(">>")) {
				do_redirection(output.trim(), args[i + 1], true);
				return;
			}
			
			output += (args[i] + " ");
		}
		System.out.println(output.trim());
	}
}
