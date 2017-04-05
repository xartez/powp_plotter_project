package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{
	private String figure = null;
	
	public SelectTestFigureOptionListener(String string) {
			this.figure = string;
	}
		
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	if(figure.equals("Figure Joe 1")) {
    		    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}
    	else if (figure.equalsIgnoreCase("Figure Joe 2")) {
    		    		FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	}
    	else if (figure.equalsIgnoreCase("Figure Jane")) {
    		FiguresJane.figureScript( (AbstractPlotter) Application.getComponent(DriverManager.class).getCurrentPlotter());
}
    }
}
