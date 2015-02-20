import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
/*
 * Omar Shamaa
 */
public class OceanSponge extends JFrame implements KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Pain pane = new Pain();
	boolean SpongebobCalled = false;

	public OceanSponge() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		System.out.println(SpongebobCalled);
		initUI();
		setTitle("Hio");
		setVisible(true);
		setEnabled(true);
	}

	public void initUI() {
		addKeyListener(this);
		add(pane);
		pack();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		Character key = arg0.getKeyChar();
		if (key == 'A' || key == 'a' || key == 'd' || key == 'D' || key == 'W'
				|| key == 'w' || key == 's' || key == 'S') {
			System.out.println((arg0.getKeyCode()) + "Is the keycode");
			pane.drawAnimal(key);
			super.repaint();

		}
		System.out.println(arg0.getKeyCode());
	}

	public void keyReleased(KeyEvent e) {
		// System.out.println(e.getKeyChar());

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				OceanSponge ex = new OceanSponge();
			}
		});

	}

	public void keyTyped(KeyEvent e) {

	}

}

class Pain extends JPanel {
	/**
	 *
	 */
	
	private static final long serialVersionUID = 1L;
	/////////////Global Variables//////
	Graphics2D Spongebob = null;
	int x = 0;
	int y = 0;
	int width = 0;
	int height = 0;
	Polygon RArm = new Polygon();
	Polygon LArm = new Polygon();
	Polygon RLeg = new Polygon();
	Polygon LLeg = new Polygon();
	Polygon LShoulder = new Polygon();
	Polygon RShoulder = new Polygon();
	Polygon LSock = new Polygon();
	Polygon RSock = new Polygon();
	Polygon LRStripe = new Polygon();
	Polygon RRStripe = new Polygon();
	Polygon LBStripe = new Polygon();
	Polygon RBStripe = new Polygon();
	Polygon RShoe = new Polygon();
	Polygon LShoe = new Polygon();
	Polygon Pants = new Polygon();
	Polygon Shirt = new Polygon();
	Polygon LPants = new Polygon();
	Polygon RPants = new Polygon();
	Polygon Tie = new Polygon();
	Polygon Belt1 = new Polygon();
	Polygon Belt2 = new Polygon();
	Polygon Belt3 = new Polygon();
	String Dir;
	int imgn=1;
	int oldx = 1;
	int oldy = 1;
	////////////////////////////////////////////
	@Override
	public void paintComponent(Graphics g) {
		Spongebob = (Graphics2D) g;
		System.out.println("Paint drawn");
		drawHabitat(Spongebob);
		
		drawAnimal('N');
	}
	//////Draw Spongebob/////////////
	public void drawAnimal(char key) {
		System.out.println("Animal drawn");
		Spongebob.setColor(new Color(155, 155, 255));
		Spongebob.fillPolygon(RArm);
		Spongebob.fillPolygon(LArm);
		Spongebob.fillPolygon(RLeg);
		Spongebob.fillPolygon(LLeg);
		Spongebob.fillPolygon(LShoulder);
		Spongebob.fillPolygon(RShoulder);
		Spongebob.fillPolygon(LShoe);
		Spongebob.fillPolygon(RShoe);
		Spongebob.fillPolygon(LPants);
		Spongebob.fillPolygon(RPants);
		Spongebob.fillRect(x - width, y - height, width, height);
	
		
		if (key == 'N') {
			if (oldx == 1 && oldy == 1) {
				width = super.getWidth() / 5;
				height = super.getHeight() / 5;
				x = super.getWidth();
				y = super.getHeight() - ((int) (height * .25));
				Dir = "";
				oldx = x;
				oldy = y;
			}
		} else if (key == 'A' || key == 'a') {
			x -= 5;
			Dir = "Left";
		} else if (key == 'D' || key == 'd') {
			x += 5;
			Dir = "Right";
		} else if (key == 'w' || key == 'W') {
			y -= 5;
			Dir = "Up";
		} else if (key == 's' || key == 'S') {
			y += 5;
			Dir = "Down";
		}

		if (x <= 0 - width) {
			if(imgn==1){
				imgn=0;
			}else{
				imgn=1;
			}
			x = (int) super.getWidth() - 5;
		} else if (x >= (int) super.getWidth() + width) {
			x = 0 + 5;
			if(imgn==1){
				imgn=0;
			}else{
				imgn=1;
			}
		} else if (y <= 0 - height) {
			y = (int) super.getHeight();
			
		} else if (y >= (int) super.getHeight() + height) {
			y = height;
		}

		Spongebob.setColor(Color.yellow);
		Spongebob.fillRect(x - width, y - height, width, height);
		draw_Inside();
	}
	//////Draw Spongebobs Background//////////////
	public void drawHabitat(Graphics g) {
		/*g.setColor(new Color(155, 155, 255));
		g.fillRect(0, 0, super.getWidth(), super.getHeight());*/
		BufferedImage img = null;
		try {
			if(imgn==1){
				img = ImageIO.read(new File("res/SB_ExtrSp_Scr_10.PNG"));
			}else{
				img = ImageIO.read(new File("res/Bbpolicestation.JPG"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, super.getWidth(), super.getHeight(), null);
	}

	public void draw_Inside() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(Dir);
		Spongebob.setColor(new Color(204, 204, 0));
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("res/Sponhebob.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Spongebob.drawImage(img, x-width, (int)((y-height)), width, (int)(height*.8), null);
		/*for (int i = 0; i <= 50; i++) {
			int size = (int) (Math.random() * (width / 10));
			Spongebob.fillOval((x - width)
					+ (int) (Math.random() * (width - size)), (y - height)
					+ (int) (Math.random() * (height - size)), size, size);
		}*/
		Spongebob.setColor(new Color(255, 255, 255));
		Spongebob.fillOval((x - width) + width / 5, (y - height) + width / 5,
				width / 4, height / 4);
		Spongebob.fillOval((x - width) + width / 2, (y - height) + width / 5,
				width / 4, height / 4);
		Spongebob.setColor(Color.blue);
		if (Dir == "Right") {
			Spongebob.fillOval((x - width) + width / 5 + (width / 10),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
			Spongebob.fillOval((x - width) + width / 2 + (width / 10),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
			Spongebob.setColor(new Color(0, 200, 0));
			Spongebob.drawOval((x - width) + width / 5 + (width / 10),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
			Spongebob.drawOval((x - width) + width / 2 + (width / 10),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
		} else if (Dir == "Left") {
			Spongebob.fillOval((x - width) + width / 5 + (width / 150),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
			Spongebob.fillOval((x - width) + width / 2 + (width / 150),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
			Spongebob.setColor(new Color(0, 200, 0));
			Spongebob.drawOval((x - width) + width / 5 + (width / 150),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
			Spongebob.drawOval((x - width) + width / 2 + (width / 150),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
		} else if (Dir == "Up") {
			Spongebob
					.fillOval((x - width) + (int) (width * .45) + (width / 10),
							(y - height) + (int) (width * 0.2), width / 10,
							height / 10);
			Spongebob
					.fillOval((x - width) + (int) (width * .15) + (width / 10),
							(y - height) + (int) (width * 0.2), width / 10,
							height / 10);
			Spongebob.setColor(new Color(0, 200, 0));
			Spongebob
					.drawOval((x - width) + (int) (width * .45) + (width / 10),
							(y - height) + (int) (width * 0.2), width / 10,
							height / 10);
			Spongebob
					.drawOval((x - width) + (int) (width * .15) + (width / 10),
							(y - height) + (int) (width * 0.2), width / 10,
							height / 10);
		} else if (Dir == "Down") {
			Spongebob
					.fillOval((x - width) + (int) (width * .45) + (width / 10),
							(y - height) + (int) (width * 0.3), width / 10,
							height / 10);
			Spongebob
					.fillOval((x - width) + (int) (width * .15) + (width / 10),
							(y - height) + (int) (width * 0.3), width / 10,
							height / 10);
			Spongebob.setColor(new Color(0, 200, 0));
			Spongebob
					.drawOval((x - width) + (int) (width * .45) + (width / 10),
							(y - height) + (int) (width * 0.3), width / 10,
							height / 10);
			Spongebob
					.drawOval((x - width) + (int) (width * .15) + (width / 10),
							(y - height) + (int) (width * 0.3), width / 10,
							height / 10);
		} else {
			Spongebob.fillOval(
					(x - width) + (int) (width * .45) + (width / 10),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
			Spongebob.fillOval(
					(x - width) + (int) (width * .15) + (width / 10),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
			Spongebob.setColor(new Color(0, 200, 0));
			Spongebob.drawOval(
					(x - width) + (int) (width * .45) + (width / 10),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
			Spongebob.drawOval(
					(x - width) + (int) (width * .15) + (width / 10),
					(y - height) + (int) (width * 0.25), width / 10,
					height / 10);
		}
		/////////Create Left Shoulder/////////////////////
		LShoulder.reset();
		double YRocoSh = 0.45;
		LShoulder.addPoint(x - width, y - (int) (height * YRocoSh));
		LShoulder.addPoint(x - width - (int) (width * .15), y
				- (int) (height * YRocoSh));
		LShoulder.addPoint(x - width - (int) (width * .15), y
				- (int) (height * (YRocoSh - 0.1)));
		LShoulder.addPoint(x - width, y - (int) (height * (YRocoSh - 0.1)));
		// /////////////////////Create Right Shoulder////////
		double YLocoSh = 0.45;
		RShoulder.reset();
		RShoulder.addPoint(x, y - (int) (height * YLocoSh));
		RShoulder.addPoint(x + (int) (width * .15), y
				- (int) (height * YLocoSh));
		RShoulder.addPoint(x + (int) (width * .15), y
				- (int) (height * (YLocoSh - 0.1)));
		RShoulder.addPoint(x, y - (int) (height * (YLocoSh - 0.1)));
		///////////////////Legs/////////////////////////////
		LLeg.reset();
		LLeg.addPoint(x - ((int) (width * .2)), y);
		LLeg.addPoint(x - ((int) (width * .2)), y + ((int) (width * .4)));
		LLeg.addPoint(x - ((int) (width * .3)), y + ((int) (width * .4)));
		LLeg.addPoint(x - ((int) (width * .3)), y);
		RLeg.reset();
		/////////////////////////Create Right Leg////////////
		RLeg.addPoint(x - ((int) (width * .7)), y);
		RLeg.addPoint(x - ((int) (width * .7)), y + ((int) (width * .4)));
		RLeg.addPoint(x - ((int) (width * .8)), y + ((int) (width * .4)));
		RLeg.addPoint(x - ((int) (width * .8)), y);
		RSock.reset();
		/////////////////////////Create Right Sock//////////
		RSock.addPoint(x - ((int) (width * .7)), y + ((int) (width * .1)));
		RSock.addPoint(x - ((int) (width * .7)), y + ((int) (width * .4)));
		RSock.addPoint(x - ((int) (width * .8)), y + ((int) (width * .4)));
		RSock.addPoint(x - ((int) (width * .8)), y + ((int) (width * .1)));
		LSock.reset();
		//////////////////////Create left Sock////////////////
		LSock.addPoint(x - ((int) (width * .2)), y + ((int) (width * .1)));
		LSock.addPoint(x - ((int) (width * .2)), y + ((int) (width * .4)));
		LSock.addPoint(x - ((int) (width * .3)), y + ((int) (width * .4)));
		LSock.addPoint(x - ((int) (width * .3)), y + ((int) (width * .1)));
		LRStripe.reset();
		///////////////Create Left Sock Red Stripe///////////////
		LRStripe.addPoint(x - ((int) (width * .2)), y + ((int) (width * .25)));
		LRStripe.addPoint(x - ((int) (width * .2)), y + ((int) (width * .3)));
		LRStripe.addPoint(x - ((int) (width * .3)), y + ((int) (width * .3)));
		LRStripe.addPoint(x - ((int) (width * .3)), y + ((int) (width * .25)));
		RRStripe.reset();
		//////////////////Create Right Sock Red Stripe///////
		RRStripe.addPoint(x - ((int) (width * .7)), y + ((int) (width * .25)));
		RRStripe.addPoint(x - ((int) (width * .7)), y + ((int) (width * .3)));
		RRStripe.addPoint(x - ((int) (width * .8)), y + ((int) (width * .3)));
		RRStripe.addPoint(x - ((int) (width * .8)), y + ((int) (width * .25)));
		RBStripe.reset();
		/////////////Create Right Sock Blue Stripe///////////
		RBStripe.addPoint(x - ((int) (width * .7)), y + ((int) (width * .15)));
		RBStripe.addPoint(x - ((int) (width * .7)), y + ((int) (width * .2)));
		RBStripe.addPoint(x - ((int) (width * .8)), y + ((int) (width * .2)));
		RBStripe.addPoint(x - ((int) (width * .8)), y + ((int) (width * .15)));
		LBStripe.reset();
		//////////////////Create Left Sock Blue Stripe///////////
		LBStripe.addPoint(x - ((int) (width * .2)), y + ((int) (width * .15)));
		LBStripe.addPoint(x - ((int) (width * .2)), y + ((int) (width * .2)));
		LBStripe.addPoint(x - ((int) (width * .3)), y + ((int) (width * .2)));
		LBStripe.addPoint(x - ((int) (width * .3)), y + ((int) (width * .15)));
		LShoe.reset();
		/////////////////Create Left Shoe+Pointing///////////////
		if (Dir == "Left") {
			LShoe.addPoint(x - ((int) (width * 0.15)), y
					+ ((int) (width * .45)));
			LShoe.addPoint(x - ((int) (width * 0.15)), y
					+ ((int) (width * .35)));
			LShoe.addPoint(x - ((int) (width * .35)), y + ((int) (width * .35)));
			LShoe.addPoint(x - ((int) (width * .45)), y + ((int) (width * .45)));
		} else {
			LShoe.addPoint(x - ((int) (width * 0.05)), y
					+ ((int) (width * .45)));
			LShoe.addPoint(x - ((int) (width * 0.15)), y
					+ ((int) (width * .35)));
			LShoe.addPoint(x - ((int) (width * .35)), y + ((int) (width * .35)));
			LShoe.addPoint(x - ((int) (width * .35)), y + ((int) (width * .45)));
		}
		RShoe.reset();
		///////////Configure Right Shoe+Point//////
		if (Dir == "Left") {
			LShoe.addPoint(x - ((int) (width * 0.65)), y
					+ ((int) (width * .45)));
			LShoe.addPoint(x - ((int) (width * 0.65)), y
					+ ((int) (width * .35)));
			LShoe.addPoint(x - ((int) (width * .85)), y + ((int) (width * .35)));
			LShoe.addPoint(x - ((int) (width * .95)), y + ((int) (width * .45)));
		} else {
			LShoe.addPoint(x - ((int) (width * 0.55)), y
					+ ((int) (width * .45)));
			LShoe.addPoint(x - ((int) (width * 0.65)), y
					+ ((int) (width * .35)));
			LShoe.addPoint(x - ((int) (width * .85)), y + ((int) (width * .35)));
			LShoe.addPoint(x - ((int) (width * .85)), y + ((int) (width * .45)));
		}
		//////////////Shirt Configuration////////
		Shirt.reset();
		Shirt.addPoint(x, y);
		Shirt.addPoint(x - width, y);
		Shirt.addPoint(x - width, y - (int) (height * .25));
		Shirt.addPoint(x, y - (int) (height * .25));
		////////////Create Pants/////////////////
		Pants.reset();
		Pants.addPoint(x, y);
		Pants.addPoint(x - width, y);
		Pants.addPoint(x - width, y - (int) (height * .15));
		Pants.addPoint(x, y - (int) (height * .15));
		///////////////////Create Left Pants////////
		LPants.reset();
		LPants.addPoint(x - ((int) (width * .15)), y);
		LPants.addPoint(x - ((int) (width * .1)), y + ((int) (width * .1)));
		LPants.addPoint(x - ((int) (width * .4)), y + ((int) (width * .1)));
		LPants.addPoint(x - ((int) (width * .35)), y);
		RPants.reset();
		////////////Create Right Pants////////////////
		RPants.addPoint(x - ((int) (width * .65)), y);
		RPants.addPoint(x - ((int) (width * .6)), y + ((int) (width * .1)));
		RPants.addPoint(x - ((int) (width * .9)), y + ((int) (width * .1)));
		RPants.addPoint(x - ((int) (width * .85)), y);
		Tie.reset();
		///////Create Tie///////////////////////////
		Tie.addPoint(x - (int) (width * .45), y - (int) (height * .25));
		Tie.addPoint(x - (int) (width * .55), y - (int) (height * .25));
		Tie.addPoint(x - (int) (width * .45), y - (int) (height * .1));
		Tie.addPoint(x - (int) (width * .5), y - (int) (height * .05));
		Tie.addPoint(x - (int) (width * .55), y - (int) (height * .1));
		Belt1.reset();
		Belt2.reset();
		Belt3.reset();	      
		///////////////////////////////Color Everything//////
		Spongebob.setColor(Color.yellow);
		Spongebob.fillPolygon(LArm);
		Spongebob.fillPolygon(LLeg);
		Spongebob.fillPolygon(RLeg);
		Spongebob.setColor(Color.white);
		Spongebob.fillPolygon(LShoulder);
		Spongebob.fillPolygon(RShoulder);
		Spongebob.fillPolygon(LSock);
		Spongebob.fillPolygon(RSock);
		Spongebob.fillPolygon(Shirt);
		Spongebob.setColor(Color.blue);
		Spongebob.fillPolygon(LBStripe);
		Spongebob.fillPolygon(RBStripe);
		Spongebob.setColor(Color.black);
		Spongebob.fillPolygon(LShoe);
		Spongebob.fillPolygon(RShoe);
		Spongebob.setColor(new Color(102, 51, 0));
		Spongebob.fillPolygon(Pants);
		Spongebob.fillPolygon(LPants);
		Spongebob.fillPolygon(RPants);
		Spongebob.setColor(Color.red);
		Spongebob.fillPolygon(LRStripe);
		Spongebob.fillPolygon(Tie);
		Spongebob.fillPolygon(RRStripe);
	}

	public Pain() {
		setPreferredSize(new Dimension(600, 800));
		setEnabled(true);
		setVisible(true);

	}
}