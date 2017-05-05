package edu.iis.powp.command;

import java.util.ArrayList;

import java.util.List;

public class CircleFactory {
	public static CommandComplex create(int x, int y, int radius){
		int currX, currY;
		List<PlotterCommand> queue = new ArrayList<>();
		queue.add(new CommandSetPosition(x + radius, y));
		for(int i = 1; i <=360; i++){
			currX = (int) (x + radius * Math.cos(i * 2 *Math.PI / 360));
			currY = (int) (y + radius * Math.sin(i * 2 *Math.PI / 360));
			queue.add(new CommandDrawLineToPosition(currX, currY));
		}
		CommandComplex commands = new CommandComplex(queue);
		return commands;
	}
}