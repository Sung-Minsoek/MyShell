package com.shell;

import com.shell.env.*;

public class Command {
	protected EnvironmentVariable envs;
	
	public Command(EnvironmentVariable envs) {
		/* TODO: Save EV instance to envs. */
		
		/* Write your code. */
	}
	
	protected String get_env(String arg) {
		/* TODO: Return a value in EV. */
		
		/* Write your code. */
	}
	
	protected boolean is_env(String arg) {
		/* 
		 * TODO: Check the argument is Environment Variable. 
		 * 		 If the argument is empty, return false. 
		 */
		
		/* Write your code. */
	}
	
	public void execute(String[] args) {
		return;
	}
}
