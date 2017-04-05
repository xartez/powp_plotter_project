package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class CustomLinePlotterAdapter implements IPlotter {
	private int startX = 0, startY = 0;
	private DrawPanelController dpc = null;
	private ILine line = null;
    public CustomLinePlotterAdapter(DrawPanelController dpc, ILine line) {
		this.dpc = dpc;
		this.line = line;
	}
   
    
	@Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y)
    {
        
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

		dpc.drawLine(line);
		setPosition(x,y);
    }

    @Override
    public String toString()
    {
        return "Custom Line Plotter Adapter";
    }
}

