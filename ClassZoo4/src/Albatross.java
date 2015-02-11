import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.annotation.Inherited;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
/**@author wwatson7940*/
public class Albatross extends Applet implements Runnable, MouseListener{
	
	private static final long serialVersionUID = 3591321775330098188L;
	/**draw to this then draw to screen*/
	Graphics bufferGraphics;
	/**image to draw to screen*/
    Image offscreen; 
    /**dimension of the screen*/
    Dimension dim;
    /**position of animal*/
    int animx = 0, animy = 0;
    /**position that the animal should move towards*/
    int desiredx = 0, desiredy = 0;
    /**whether desired position is not equal to the animal position. To be used for animation*/
    boolean flying = false;
    
    /**Polygon for flying*/
    Polygon Flying = new Polygon();
    /**Polygon for standing*/
    Polygon NotFlying = new Polygon();
    /**Posible locations for the albatross to stand*/
    Point[] locationsToLand = new Point[]{
    	new Point(0, 0),
    	new Point(70, 70),
    	new Point(140, 140),
    };
    /**
     * setup Albatross Polygons
     * @see Polygon
     */
    public void setUpPolygons(){
    	Flying.addPoint(0, 0);
    	Flying.addPoint(20, 0);
    	Flying.addPoint(20, 20);
    	Flying.addPoint(0, 20);
    	
    	NotFlying.addPoint(0, 0);
    	NotFlying.addPoint(20, 0);
    	NotFlying.addPoint(20, 20);
    	NotFlying.addPoint(0, 20);
    }
    
