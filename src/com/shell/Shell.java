package com.shell;

import com.shell.Parser;
import com.shell.commands.*;
import com.shell.env.*;

import java.util.Scanner;

public class Shell {

	public static void main(String[] args) {
		EnvironmentVariable envs = new EnvironmentVariable();
		Command[] cmd_list = {
				new Exit(envs),
				new Echo(envs),
				new Cat(envs),
				new History(envs)
		};
		History history = (History)cmd_list[3];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("$> ");
			
			/*
			 *	TODO: Main part of this project.
			 *  	1. 	Get user input to String type.
			 *   	2. 	Create Parser instance and do parsing.
			 *   	3. 	Add user input to history.
			 *   	4.	Searching a command in cmd_list equal to user's input.
			 *      	Recommend to use Object.getClass().getSimpleName().
			 *   	5. 	Execute the command and return to start of the program.
			 *   	6. 	If can not match, check it is environment variable.
			 *   	7. 	Add to the variable to EnvrionmentVarible(EV). If not,
			 *   		print the error state.
			 *   	8. 	Continue above procedure until execute Exit command.
			 */
			
			/* Write your code. */
			
		}
	}
}
