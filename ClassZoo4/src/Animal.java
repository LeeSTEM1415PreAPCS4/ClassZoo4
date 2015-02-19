/************************************************
 * This makes a Narwhal in a car with hydraulics*
 * Code by Elijah Pena                          *
 ************************************************/

import javax.swing.*;

import java.awt.*;

final public class Animal {

	JFrame frame;

	DrawPanel drawPanel;

	private int k = 350;

	private int l = 200;

	boolean up = true;

	boolean down = false;

	//boolean left = true;

	//boolean right = false;

	public static void main(String[] args) {

		new Animal().go();

	}

	private void go() {

		frame = new JFrame("Narwhal");

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
		boolean hasgraphics=false;
		Car car1 = new Car();
		//Car car1 = new Car();
		public void paintComponent(Graphics g) {
			
			Graphics2D g2d = (Graphics2D) g;

			// Body

			g2d.setColor(new Color(109, 141, 145));
			g2d.fillArc(k, l, 175, 300, 180, -135);
			// Head
			// g2d.setColor(Color.black);
			g2d.fillArc(k + 60, l + 29, 105, 105, 45, -155);
			// Eyes
			g2d.setColor(new Color(235, 233, 223));
			g2d.fillOval(k + 150, l + 60, 10, 30);// Right
			g2d.fillOval(k + 135, l + 60, 10, 30);// Left
			// Irises
			g2d.setColor(new Color(0, 0, 255));
			g2d.fillOval(k + 152, l + 65, 6, 23);// Right
			g2d.fillOval(k + 137, l + 65, 6, 23);// Left
			// Horn
			g2d.setColor(new Color(235, 247, 200));
			Polygon horn = new Polygon();
			horn.addPoint(k + 150, l + 50);
			horn.addPoint(k + 225, l - 10);
			horn.addPoint(k + 165, l + 70);
			g2d.fillPolygon(horn);
			// Stripes on Horn
			g2d.setColor(new Color(252, 190, 88));
			g2d.drawArc(k + 150, l + 44, 27, 15, 180, -190);
			g2d.drawArc(k + 162, l + 36, 27, 15, 180, -180);
			g2d.drawArc(k + 172, l + 26, 23, 10, 180, -180);
			// Smile
			int y = 315;
			int yCoordinate = l + 70;
			for (int x = k + 112; x >= k + 80; x -= 1) {
				g2d.setColor(Color.black);
				g2d.drawArc(x, yCoordinate, 50, 50, y, -135);
				y -= 1;
			}
			// Tongue
			int o = 315;
			for (int n = k + 100; n >= k + 80; n -= 1) {
				g2d.setColor(Color.pink);
				g2d.drawArc(n, yCoordinate + 20, 15, 15, o, -135);
				o -= 1;
			}
			car1.setGraphics(g2d);
			car1.drawMe();
			car1.run();
		}

	}

	private void moveIt() {

		while (true) {

			/*if (k >= 375) {
				right = false;
				left = true;
			}

			if (k <= 325) {

				right = true;
				left = false;

			}*/

			if (l >= 225) {                    //DELETE THIS END COMMENT WHEN DONE

				up = true;

				down = false;

			}

			if (l <= 175) {

				up = false;

				down = true;

			}

			if (up) {

				l--;

			}

			if (down) {

				l++;

			}

			/*if (left) {

				k--;

			}

			if (right) {

				k++;

			}*/

			try {

				Thread.sleep(10);

			} catch (Exception exc) {
			}

			frame.repaint();

		}

	}

}