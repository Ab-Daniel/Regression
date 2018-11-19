import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class RegressionLine 
{
	
	public void draw(Graphics2D g2, double x2)
	{
		
		Line2D.Double line;
		
		double slope;
		
		if(n==1)
		
			slope = 0;
		
		else
		
			slope = ((sum_xy) - n * (sum_x/n) * (sum_y/n)) / ((sum_x2 - n *(sum_x/n) * (sum_y/n)));
		
			double y1 = (sum_y / n) - (slope * (sum_x / n));
			double x21 = x2 - 1;
			double y2 = (sum_y / n) + (slope* (x21 - (sum_x / n)));
			line = new Line2D.Double(new Point2D.Double(0, y1), new Point2D.Double(x21, y2));
			g2.draw(line);
		
		
	}
	
	public void addPoint(double x, double y)
	{
		
		n++;
		sum_x =+ x;
		sum_y =+ y;
		sum_x2 =+ x * x;
		sum_xy =+ x* y;
		
	}
	
	private double n;
	
	private double sum_x;
	
	private double sum_y;
	
	private double sum_x2;
	
	private double sum_xy;
	
}
