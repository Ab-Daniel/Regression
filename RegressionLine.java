import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class RegressionLine 
{
	
	public void draw(Graphics2D g2, double x2)
	{
		
		Line2D.Double line;
		
		double slope;
		
		if(n==1)
		
			slope = 0;
		
		else
		
			slope = (sum_xy) - n * (sum_x/n) * (sum_y/n)/
					(sum_x2 - n *(sum_x/n) * (sum_y/n));
			line = new Line2D.Double(0, sum_y/n + slope*(0-sum_x/n), x2-1, sum_y/n + slope*(x2-sum_x/n));
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
