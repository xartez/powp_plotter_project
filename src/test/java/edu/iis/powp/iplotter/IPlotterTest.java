package edu.iis.powp.iplotter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJoe;
// aby sparametryzowac tworzone linie nalezaloby dodac nowa metode w fabryce LineFactory oraz utworzyc nowa klase Line, ktorej konstruktor przyjmowalby, np. grubosc lini, styl linii 
/**
 * Plotter test.
 * 
 * @author Dominik
 */
public class IPlotterTest
{
    private static IPlotter plotter = new TestPlotter();
    
    /**
     * Plotter test.
     */
    public static void main(String[] args)
    {
        FiguresJoe.figureScript1(plotter);
    }
    
    private static class TestPlotter implements IPlotter
    {

        @Override
        public void drawTo(int x, int y)
        {
            System.out.println("Plotter drawTo action..."); 
        }

        @Override
        public void setPosition(int x, int y)
        {
            System.out.println("Plotter setPosition action..."); 
        }
    };
}
