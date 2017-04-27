package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand{
	private int x;
	private int y;
	
	public CommandSetPosition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void execute(IPlotter driver) {
		driver.setPosition(x, y);
	}

}
