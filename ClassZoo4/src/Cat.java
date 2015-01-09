import java.awt.*;
import java.applet.*;

public class Cat extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
	}

	private void drawAnimal(Graphics g)
	{
		
		//Head Shape
		g.drawOval(320, 280, 300, 300);
		//Ears
		g.drawLine(350, 340, 365, 200);
		g.drawLine(365, 200, 420, 290);
		
		g.drawLine(590, 340, 575, 200);
		g.drawLine(575, 200, 520, 290);
		
		
		//Eyes
			//Right Eye
				//Iris
				g.setColor(Color.darkGray);
				g.fillOval(380, 390, 70, 70);
				//Pupil
				g.setColor(Color.black);
				g.fillOval(395,405,40,40);
					
				//Left Eye
				//Iris
				g.setColor(Color.darkGray);
				g.fillOval(500, 390, 70, 70);
				//Pupil
				g.setColor(Color.black);
				g.fillOval(515,404,40,40);                                                                                  		
                                                    		                                                                                                                         
	}
	
	
	private void drawHabitat(Graphics g)
	{
		
	}
}

