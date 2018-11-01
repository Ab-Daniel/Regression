import javax.swing.JFrame;

public class RegressionLineTest 
{
	
	public static void main(String[] args) 
	{
		
		JFrame frame =  new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Regression Line Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RegressionLineComponent component = new RegressionLineComponent( );
		frame.add(component);
		frame.setVisible(true);
	}
	
}
