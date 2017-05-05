package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class RectangleFactory {
	public static CommandComplex create(int x, int y, int height, int width){
		List<PlotterCommand> queue = new ArrayList<>();
		queue.add(new CommandSetPosition(x, y));		
		queue.add(new CommandDrawLineToPosition(x + height, y));
		queue.add(new CommandDrawLineToPosition(x + height, y + width));
		queue.add(new CommandDrawLineToPosition(x, y + width));
		queue.add(new CommandDrawLineToPosition(x, y));
		CommandComplex commands = new CommandComplex(queue);
		return commands;
	}
}
