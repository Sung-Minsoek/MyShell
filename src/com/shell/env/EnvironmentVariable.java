package com.shell.env;

import java.util.HashMap;

public class EnvironmentVariable {
	private HashMap<String, String> envs;
	
	public EnvironmentVariable() {
		envs = new HashMap<String, String>();
	}
	
	public HashMap<String, String> get_envs() {
		return this.envs;
	}
	
	public void add_env(String name, String value) {
		this.envs.put(name, value);
	}
	
	public String get_value(String name) {
		return envs.get(name);
	}
}
