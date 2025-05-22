package com.shell;

public interface FileManager {
	public String home = System.getProperty("user.home");

	public abstract void FileWrite(String input, String fileName, boolean isAppend) throws Exception;
	public abstract String FileRead(String fileName) throws Exception;
}
