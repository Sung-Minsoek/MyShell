package com.shell.commands;

import com.shell.Command;
import com.shell.env.*;

public class Echo extends Command{
	public Echo(EnvironmentVariable envs) {
		super(envs);
	}
	
	private void do_redirection(String output, String target, boolean isAppend) throws Exception {
		try {
			output += "\n";
			super.FileWrite(output, target, isAppend);
		}
		
		catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	public void execute(String[] args) throws Exception {
		String output = "";
		
		boolean isAppend = false;
		
		for (int i = 1; i < args.length; i++) {
			if (super.is_env(args[i]))
				args[i] = super.get_env(args[i]);
			
			if (args[i].equals(">") || args[i].equals(">>")) {
				if (args[i].equals(">>"))
					isAppend = true;
				
				try {
					do_redirection(output.trim(), args[i + 1], isAppend);
					return;
				}
				
				catch (Exception e) {
					System.out.printf("Shell: Fail to redirection\n");
				}
			}
			
			output += (args[i] + " ");
		}
		System.out.println(output.trim());
	}
}
