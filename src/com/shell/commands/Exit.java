package com.shell.commands;

import com.shell.Command;
import com.shell.env.*;

public class Exit extends Command{
	public Exit(EnvironmentVariable envs) {
		super(envs);
	}

	@Override
	public void execute(String[] args) {
		System.out.println("Shell Exited...");
		System.exit(0);
	}
}
