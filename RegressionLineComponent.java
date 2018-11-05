import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
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
			
			public void mouseClicked(MouseEvent event)
			{
				
				if(track == 0)
				{
					p1 = new Point2D.Double(event.getX(), event.getY());
					p2 = null;
					p3 = null;
					p4 = null;
					p5 = null;
				}
				
				if(track == 1)
				{
					p2 = new Point2D.Double(event.getX(), event.getY());
				}
				
				if(track == 2)
				{
					p3 = new Point2D.Double(event.getX(), event.getY());
				}
				if(track == 3)
				{
					p4 = new Point2D.Double(event.getX(), event.getY());
				}
				if(track == 4)
				{
					p5 = new Point2D.Double(event.getX(), event.getY());
				}
				
				track++;
				repaint();
				
			}
			
		}
		
		MouseListener listener = new MousePressListener();
		addMouseListener(listener);
		
	}
	
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g; //recovers Graphics2D
		
		line = new RegressionLine();
		
		//plot points
		if(p1 != null)
		{
			plotPoint(g2, p1);
			line.addPoint(p1.getX(), p1.getY());
			line.draw(g2, Math.pow(x, 2));
		}
		
		if(p2 != null)
		{
			plotPoint(g2, p2);
			line.addPoint(p2.getX(), p2.getY());
			line.draw(g2, Math.pow(x, 2));
		}
		
		if(p3 != null)
		{
			plotPoint(g2, p3);
			line.addPoint(p3.getX(), p3.getY());
			line.draw(g2, Math.pow(x, 2));
		}
		
		if(p4 != null)
		{
			plotPoint(g2, p4);
			line.addPoint(p4.getX(), p4.getY());
			line.draw(g2, Math.pow(x, 2));
		}
		
		if(p5 != null)
		{
			plotPoint(g2, p5);
			line.addPoint(p5.getX(), p5.getY());
			line.draw(g2, Math.pow(x, 2));
			track = 0;
		}
		
	}
	
	public void plotPoint(Graphics2D g2, Point2D p)
	{
		
		double x = p.getX();
		double y = p.getY();
		
		Ellipse2D.Double dot = new Ellipse2D.Double(x-2.5, y-2.5, 5, 5);
		g2.fill(dot);
		
		
	}
	
	private int track;
	
	private Point2D p1;
	private Point2D p2;
	private Point2D p3;
	private Point2D p4;
	private Point2D p5;
	
	private RegressionLine line;
	
	private double x;
	private double y;
	
}
