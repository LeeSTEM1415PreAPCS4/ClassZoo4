import java.awt.*;
import java.awt.geom.Point2D;
import java.applet.*;
import java.util.Random;

	public class Pig extends Applet 
	{
		public void paint(Graphics g)
		{
//Sky
	g.setColor(Color.blue);
		g.fillRect(0, 0, 1000, 1000);
//Grass	
	g.setColor(Color.green);
		g.fillRect(0, 600, 1000,200);
//cloud
	g.setColor(Color.yellow);
//		g.fillOval(130, 110, 30, 30);
//		g.fillOval(150, 115, 30, 30);
	//	g.fillOval(165, 115, 30, 30);
//		g.fillOval(160, 125, 30, 30);

		//g.fillOval(130, 110, 150, 30);
//Spikes in Grass
	g.setColor(Color.green);
		g.fillRect(10, 550, 30, 200);
		g.fillRect(80, 550, 30, 200);
		g.fillRect(150, 550, 30, 200);
		g.fillRect(220, 550, 30, 200);
		g.fillRect(290, 550, 30, 200);
		g.fillRect(360, 550, 30, 200);
		g.fillRect(430, 550, 30, 200);
		g.fillRect(500, 550, 30, 200);
		g.fillRect(570, 550, 30, 200);
		g.fillRect(640, 550, 30, 200);
		g.fillRect(710, 550, 30, 200);
		g.fillRect(780, 550, 30, 200);
		g.fillRect(850, 550, 30, 200);
		g.fillRect(920, 550, 30, 200);
//hippo 
	//ears
	g.setColor(Color.GRAY);
		g.fillOval(100, 260, 60, 50);
		g.fillOval(150, 250, 60, 50);
	//head	
		g.fillOval(125, 290, 110, 110);
	//body
		g.fillOval(210, 310, 375, 160);
	//legs
		g.fillRect(290, 350, 75, 250);
		g.fillRect(450, 350, 75, 250);
	//tail
		g.fillRect(560, 380, 100, 20);
	//eyes
	g.setColor(Color.black);
		g.fillOval(145, 320, 30, 20);
		g.fillOval(190, 320, 30, 20);
	//mouth
		g.fillRect(145, 360, 70, 25);
	//teeth
//	g.setColor(Color.MAGENTA);
//		g.fillRect(150, 360, 20, 35);
//		g.fillRect(190, 360, 20, 35);
	//feet cut
	g.setColor(Color.black);
		g.fillRect(485, 456, 4, 145);
		g.fillRect(325, 456, 4, 140);
	//spots
	g.setColor(Color.pink);
		g.fillOval(250, 340, 30, 30);
		g.fillOval(350, 380, 30, 30);
		g.fillOval(455, 330, 30, 30);
		g.fillOval(275, 370, 30, 30);
		g.fillOval(485, 390, 30, 30);
	//sun
		g.setColor(Color.yellow);
		g.fillOval(650,30,80,80);
		// Draw the roof
		
	// Draw the body of house
		g.setColor(Color.red);
				g.fillRect(750,480,120,120);
	// draw the door
		g.setColor(Color.white);
				g.fillRect(795,538,30,60);
	//draw chimney
		g.setColor(Color.black);
				g.fillRect(770,450,10,30);
				



	}
}