    /**{@link Applet}*/
    public void init() { 
    	setUpPolygons();
    	dim = getSize(); 
    	paint = new GradientPaint(new Point(0, 0), new Color(1f, 1f, 1f), new Point(dim.width, dim.height), new Color(0f, 0f, 0f));
        setBackground(Color.white); 
        offscreen = createImage(dim.width,dim.height); 
        bufferGraphics = offscreen.getGraphics();
        addMouseListener(this);
        new Thread(this).start();
    }
    /**{@link Applet}*/
	public void paint(Graphics g)
	{
		try{
			draw();
		}catch(NullPointerException e){}
		g.drawImage(offscreen,0,0,this); 
	}
	/**Draw to the buffergraphics object
	 * @see Graphics*/
	public void draw(){
		bufferGraphics.clearRect(0, 0, getSize().width, getSize().height);
		drawHabitat(bufferGraphics);
		drawAnimal(bufferGraphics);
		/*
		for(int i = 0; i < Math.max(getSize().width, getSize().height); i+= 15){
			bufferGraphics.setColor(Color.gray);
			bufferGraphics.drawLine(i, 0, i, getSize().height);
			bufferGraphics.drawLine(0, i, getSize().width, i);
		}
		*/
	}
	GradientPaint paint;
	/**Draw the animal specifically
	 * @see Graphics*/
	private void drawAnimal(Graphics g0){
		Graphics2D g = (Graphics2D) g0;
		
		g.setColor(Color.white);
		Polygon draw = new Polygon();
		if(flying){
			for(int i = 0; i < Flying.npoints; i++){
				draw.addPoint(animx + Flying.xpoints[i], animx + Flying.ypoints[i]);
			}
		}
		else {
			for(int i = 0; i < NotFlying.npoints; i++){
				draw.addPoint(animx + NotFlying.xpoints[i], animx + NotFlying.ypoints[i]);
			}
		}
		g.setPaint(paint);
		g.fillPolygon(draw);
		g.setPaint(Color.black);
		g.setColor(Color.black);
		g.drawPolygon(draw);
		//g.rotate(new Random().nextDouble()*0.02f-0.01f);
	}
	/**Draw the habitat specifically
	 * @see Graphics*/
	private void drawHabitat(Graphics g0)
	{
		Graphics2D g = (Graphics2D)g0;
		g.setPaint(paint);
		g.fillRect(0, 0, dim.width, dim.height);
		g.setColor(Color.green);
		g.setPaint(new GradientPaint(0, 0, new Color(0f, 1f, 0f), dim.width, dim.height, new Color(0, 0, 0)));
		g.fillRect(0, 80, 400, 40);
	}
	/**a {@link Runnable} that encapsulates all logic*/
	@Override
	public void run() {
		@SuppressWarnings("unused")
		int time = 0;
		bufferGraphics.setColor(Color.black);
		while(true){
			if(!dim.equals(getSize())){
				dim = getSize(); 
		        setBackground(Color.white); 
		        offscreen = createImage(dim.width,dim.height); 
		        bufferGraphics = offscreen.getGraphics();
			}
			//if(time % 2 == 0){
				if(desiredx != animx || desiredy != animy){
					animx += (animx > desiredx ? -1 : (animx < desiredx ? 1 : 0));
					animy += (animy > desiredy ? -1 : (animy < desiredy ? 1 : 0));
					if(Math.pow(animx - desiredx, 2) < 800 && animx - desiredx != 0){ 
						bufferGraphics.setColor(Color.blue);
						if(Math.pow(animy - desiredy, 2) > 800){
							animy += 1;
						}else if(Math.pow(animy - desiredy, 2) == 800);
						else{
							animy -= 2;
						}
					}else if(Math.pow(animx - desiredx, 2) < 8000 && animx - desiredx != 0){
						bufferGraphics.setColor(Color.red);
						if(Math.pow(animy - desiredy, 2) > 8000){
							animy += 1;
						}else if(Math.pow(animy - desiredy, 2) == 8000){
							animy -= 1;
						}
						else{
							animy -= 2;
						}
					}
					flying = true;
				}
				else flying = false;
			//}
			repaint();
			time++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	/**Called when mouse is clicked*/
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("test");
		Point usePoint = new Point(0,0);
		double distance = getMaximumSize().width*getMaximumSize().height;
		for(Point p : locationsToLand){
			if(getDistance(new Point(e.getX(), e.getY()), p) < distance){ 
				distance = getDistance(new Point(e.getX(), e.getY()), p);
				usePoint = p;
			}
		}
		desiredx = usePoint.x;
		desiredy = usePoint.y;
	}
	/**get distance between two points*/
	private double getDistance(Point where, Point desired){
		return (double)Math.sqrt(Math.pow(where.x-desired.x, 2)+Math.pow(where.y-desired.y, 2));
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	private static final Cat CAT = new Cat();
	private static final koala KOALA = new koala();
	private static final Albatross ALBATROSS = new Albatross();
	private static final NarwhalHabitat NARWHAL = new NarwhalHabitat();
	private static int pos = 1;
	private static final int exhibitAmnt = 4;
	private static JPanel c;
	private static JTextPane pane;
	@SuppressWarnings("unused")
	private static Dimension test = new Dimension();
	
	/**<strong>Important: the initial method that runs all other methods</strong>*/
	public static void main(String[] args){
		JFrame frame = new JFrame();
		/*
		JButton left = new JButton("<");
		JButton right = new JButton(">");//*/
		JSplitPane jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		frame.setLayout(new GridLayout(1, 3));
		/*
		left.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switchs(true);
			}
		});
		right.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switchs(false);
			}
		});//*/
		//frame.add(left);
		CAT.setPreferredSize(new Dimension(200, 200));
		KOALA.setPreferredSize(new Dimension(200, 200));
		ALBATROSS.setPreferredSize(new Dimension(200, 200));
		NARWHAL.setPreferredSize(new Dimension(200, 200));
		c = new JPanel();
		c.setPreferredSize(new Dimension(200, 200));
		pane = new JTextPane();
		pane.setEditable(false);
		switchs(false);
		jsp.add(pane);
		jsp.add(c);
		frame.add(jsp);
		//frame.add(right);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		CAT.init();
		CAT.start();
		KOALA.init();
		KOALA.start();
		ALBATROSS.init();
		ALBATROSS.start();
		NARWHAL.init();
		NARWHAL.start();
	}
	/**a method made to switch between animals, but now just displays the albatross*/
	private static void switchs(boolean left){
		pos += (left ? -1 : 1);
		if(pos < 0) pos = exhibitAmnt-1;
		if(pos >= exhibitAmnt) pos = 0;
		c.removeAll();
		switch(pos){
		case 0: c.add(CAT);pane.setText("Cat");break;
		case 1: c.add(KOALA);pane.setText("Koala");break;
		case 2: c.add(ALBATROSS);pane.setText("Albatross");break;
		case 3: c.add(NARWHAL);pane.setText("Narwhal");break;
		}
		c.repaint();
	}
}
