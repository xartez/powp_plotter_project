package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class CommandComplex implements PlotterCommand {
	private List<PlotterCommand> queue = new ArrayList<>();
	
	public CommandComplex(List<PlotterCommand> queue) {
		super();
		this.queue = queue;
	}


	@Override
	public void execute(IPlotter driver) {
		for (Object command : queue) {
            ((PlotterCommand)command).execute(driver);
        }
	}
	
	
	public List<PlotterCommand> getQueue() {
		return queue;
	}

	public void setQueue(List<PlotterCommand> queue) {
		this.queue = queue;
	}

}
