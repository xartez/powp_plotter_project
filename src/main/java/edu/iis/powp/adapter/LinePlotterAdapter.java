package edu.iis.powp.adapter;


import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;
// z adaptera warto korzystac gdy istnieje potrzeba zapewnienia wspolpracy miedzy dwoma klasami o niekompatybilnych interfejsach, adapter "adaptuje" jedna z klas na interfejs drugiej 

/**
 * Plotter adapter to drawer with several bugs. 
 */ 
public class LinePlotterAdapter implements IPlotter
{ 
	private int startX = 0, startY = 0;
	private DrawPanelController dpc = null;
    public LinePlotterAdapter(DrawPanelController dpc) {
		this.dpc = dpc;
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
        ILine line = LineFactory.getBasicLine();
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

		dpc.drawLine(line);
		setPosition(x,y);
    }

    @Override
    public String toString()
    {
        return "Drawer Simulator";
    }
}
