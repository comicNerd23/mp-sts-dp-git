package com.moulik.structural.adapter;

public class ConsoleLogWriter implements LogWriter {
	
	private ConsoleWriter consoleWriter;
	
	public ConsoleLogWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	@Override
	public void out(String text) {
		this.consoleWriter.writeToConsole(text);
		
	}

}
