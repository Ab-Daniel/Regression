import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class RegressionLine 
{
	
	public RegressionLine(double x,double y, int clicks)
	{
		
		x = sum_x;
		
		y = sum_y;
		
		n = clicks;
		
		sum_x2 = Math.pow(x, 2);
		
		sum_xy = x * y;
		
	}
	
	public void draw(Graphics2D g2, double x2)
	{
		
		//compute slope
		//numerator
		double top = (sum_xy) - (n * (sum_x/n) * (sum_y/n));
		//denominator
		double bot = sum_x2 - (n*Math.pow(sum_x/n, 2));
		//slope
		double slope = top/bot;
		
		Line2D.Double line = new Line2D.Double(0, sum_y/n + slope*(0-sum_x/n), x2-1, sum_y/n + slope*(x2-sum_x/n));
		g2.draw(line);
		
	}
	
	public void addPoint(double x, double y)
	{
		
		
		
	}
	
	private double n;
	
	private double sum_x;
	
	private double sum_y;
	
	private double sum_x2;
	
	private double sum_xy;
	
}
