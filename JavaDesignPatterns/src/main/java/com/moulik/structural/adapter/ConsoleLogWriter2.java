package com.moulik.structural.adapter;

public class ConsoleLogWriter2 extends ConsoleWriter implements LogWriter {

	@Override
	public void out(String text) {
		super.writeToConsole(text);
	}

}
