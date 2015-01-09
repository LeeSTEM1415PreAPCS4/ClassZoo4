

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Albatross extends Applet implements Runnable, MouseListener{
	
	private static final long serialVersionUID = 3591321775330098188L;
	
	 Graphics bufferGraphics; 
     Image offscreen; 
     Dimension dim;
     int animx = 0, animy = 0;
     int desiredx = 0, desiredy = 0;
     
     Image animal;
     Image animalFlying;
     Graphics bufferAnimal;
     Graphics bufferAnimalFlying;
     
     boolean flying = false;
     
     public void init()  
     { 
    	 dim = getSize(); 
         setBackground(Color.white); 
         offscreen = createImage(dim.width,dim.height); 
         bufferGraphics = offscreen.getGraphics();
         animal = createImage(64, 64); 
         bufferAnimal = animal.getGraphics();
         animalFlying = createImage(64, 64); 
         bufferAnimalFlying = animalFlying.getGraphics();
         initGraphics();
         addMouseListener(this);
         new Thread(this).start();
     }
     
     public void initGraphics(){
    	 
     }

	public void paint(Graphics g)
	{
		draw();
		g.drawImage(offscreen,0,0,this); 
	}
	
	public void draw(){
		bufferGraphics.clearRect(0, 0, 1000, 1000);
		drawHabitat(bufferGraphics);
		drawAnimal(bufferGraphics);
	}
	
	private void drawAnimal(Graphics g)
	{
		if(flying)
		g.drawImage(animalFlying, animx, animy, this);
		else
		g.drawImage(animal, animx, animy, this);
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(0, 80, 400, 40);
	}

	@Override
	public void run() {
		int time = 0;
		while(true){
			if(!dim.equals(getSize())){
				dim = getSize(); 
		        setBackground(Color.white); 
		        offscreen = createImage(dim.width,dim.height); 
		        bufferGraphics = offscreen.getGraphics();
			}
			if(time % 2 == 0){
				if(desiredx != animx || desiredy != animy){
					animx += (animx > desiredx ? -1 : (animx < desiredx ? 1 : 0));
					animy += (animy > desiredy ? -1 : (animy < desiredy ? 1 : 0));
					if(Math.pow(animx - desiredx, 2) < 800 && animx - desiredx != 0){ 
						if(Math.pow(animy - desiredy, 2) > 800){
							animy += 1;
						}else if(Math.pow(animy - desiredy, 2) == 800);
						else{
							animy -= 2;
						}
					}else if(Math.pow(animx - desiredx, 2) < 8000 && animx - desiredx != 0){
						if(Math.pow(animy - desiredy, 2) > 8000){
							animy += 1;
						}else if(Math.pow(animy - desiredy, 2) == 8000);
						else{
							animy -= 1;
						}
					}
					
					flying = true;
				}
				else flying = false;
			}
			repaint();
			time++;
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		desiredx = e.getX();
		desiredy = e.getY();
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
