package com.shell;

import com.shell.env.*;

public class Command {
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
}
