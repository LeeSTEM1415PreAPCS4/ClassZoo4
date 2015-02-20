import javax.swing.*;

import java.awt.*;

final public class JellyFishZoo {

	JFrame frame;

	DrawPanel drawPanel;
 // integers used for animations
	private int oneX = 500;

	private int oneY = 50;
// creates booleans for if statements located later in code
	boolean up = false;

	boolean down = true;

	boolean left = false;

	boolean right = true;

	public static void main(String[] args) {
		// tells the class go to do the thing
		new JellyFishZoo().go();

	}

	private void go() {
		// create the JFrame and set settings for it
        // creates JFrame
		frame = new JFrame("Test"); 
		//Closes when x is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // creates drawpanel
		drawPanel = new DrawPanel();
		//drawPanel inside the JFrame, finds the size of the panel to create it
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        // makes visible
		frame.setVisible(true);
		// can't change size
		frame.setResizable(false);
		//what the size is
		frame.setSize(1600, 900);
		//title
		frame.setTitle("The Best Jelly Fish");
        // where the JFrame is
		frame.setLocation(0, 0);
		//calls on class moveIt to go
		moveIt();

	}

	class DrawPanel extends JPanel {

		public void paintComponent(Graphics g) {
			  Graphics2D g2d = (Graphics2D) g;
			
			//water/background
	        Color ocean = new Color(18,38,107);
	        g2d.setColor(new Color(18, 38, 107));
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			 // background bubbles, oneY animates
	        GradientPaint bubble = new GradientPaint(65,6,
				Color.white, 10, 10, ocean, true);
	        g2d.setPaint(bubble);
			g2d.fillOval(oneY+70, 500, 20, 20);
			g2d.fillOval(oneY+100, 600, 20, 20);
			g2d.fillOval(oneY+280, 560, 20, 20);
			g2d.fillOval(oneY+150, 400, 20, 20);
			g2d.fillOval(oneY+160, 300, 20, 20);
			g2d.fillOval(oneY+200, 200, 20, 20);
			g2d.fillOval(oneY+300, 400, 30, 30);
		
			// setting the pun, the animation is done with the varaible oneY
			// bubble around jelly
			g2d.drawOval(oneY, 500, 300, 300);
			//Jelly Jar
			g2d.setColor(Color.WHITE);
			g2d.fillRoundRect(oneY+100, 600, 100, 150, 20, 15);
			//label
			g2d.setColor(Color.RED);
			g2d.fillRect(oneY+100,625,100,50);
			g2d.setColor(Color.WHITE);
			g2d.drawString("Supreme Jelly", oneY+110, 655);
			//jelly
			Color Jelly = new Color(160,112,113);
			GradientPaint jelly = new GradientPaint(65, 7, 
		   		    Color.white, 10, 20, Jelly, true);
		   	g2d.setPaint(jelly);
			g2d.fillRect(oneY+100,679,98,65);
			

		
			//What do you do with a drunken sailor,What do you do with a drunken sailor,Earl-eye in the morning!

			Color noodle = new Color (173,58,250);
			g2d.setColor(noodle);
			g2d.drawString("What do you do with a drunken sailor", 450, 450);
			g2d.drawString("What do you do with a drunken sailor", 450, 460);
			g2d.drawString("What do you do with a drunken sailor", 450, 470);
			g2d.drawString("Earl-eye in the morning", 460, 480);

			//setting color for the tentacles
			GradientPaint tent = new GradientPaint(95,10,
					noodle, 400, 40, ocean, true);
			g2d.setPaint(tent);
			
			int y1 = 300;
			//top leg
			g2d.drawRect(oneX+335, y1+30,  100, 1);
			g2d.drawRect(oneX+435, y1+32,  100, 1);
			//2nd leg
			g2d.drawRect(oneX+295, y1+50,  100, 1);
			g2d.drawRect(oneX+395, y1+50,  1,  20);
			g2d.drawRect(oneX+395, y1+70,  100, 1);
			// gradient change for last 2 legs to make it flow better
			GradientPaint tent2 = new GradientPaint(95,10,
					noodle, 300, 40, ocean, true);
			g2d.setPaint(tent2);
			//3rd leg
			g2d.drawRect(oneX+215, y1+90,  100, 1);
			g2d.drawRect(oneX+315, y1+80,  1,  10);
			g2d.drawRect(oneX+315, y1+80,  50,  1);
			//last leg
			g2d.drawRect(oneX+175, y1+111, 100, 1);
			g2d.drawRect(oneX+270, y1+113, 100, 1);
			
			//body
			Color base = new Color (17, 118, 130);
			Color highlight = new Color (123, 35, 175);
		   	g2d.setColor(base);
		    g2d.fillArc(505, 305, 520, 120, 65, 180);
		    
		    // spots on the jellyfish, behind the eyes
		    g2d.setColor(highlight);
		    g2d.fillOval(560, 330, 50, 20);
		    g2d.fillOval(600, 400, 60, 10);
		    g2d.fillOval(700, 330, 45, 15);
		    
		    //eyes
		    g2d.setColor(Color.WHITE); // white of the eyes
		    g2d.fillOval(560, 340, 50, 7);
		    g2d.fillOval(600, 400, 50, 6);
		    g2d.fillOval(700, 330, 50, 6);
		    g2d.setColor(Color.black); // pupils
		    g2d.fillOval(570, 340, 6, 7);
		    g2d.fillOval(610, 400, 6, 6);
		    g2d.fillOval(710, 330, 6, 6);
		    //crown 
		    Color crown = new Color (245, 215, 107); // color
		    g2d.setColor(crown); // set color
		    g2d.fillArc(505, 318, 110, 180, 115, 40); // draw the crown
		   
		    
		    //animated gradient for the jewel
		    GradientPaint jewel = new GradientPaint(25, 26, 
		   		    Color.red, oneX, 20, Color.white, true); //oneX makes the gradient change to the red jewel
		   	g2d.setPaint(jewel); // calls on the gradient
		    g2d.fillRoundRect(520, 358, 20, 10,20,15); //jewel
			
			

		}

	}

	private void moveIt() {

		while(true){
 // setting integers so that they will animate 
			if(oneX >= 500){

				right = false;

				left = true;

			}

			if(oneX <= 420){

				right = true;

				left = false;

			}

			if(oneY >= 1600){
				oneY = -500;

		
				
			}

			if(oneY <= 7){

				up = false;

				down = true;

			}
			// what the directions do, in this code they only go to the right however its still helpful 
			// the variables are plugged into cordinates above so as they change the placements will change
			if(up){

				oneY--;

			}

			if(down){

				oneY++;

			}

			if(left){

				oneX--;

			}

			if(right){

				oneX++;

			}

			try{
				// 10 miliseconds between each frame
			Thread.sleep(10);

			} catch (Exception exc){}
			//animates

			frame.repaint();

		}

	}

}