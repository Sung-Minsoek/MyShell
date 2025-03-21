package com.shell;

public class Parser {
	private String commandInput;
	private String command;
	private String[] args;
	
	private int isEnv;
	
	public Parser(String input) {
		
		/*
		 *	TODO: Implement parser constructor.
		 *		1.	Check the input line whether define EV and save to isEnv.
		 *		2.	Save input line to commandInput.
		 */
		
		/* Write your code. */
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
		/* TODO: Return the number of tokens. */
		
		/* Write your code. */
	}
	
	public int is_env() {
		return this.isEnv;
	}
	
	public void parsing() {
		/* 
		 * TODO: Tokenize with " " or "=". Then save to args and first arg 
		 * 		 to command field. 
		 */
		
		/* Write your code. */
	}
}
