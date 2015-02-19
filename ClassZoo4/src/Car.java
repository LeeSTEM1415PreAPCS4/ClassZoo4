/*****************************
 * This only contains the car*
 * Code by Elijah Peña       *
 *****************************/

import javax.swing.*;

import java.awt.*;

import java.util.Random;

final public class Car {
	private int carX = 250; //Car x value
	private int carY = 375; //car y value
	boolean rotateUp = true; //Car starts by rotating up
	boolean RotateDown = false; 
	Random rand = new Random();
	Color randomColor = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
	boolean moveUp = true;
	boolean moveDown = false;
	Graphics2D g2d;
	Polygon HydroCar = new Polygon();
	Polygon window = new Polygon();
	public void setGraphics(Graphics2D g){
		g2d=g;
	}
	public void drawMe(int carX, int carY) {
		window.reset();
		GradientPaint gp1 = new GradientPaint(0,0,Color.cyan,15,15,Color.magenta,true);
		g2d.setPaint(gp1);
		System.out.println("X="+carX);
		System.out.println("Y="+carY);
		HydroCar.reset();
		HydroCar.addPoint(carX, carY);//Bottom left of car
		HydroCar.addPoint(carX+400, carY);//Bottom Right
		HydroCar.addPoint(carX+400, carY-30);//Front Bumper
		HydroCar.addPoint(carX+350, carY-30);//Up to Windshield
		HydroCar.addPoint(carX+250, carY-200);//Diagnol up
		HydroCar.addPoint(carX+150, carY-200);//Top
		HydroCar.addPoint(carX+100, carY-175);//Top Left Window
		HydroCar.addPoint(carX+250, carY-175);//Top Right Window
		HydroCar.addPoint(carX+300, carY-30);//Bottom Right
		HydroCar.addPoint(carX+75, carY-30);//Bottom Left
		HydroCar.addPoint(carX+100, carY-175);//Top Let Again
		HydroCar.addPoint(carX+25, carY-30);
		HydroCar.addPoint(carX, carY-30);//Bumper Back*/
		g2d.fillPolygon(HydroCar);
		g2d.fillArc(carX+385,carY-30,30,30,-90,180);
		//Stuff for the car window
		g2d.setColor(new Color(0,0,255));
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,10*.03f));//transparency for window
		window.addPoint(carX+100, carY-175);//Top Left Window
		window.addPoint(carX+250, carY-175);//Top Right Window
		window.addPoint(carX+300, carY-30);//Bottom Right Window
		window.addPoint(carX+75, carY-30);//Bottom Left Window
		g2d.fillPolygon(window);
		
	}
	/*public void run() {
		
		while (true) {
			
			if (carY >= 510) {
				moveUp = true;
				moveDown = false;
				//System.out.println("Up");
			}
			
			if (carY <=30) {
				moveUp = false;
				moveDown = true;
				//System.out.println("Down");
			}
			
			if (moveUp) {
				carY-=1;
				//System.out.println("RUp");
			}
			
			if(moveDown) {
				carY+=1;	
				//System.out.println("RDown");
				}
			try{
				Thread.sleep(10);
			}catch(Exception exc){
				
			}
			//System.out.println("Run Ran");
			this.drawMe();
		}
	}*/
}
