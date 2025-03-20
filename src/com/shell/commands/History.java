package com.shell.commands;

import com.shell.Command;
import com.shell.env.EnvironmentVariable;

import java.util.ArrayList;

public class History extends Command {
	private ArrayList<String> log;
	
	public History(EnvironmentVariable envs) {
		super(envs);
		log = new ArrayList<String>();
	}
	
	public void add_history(String commandInput) {
		log.add(commandInput);
	}
	
	private void print_all_history() {
		for (int i = 0; i < this.log.size(); i++)
			System.out.printf("%4d\t%s\n", i, log.get(i));
	}
	
	private void print_n_history(int n) {
		if (n > this.log.size())
			n = this.log.size();
		
		for (int i = 0; i < n; i++)
			System.out.printf("%4d\t%s\n", i, log.get(i));
	}
	
	@Override
	public void execute(String[] args) {
		String n = "";
		
		if (args.length > 1) {
			if (super.is_env(args[1]))
				n = super.get_env(args[1]);
			else
				n = args[1];
		}
			
		if (n.isEmpty())
			this.print_all_history();
		else
			this.print_n_history(Integer.parseInt(n));
		
		return;
	}
}
