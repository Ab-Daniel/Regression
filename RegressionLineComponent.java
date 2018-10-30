import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class RegressionLineComponent extends JComponent
{
	
	public RegressionLineComponent()
	{
		
		track = 0;
		
		p1 =  null;
		p2 =  null;
		p3 =  null;
		p4 =  null;
		p5 =  null;
		
		class MousePressListener extends MouseAdapter
		{
			
			public void mouseClicker(MouseEvent event)
			{
				
				if(track == 0)
				{
					p1 = new Point2D.Double(event.getX(), event.getY());
					p2 = null;
					p3 = null;
					p4 = null;
					p5 = null;
				}
				
				track++;
				repaint();
				
			}
			
		}
		
	}
	
	
	private int track;
	
	private Point2D p1;
	
	private Point2D p2;
	
	private Point2D p3;
	
	private Point2D p4;
	
	private Point2D p5;
}
