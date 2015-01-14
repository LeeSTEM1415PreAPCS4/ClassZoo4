import java.awt.*;
import java.applet.*;
public class penguin extends Applet {

	public void paint(Graphics g)
	{	
		drawHabitat(g);
		drawAnimal(g);
		
	
	}

	private void drawAnimal(Graphics g)
	{ 	
		
	//body 
		  g.setColor(new Color(59,59,59)); 
		  g.fillOval(90,100,120,125);
		  g.setColor(Color.black);
	g.fillOval(100,50,100,100);
	g.fillOval(100,100,100,125);
	g.setColor(Color.white);
	g.fillOval(112,114,75,90);
	g.fillOval(115,60,70,80);
//eyes
	g.setColor(Color.black);
	g.fillOval(125,80,15,15);
	g.fillOval(160,80,15,15);

	g.setColor(Color.orange);
    //Nose
	  
    g.fillArc(125, 90, 50, 50, 190, 160);
    
  //feet
    g.fillOval(90, 210, 60, 20);
    g.fillOval(150, 210, 60, 20);
  
	
  
    
    //body 
	  g.setColor(new Color(59,59,59)); 
	  g.fillOval(390,100,120,125);
	  g.setColor(Color.black);
g.fillOval(400,50,100,100);
g.fillOval(400,100,100,125);
g.setColor(Color.white);
g.fillOval(412,114,75,90);
g.fillOval(415,60,70,80);
//eyes
g.setColor(Color.black);
g.fillOval(425,80,15,15);
g.fillOval(460,80,15,15);

g.setColor(Color.orange);
//Nose

g.fillArc(425, 90, 50, 50, 190, 160);

//feet
g.fillOval(390, 210, 60, 20);
g.fillOval(450, 210, 60, 20);
    
  
    
    

	}
	
	private void drawHabitat(Graphics g)
	{
		//Sky
		g.setColor(new Color(57,145,251)); 
		g.drawRect(0, 0,800,  220);
		  g.fillRect(0, 0, 800, 220);   
	}
}