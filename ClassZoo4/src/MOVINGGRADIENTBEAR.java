//EMERSON SHANDS P4


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Graphics2D;
import java.awt.GradientPaint;


//vars and booleans
final public class MOVINGGRADIENTBEAR {
	JFrame frame;
	DrawPanel drawPanel;
	private int ALLX = 615;

	boolean left = false;
	boolean right = true;
	
//main class
	public static void main(String[] args) {
		new MOVINGGRADIENTBEAR().go();
	}

	//Setting frame
	private void go() {
		frame = new JFrame("[Familier of Zero]");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new DrawPanel();
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(1550, 800);
		frame.setLocation(10, 10);
		moveIt();
	}

	class DrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			
	//Designating the graphics and setting the background
			Graphics2D g2d = (Graphics2D) g;
			g.setColor(Color.MAGENTA);
			g.fillRect(0, 0, 13000, 1000);
			g.setColor(Color.gray);
			g.fillRect(100, 100, 1350, 600);
			
			  
	//drawing bear
			//chest- shape
			g2d.setColor(new Color(131,92,59));
			g2d.fillOval(ALLX-15, 300,325, 400);
			//ears
			  GradientPaint gp1 = new GradientPaint
		        		(5, 5,	Color.blue, 20, 20, Color.MAGENTA, true);
			  g2d.setPaint(gp1);
			
			g2d.fillArc(ALLX+2, 140,100, 100, 20, 220);
			
			 GradientPaint gp2 = new GradientPaint
		        		(5, 20,	Color.blue, 20, 5, Color.MAGENTA, true);
			  g2d.setPaint(gp2);
			  
			g2d.fillArc(ALLX+200, 140,100, 100, 310, 220);
			g2d.setColor(Color.black);
			g2d.fillArc(ALLX+15, 155,70, 70, 23, 200);
			g2d.fillArc(ALLX+215, 155,70, 70, 323, 200);
			
			//Head-shape
			g2d.setColor(new Color(131,92,59));
			g2d.fillOval(ALLX, 165,300, 200);
			
			
			
			//arms-connecting2d
			g2d.setColor(new Color(131,92,59));
		
			g2d.fillRoundRect(ALLX-125,160, 75, 190, 10, 10);
			g2d.fillRoundRect(ALLX+345,160, 75, 190, 10, 10);
			
			//left fore-arm
			g2d.fillOval(ALLX-125, 340, 75, 20);
			g2d.fillOval(ALLX-115, 345, 75, 20);
			g2d.fillOval(ALLX-105, 350, 75, 20);
			g2d.fillOval(ALLX-95, 355, 75, 20);
			g2d.fillOval(ALLX-85, 360, 75, 20);
			g2d.fillOval(ALLX-75, 365, 75, 20);
			g2d.fillOval(ALLX-65, 370, 75, 20);
			g2d.fillOval(ALLX-55, 375, 75, 20);
			g2d.fillOval(ALLX-45, 380, 75, 20);
			g2d.fillOval(ALLX-35, 385, 75, 20);
			g2d.fillOval(ALLX-25, 390, 75, 20);
			g2d.fillOval(ALLX-15, 395, 75, 20);
			
			//right fore-arm
			int x1= ALLX+345;
			int y1= 340;
		for (int jerk = 0; jerk <12; jerk+=1){
			g2d.fillOval(x1,y1, 75, 20);
			x1-=10;
			y1+=5;
		
		}
			
		
			//hands
		g2d.fillOval( ALLX-125, 140, 75, 50);	
		g2d.fillOval( ALLX+345, 140, 75, 50);
		
			//fg2dngers
		g2d.setColor(Color.black);
		g2d.fillOval( ALLX+353, 159, 10, 13);
		g2d.fillOval( ALLX+366, 155, 10, 13);
		g2d.fillOval( ALLX+379, 154, 10, 13);
		g2d.fillOval( ALLX+392, 157, 10, 13);
		g2d.fillOval( ALLX+405, 160, 10, 13);
		
		g2d.fillOval( ALLX-117, 159, 10, 13);
		g2d.fillOval( ALLX-105, 155, 10, 13);
		g2d.fillOval( ALLX-93, 154, 10, 13);
		g2d.fillOval( ALLX-81, 157, 10, 13);
		g2d.fillOval( ALLX-69, 160, 10, 13);
		
		//palms
		g2d.fillOval( ALLX+350, 185, 40, 20);
		g2d.fillOval( ALLX+375, 185, 40, 20);
		g2d.fillOval( ALLX+363, 175, 40, 20);
		
		g2d.fillOval( ALLX-123, 185, 40, 20);
		g2d.fillOval( ALLX-90, 185, 40, 20);
		g2d.fillOval( ALLX-107, 175, 40, 20);
		
		// belly
		 GradientPaint gp5 = new GradientPaint
	        		(5,20,	new Color(132, 220, 70), 20, 20, new Color (30,220,64), true);
		  g2d.setPaint(gp5);
		g2d.fillOval( ALLX+40, 360,220, 310);
		
		//leg2ds
		 GradientPaint fp1 = new GradientPaint
	        		(5, 20,	new Color(33, 1, 156), 4, 30,new Color(220, 30, 4), true);
		  g2d.setPaint(fp1);
		g2d.fillOval( ALLX+10,550,120,160);
		 GradientPaint fp2 = new GradientPaint
	        		(4, 20,	new Color(25, 10, 5), 5, 30, Color.MAGENTA, true);
		  g2d.setPaint(fp2);
		g2d.fillOval( ALLX+165,550,120,160);
		

		//details
			//nose
		g2d.setColor(Color.BLACK);
		int[] noseX= new int[]{ ALLX+142, ALLX+162, ALLX+152};
		int[] noseY= new int[]{270,270,290};
		g2d.fillPolygon(noseX, noseY, 3);
			//eyes
		 GradientPaint gp3 = new GradientPaint
	        		(5, 20,	new Color(100,30,78), 20, 20, new Color(96,145,145), true);
		  g2d.setPaint(gp3);
		g2d.fillOval(ALLX+65, 210, 45, 70);
		 GradientPaint gp4 = new GradientPaint
	        		(5,20,	Color.GRAY, 20, 20, Color.red, true);
		  g2d.setPaint(gp4);
		g2d.fillOval(ALLX+185, 210, 45, 70);
			//mouth
		g2d.setColor(Color.BLACK);
		g2d.drawLine( ALLX+152, 290,  ALLX+175, 303);
		g2d.drawLine(  ALLX+152, 290,  ALLX+129, 303);
		
		// background logo
	
		
		}
	}

	//moving through the booleans and vars
	private void moveIt() {
		while (true) {
			if (ALLX >= 1125) {
				right = false;
				left = true;
			}
			if (ALLX <= 130) {
				right = true;
				left = false;
			}
			
			if (left) {
			ALLX -= 5;
			
			}
			if (right) {
			ALLX += 5;
			}
		
			try {
				Thread.sleep(10);
			} catch (Exception exc) {
			}
			//constant paints
			frame.repaint();
		}
	}
}
