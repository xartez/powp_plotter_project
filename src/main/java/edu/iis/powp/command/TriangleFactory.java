package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class TriangleFactory {
	public static CommandComplex create(int aX, int aY, int bX, int bY, int cX,int cY) {

		List<PlotterCommand> queue = new ArrayList<>();
		queue.add(new CommandSetPosition(aX, aY));
		queue.add(new CommandDrawLineToPosition(bX, bY));
		queue.add(new CommandDrawLineToPosition(cX, cY));
		queue.add(new CommandDrawLineToPosition(aX, aY));
		CommandComplex commands = new CommandComplex(queue);
		return commands;
	}
}
