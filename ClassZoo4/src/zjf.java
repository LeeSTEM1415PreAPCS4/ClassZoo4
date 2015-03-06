import java.util.Random;

import javax.swing.*;

import java.awt.*;

final public class zjf {

	JFrame frame;

	DrawPanel drawPanel;

	private int x = 650;

	private int y = 50;
	
	private int a = 650;

	private int b = 50;

	boolean up = false;

	boolean down = true;

	boolean left = false;

	boolean right = true;

	public static void main(String[] args) {

		new zjf().go();

	}

	private void go() {

		frame = new JFrame("Test");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		drawPanel = new DrawPanel();

		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

		frame.setVisible(true);

		frame.setResizable(false);

		frame.setSize(800, 800);

		frame.setLocation(375, 55);

		moveIt();

	}

	class DrawPanel extends JPanel {
		
		

		public void paintComponent(Graphics g) {
			Random rnd = new Random();
			//-----------------------------------------
			
//Gradient
			
			
		    Graphics2D g2d1 = (Graphics2D) g;
            g2d1.setBackground(Color.blue);
            Color color1 = getBackground();
            Color color2 = color1.darker().darker().darker().darker().darker().darker().darker().darker().darker();
            int w = getWidth();
            int h = getHeight(); 
            GradientPaint gp = new GradientPaint(
                    w, 0, color1,
                    0, h, color2);
            g2d1.setPaint(gp);
            g2d1.fillRect(0, 0, 800, 800);

		    
		    
		    
		    
		    
		    
		    /////////////////////////////////////
            
          //LEGS
			//LEFT
    g.setColor(Color.black);
	g.fillRect(115, 245, 50, 60);
	g.setColor(new Color(155, 0, 255));
	g.fillRect(120, 250, 40, 50);
			//RIGHT
	g.setColor(Color.black);
	g.fillRect(235, 245, 50, 60);
	g.setColor(new Color(155, 0, 255));
	g.fillRect(240, 250, 40, 50);
	//BODY
	g.setColor(Color.black);
	g.fillOval(100, 100, 200, 200);
	g.setColor(new Color(155, 0, 255));
	g.fillOval(105, 105, 190, 190);
	//HEAD
				//EARS
			g.setColor(Color.black);
			g.fillOval(140, 170, 50, 50);
			g.fillOval(210, 170, 50, 50);
	//CRANIUM
	g.setColor(Color.black);
	g.fillOval(150, 180, 100, 100);
	g.setColor(new Color(155, 0, 255));
	g.fillOval(155, 185, 90, 90);
				//COSMETIC
				g.setColor(Color.white);
				g.fillOval(x, y, 25, 25);
				g.setColor(Color.black);
				g.fillOval(a, b, 25, 25);

		}

	}

	private void moveIt() {

		while (true) {

			if (x >= 650) {

				right = false;

				left = true;

			}

			if (x <= 550) {

				right = true;

				left = false;

			}

			if (y >= 50) {

				up = true;

				down = false;

			}

			if (y <= 0) {

				up = false;

				down = true;

			}

			if (up) {

				y--;

			}

			if (down) {

				y++;

			}

			if (left) {

				x--;

			}

			if (right) {

				x++;

			}

			try {

				Thread.sleep(10);

			} catch (Exception exc) {
			}
			if (a >= 650) {

				right = false;

				left = true;

			}

			if (b <= 550) {

				right = true;

				left = false;

			}

			if (a >= 50) {

				up = true;

				down = false;

			}

			if (b <= 0) {

				up = false;

				down = true;

			}

			if (up) {

				b--;

			}

			if (down) {

				b++;

			}

			if (left) {

				a--;

			}

			if (right) {

				a++;

			}

			try {

				Thread.sleep(10);

			} catch (Exception exc) {
			}

			frame.repaint();

		}

	}

}

