package com.shell;

public class Parser {
	private String commandInput;
	private String command;
	private String[] args;
	
	private int isEnv;
	
	public Parser(String input) {
		
		if ((!input.contains(" ")) && (input.contains("=")))
			isEnv = 1;
		else
			isEnv = 0;

			commandInput = input;
	}

	public String get_commandInput() {
		return this.commandInput;
	}
	
	public String get_command() {
		return this.command;
	}
	
	public String[] get_arguments() {
		return this.args;
	}
	
	public int nr_args() {
		return this.args.length;
	}
	
	public int is_env() {
		return this.isEnv;
	}
	
	public void parsing() {
		String del = " ";
		
		if (isEnv > 0)
			del = "=";
		
		args = this.commandInput.split(del);
		command = args[0];
	}
}
