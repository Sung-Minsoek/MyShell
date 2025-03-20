package com.shell;

import com.shell.Parser;
import com.shell.commands.*;
import com.shell.env.*;

import java.util.Scanner;

public class Shell {

	public static void main(String[] args) {
		EnvironmentVariable envs = new EnvironmentVariable();
		History history = new History(envs);
		
		Command[] cmd_list = {
				new Exit(envs),
				new Echo(envs),
				new Cat(envs),
				history
		};
		
		Scanner sc = new Scanner(System.in);
		
START:	while(true) {
			System.out.print("$> ");
			String input = sc.nextLine();
			
			Parser parser = new Parser(input);
			parser.parsing();
			
			history.add_history(parser.get_commandInput());

			// Searching CMD
			for (int i = 0; i < cmd_list.length; i++) {
				Command cmd = cmd_list[i];
				String cmdString = cmd.getClass().getSimpleName().toLowerCase();
				
				if (cmdString.equals(parser.get_command())) {
					cmd.execute(parser.get_arguments());
					continue START;
				}
			}
			
			if (parser.is_env() < 1)
				System.out.printf("Shell: command not found %s\n", parser.get_command());
			else
				envs.add_env(parser.get_arguments()[0], parser.get_arguments()[1]);
		}
	}
}
