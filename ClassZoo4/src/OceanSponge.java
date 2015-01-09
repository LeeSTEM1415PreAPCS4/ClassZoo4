import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class OceanSponge extends Applet implements KeyListener  {
	Polygon RArm= new Polygon();
	Polygon LArm= new Polygon();
	Polygon RLeg= new Polygon();
	Polygon LLeg= new Polygon();
	 Graphics Spongebob;
	public void init(){
		
		addKeyListener( this );
		
	}
	
	
	public void paint(Graphics g){
		drawHabitat(g);
		drawAnimal(g, 'N');
		getWidth();
		getHeight();
		
	}
	
	public void keyPressed(KeyEvent arg0) {
		Character key=arg0.getKeyChar();
		if(key=='A' || key=='a'||key=='d'||key=='D'||key=='W'||key=='w'||key=='s'||key=='S'){
			//System.out.println(key);
			drawAnimal(Spongebob ,key);
		}
				
		
	}
	 int x=0;
	 int y=0;
	 int width=0;
	 int height=0;
	 
	private void drawAnimal(Graphics g,Character key)
	{

		if(key=='N'){
		Spongebob=g.create();
		Spongebob.setColor(Color.yellow);
		  x=getWidth();
		  y=getHeight();
		  width=getWidth()/5;
		  height=getHeight()/5;
		Spongebob.fillRect(x-width, y-height, width, height);
		draw_Inside();
		}else if(key=='A'||key=='a'){
		Spongebob.setColor(new Color(155,155,255));
		Spongebob.fillRect(x-width, y-height, width, height);
		Spongebob.setColor(Color.yellow);
		x-=5;
		Spongebob.fillRect(x-width, y-height, width, height);
		draw_Inside();
		}else if(key=='D'||key=='d'){
			Spongebob.setColor(new Color(155,155,255));
			Spongebob.fillRect(x-width, y-height, width, height);
			Spongebob.setColor(Color.yellow);
			x+=5;
			Spongebob.fillRect(x-width, y-height, width, height);
			draw_Inside();
		}else if(key=='w'||key=='W'){
			Spongebob.setColor(new Color(155,155,255));
			Spongebob.fillRect(x-width, y-height, width, height);
			Spongebob.setColor(Color.yellow);
			y-=5;
			Spongebob.fillRect(x-width, y-height, width, height);
			draw_Inside();
		}else if(key=='s'||key=='S'){
			Spongebob.setColor(new Color(155,155,255));
			Spongebob.fillRect(x-width, y-height, width, height);
			Spongebob.setColor(Color.yellow);
			y+=5;
			Spongebob.fillRect(x-width, y-height, width, height);
			draw_Inside();
			
		}
		
		if(x<=0-width){
			Spongebob.setColor(new Color(155,155,255));
			Spongebob.fillRect(x-width, y-height, width, height);
			 x=(int)getWidth()-5;
			Spongebob.setColor(Color.yellow);
			Spongebob.fillRect(x-width, y-height, width, height);
			draw_Inside();
		}else if(x>=(int)getWidth()+width){
			Spongebob.setColor(new Color(155,155,255));
			Spongebob.fillRect(x-width, y-height, width, height);
			x=0+5;
			Spongebob.setColor(Color.yellow);
			Spongebob.fillRect(x-width, y-height, width, height);
			draw_Inside();
		}else if(y<=0-height){
			Spongebob.setColor(new Color(155,155,255));
			Spongebob.fillRect(x-width, y-height, width, height);
			 y=(int)getHeight();
			Spongebob.setColor(Color.yellow);
			Spongebob.fillRect(x-width, y-height, width, height);
			draw_Inside();
		}else if(y>=(int)getHeight()+height){
			
			Spongebob.setColor(new Color(155,155,255));
			Spongebob.fillRect(x-width, y-height, width, height);
			 y=height;
			Spongebob.setColor(Color.yellow);
			Spongebob.fillRect(x-width, y-height, width, height);
			draw_Inside();
		}
	}
	//			Spongebob.fillOval((x-width)+(int)Math.random()*10, (y-height)+(int)Math.random()*10, 10, 10);
	private void drawHabitat(Graphics g)
	{
		g.setColor(new Color(155,155,255));
		g.fillRect(0,0,getWidth(),getHeight());
	}
	public void draw_Inside()
	{

		Spongebob.setColor(new Color(204,204,0));
		for(int i=0;i<=50;i++){
		int size=(int)(Math.random()*(width/10));
		Spongebob.fillOval((x-width)+(int)(Math.random()*(width-size)), (y-height)+(int)(Math.random()*(height-size)), size, size);
		}
		Spongebob.setColor(new Color(255,255,255));
		Spongebob.fillOval((x-width)+width/5, (y-height)+width/5, width/5, height/5);
		Spongebob.fillOval((x-width)+width/2, (y-height)+width/5, width/5, height/5);
		RArm.addPoint(x-width+(width*2), y-height+(height/5));
		RArm.addPoint(x, y);
		RArm.addPoint(x+(width/5), y+(height/5));
		RArm.addPoint(x-width-(width/5), y-height+(height/5));
		Spongebob.setColor(Color.red);
		Spongebob.fillPolygon(RArm);
	}
	public void keyReleased(KeyEvent e) {
		//System.out.println(e.getKeyChar());
		
	}
	
	public void keyTyped(KeyEvent e) {
		
		
	}


}
