import java.awt.*;
import java.applet.*;
public class Puma extends Applet 
{
	public void paint (Graphics g)
	
			{
		//Background(Habitat)
		Color grass = new Color(73,125,2);
		g.setColor(grass);
		g.fillRect(0, 600, 1600, 300);
		Color sky = new Color(1, 152, 165);
		g.setColor(sky);
		g.fillRect(0, 0, 1600, 700);
		Color sun = new Color (254, 242, 101);
		g.setColor(sun);
		g.fillOval(1450, -50, 200, 200);
		
		 
		//Forest
		
		Color treebase = new Color(185,122,87);
		g.setColor(treebase);
		g.fillRect(100, 230, 75, 513);
		g.fillRect(300, 200, 75, 500);
		g.fillRect(500, 260, 75, 512);
		g.fillRect(700, 200, 75, 500);
		g.fillRect(900, 200, 75, 500);
		g.fillRect(1100, 200, 75, 534);
		g.fillRect(1300, 250, 75, 500);
		Color leaves = new Color(0, 128, 0);
		g.setColor(leaves);
		g.fillOval(20, 75, 250, 250);
		g.fillOval(210, 50, 255, 255);
		g.fillOval(410, 75, 250, 250);
		g.fillOval(600, 50, 266, 266);
		g.fillOval(810, 50, 250, 255);
		g.fillOval(1010, 77, 254, 254);
		g.fillOval(1210, 50, 260, 260);
		Color brownnew = new Color(128, 64, 0);
		g.setColor(brownnew);
		g.drawOval(113, 500, 50, 100);
		g.drawOval(120, 512, 35, 75);
		g.drawOval(313, 450, 50, 100);
		g.drawOval(320, 462, 35, 75);
		g.drawOval(510, 500, 50, 100);
		g.drawOval(517, 512, 35, 75);
		g.drawOval(710, 450, 50, 100);
		g.drawOval(717, 462, 35, 75);
		g.drawOval(913, 500, 50, 100);
		g.drawOval(920, 512, 35, 75);
		g.drawOval(1112, 480, 50, 100);
		g.drawOval(1118, 492, 35, 75);
		g.drawOval(1312, 500, 50, 100);
		g.drawOval(1318, 512, 35, 75);    
		
		//Animal(Puma)	 
	       
	    Color animal = new Color(56, 56, 56);
	    g.setColor(animal);
	    g.fillRect(970, 550, 20, 50);
	    g.fillRect(930, 550, 50, 20);
	    g.fillRect(850, 580, 35, 100);
	    g.fillRect(835, 680, 50, 25);
	    g.fillRect(675,680,50,25);
	    g.fillOval(655, 515, 300, 100);
	    g.fillRect(690, 580, 35, 100);
	    g.fillOval(600, 500, 100, 100);
	    Color eyes = new Color(255, 255, 121);
	    g.setColor(eyes);
	    g.fillOval(620, 528, 25, 20);
	    g.fillOval(655, 528, 25, 20);
	    Color snout = new Color(57, 57, 57);
	    g.setColor(snout);
	    g.fillOval(630, 560, 45, 45);
	    g.fillOval(600, 480, 35, 40);
	    g.fillOval(665, 480, 35, 40);
	   
        
	    
	    
	
	}
	    
	    

}
                                                                        