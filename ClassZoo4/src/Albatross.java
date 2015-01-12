

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Albatross extends Applet implements Runnable, MouseListener{
	
	private static final long serialVersionUID = 3591321775330098188L;
	
	Graphics bufferGraphics; 
    Image offscreen; 
    Dimension dim;
    int animx = 0, animy = 0;
    int desiredx = 0, desiredy = 0;
     
    boolean flying = false;
    
    Point[] locationsToLand = new Point[]{
    	new Point(0, 0),
    	new Point(70, 70),
    	new Point(140, 140),
    };
     
    public void init() { 
    	dim = getSize(); 
        setBackground(Color.white); 
        offscreen = createImage(dim.width,dim.height); 
        bufferGraphics = offscreen.getGraphics();
        addMouseListener(this);
        new Thread(this).start();
    }

	public void paint(Graphics g)
	{
		draw();
		g.drawImage(offscreen,0,0,this); 
	}
	
	public void draw(){
		bufferGraphics.clearRect(0, 0, 1000, 1000);
		bufferGraphics.fillRect(0, 0, 30, 30);
		drawHabitat(bufferGraphics);
		drawAnimal(bufferGraphics);
	}
	
	private void drawAnimal(Graphics g){
		g.setColor(Color.white);
		if(flying){
			g.fillOval(animx, animy, 20, 10);
			g.setColor(Color.black);
			g.drawOval(animx, animy, 20, 10);
		}
		else {
			g.fillOval(animx, animy, 10, 20);
			g.setColor(Color.black);
			g.drawOval(animx, animy, 10, 20);
		}
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
			System.out.println(distance);
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

}
