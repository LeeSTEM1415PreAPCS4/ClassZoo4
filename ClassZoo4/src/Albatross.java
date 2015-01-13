

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;

public class Albatross extends Applet implements Runnable, MouseListener{
	
	private static final long serialVersionUID = 3591321775330098188L;
	
	Graphics bufferGraphics; 
    Image offscreen; 
    Dimension dim;
    int animx = 0, animy = 0;
    int desiredx = 0, desiredy = 0;
     
    boolean flying = false;
    
    Polygon Flying = new Polygon();
    Polygon NotFlying = new Polygon();
    
    Point[] locationsToLand = new Point[]{
    	new Point(0, 0),
    	new Point(70, 70),
    	new Point(140, 140),
    };
    
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
    
    public void init() { 
    	setUpPolygons();
    	dim = getSize(); 
        setBackground(Color.white); 
        offscreen = createImage(dim.width,dim.height); 
        bufferGraphics = offscreen.getGraphics();
        addMouseListener(this);
        new Thread(this).start();
    }

	public void paint(Graphics g)
	{
		try{
			draw();
		}catch(NullPointerException e){}
		g.drawImage(offscreen,0,0,this); 
	}
	
	public void draw(){
		bufferGraphics.clearRect(0, 0, getSize().width, getSize().height);
		drawHabitat(bufferGraphics);
		drawAnimal(bufferGraphics);
		for(int i = 0; i < Math.max(getSize().width, getSize().height); i+= 15){
			bufferGraphics.setColor(Color.gray);
			bufferGraphics.drawLine(i, 0, i, getSize().height);
			bufferGraphics.drawLine(0, i, getSize().width, i);
		}
	}
	
	private void drawAnimal(Graphics g){
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
		g.fillPolygon(draw);
		g.setColor(Color.black);
		g.drawPolygon(draw);
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(0, 80, 400, 40);
	}

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

	@Override
	public void mouseClicked(MouseEvent e) {
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
	private static int pos = 2;
	private static final int exhibitAmnt = 3;
	private static JPanel c;
	private static JTextPane pane;
	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JButton left = new JButton("<");
		JButton right = new JButton(">");
		JSplitPane jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		frame.setLayout(new GridLayout(1, 3));
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
		});
		frame.add(left);
		CAT.setPreferredSize(new Dimension(200, 200));
		KOALA.setPreferredSize(new Dimension(200, 200));
		ALBATROSS.setPreferredSize(new Dimension(200, 200));
		c = new JPanel();
		c.setPreferredSize(new Dimension(200, 200));
		pane = new JTextPane();
		pane.setEditable(false);
		switch(pos){
		case 0: c.add(CAT);pane.setText("Cat");break;
		case 1: c.add(KOALA);pane.setText("Koala");break;
		case 2: c.add(ALBATROSS);pane.setText("Albatross");break;
		}
		jsp.add(pane);
		jsp.add(c);
		frame.add(jsp);
		frame.add(right);
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
	}
	
	private static void switchs(boolean left){
		pos += (left ? -1 : 1);
		if(pos < 0) pos = exhibitAmnt-1;
		if(pos >= exhibitAmnt) pos = 0;
		c.removeAll();
		switch(pos){
		case 0: c.add(CAT);pane.setText("Cat");break;
		case 1: c.add(KOALA);pane.setText("Koala");break;
		case 2: c.add(ALBATROSS);pane.setText("Albatross");break;
		}
		c.repaint();
	}
}
