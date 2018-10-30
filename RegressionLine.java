import java.awt.Graphics2D;

public class RegressionLine 
{
	
	public RegressionLine(double x,double y)
	{
		
		x = sum_x;
		
		y = sum_y;
		
		sum_x2 = Math.pow(x, 2);
		
		sum_xy = x * y;
		
	}
	
	public void draw(Graphics2D g2, double x2)
	{
		
		//compute slope
		//numerator
		//(sum_xy) - (n * )
		
	}
	
	private double n;
	
	private double sum_x;
	
	private double sum_y;
	
	private double sum_x2;
	
	private double sum_xy;
	
}
