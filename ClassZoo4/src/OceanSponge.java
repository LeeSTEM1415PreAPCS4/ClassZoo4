import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class OceanSponge extends Applet implements KeyListener  {
	Polygon RArm= new Polygon();
	Polygon LArm= new Polygon();
	Polygon RLeg= new Polygon();
	Polygon LLeg= new Polygon();
	Polygon LShoulder =new Polygon();
	Polygon RShoulder =new Polygon();
	Polygon LSock = new Polygon();
	Polygon RSock =new Polygon();
	Polygon LRStripe = new Polygon();
	Polygon RRStripe = new Polygon();
	Polygon LBStripe = new Polygon();
	Polygon RBStripe = new Polygon();
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
		Spongebob=g.create();
		Spongebob.setColor(new Color(155,155,255));
		Spongebob.fillPolygon(RArm);
		Spongebob.fillPolygon(LArm);
		Spongebob.fillPolygon(RLeg);
		Spongebob.fillPolygon(LLeg);
		Spongebob.fillPolygon(LShoulder);
		Spongebob.fillPolygon(RShoulder);
		Spongebob.fillRect(x-width, y-height, width, height);
		if(key=='N'){
		  width=getWidth()/5;
		  height=getHeight()/5;
		  x=getWidth();
		  y=getHeight()-((int)(height*.25));

		}else if(key=='A'||key=='a'){
		x-=5;
		}else if(key=='D'||key=='d'){
			x+=5;
		}else if(key=='w'||key=='W'){
			y-=5;
		}else if(key=='s'||key=='S'){
			y+=5;
		}
		
		if(x<=0-width){
			 x=(int)getWidth()-5;
		}else if(x>=(int)getWidth()+width){
			x=0+5;
		}else if(y<=0-height){
			 y=(int)getHeight();;
		}else if(y>=(int)getHeight()+height){
			 y=height;
		}
		Spongebob.setColor(Color.yellow);
		Spongebob.fillRect(x-width, y-height, width, height);
		draw_Inside();
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
		Spongebob.setColor(Color.blue);
		Spongebob.fillOval((x-width)+width/5+(width/10), (y-height)+width/5+(height/10), width/10, height/10);
		Spongebob.fillOval((x-width)+width/2+(width/10), (y-height)+width/5+(height/10), width/10, height/10);
		//Spongebob.fillOval(x-width, y-height+(height/5), 10, 10);
		LArm.reset();
		LArm.addPoint(x-(int)(width*1.5), y-(int)(height/2)+(width/10));
		LArm.addPoint(x-(int)(width/1.25), y-(int)(height/1.25)+(height/10));
		LArm.addPoint(x-(int)(width/1.25), y-(int)(height/1.25));
		LArm.addPoint(x-(int)(width*1.5), y-(int)(height/2));
		LShoulder.reset();
		int xmultiplier = width/40;
		int ymultiplier = height/40;
		LShoulder.addPoint(x-width, y-height+(18*ymultiplier));
		LShoulder.addPoint(x-width-(xmultiplier*5), y-height+(18*ymultiplier));
		LShoulder.addPoint(x-width-(xmultiplier*5), y-height+(12*ymultiplier));
		LShoulder.addPoint(x-width, y-height+(12*ymultiplier));
		////////////////////////////////////////////////////
		double YLocoSh=0.45;
		RShoulder.reset();
		RShoulder.addPoint(x, y-(int)(height*YLocoSh));
		RShoulder.addPoint(x+(int)(width*.15), y-(int)(height*YLocoSh));
		RShoulder.addPoint(x+(int)(width*.15),y-(int)(height*(YLocoSh-0.1)));
		RShoulder.addPoint(x, y-(int)(height*(YLocoSh-0.1)));
		////////////////////////////////////////////////////
		Spongebob.fillRect(x-((int)(width*.2)), y, 1, 1);
		Spongebob.fillRect(x-((int)(width*.3)), y, 1, 1);
		Spongebob.fillRect(x-((int)(width*.2)), y+((int)(width*.4)), 1, 1);
		Spongebob.fillRect(x-((int)(width*.3)), y+((int)(width*.4)), 1, 1);
		//LLeg.reset();
		//LLeg.addPoint(xmultiplier, ymultiplier);
		//LLeg.addPoint();
		//LLeg.addPoint(xmultiplier, ymultiplier);
		//LLeg.addPoint();
		Spongebob.setColor(Color.yellow);
		Spongebob.fillPolygon(LArm);
		Spongebob.setColor(Color.white);
		Spongebob.fillPolygon(LShoulder);
		Spongebob.fillPolygon(RShoulder);
	}
	public void keyReleased(KeyEvent e) {
		//System.out.println(e.getKeyChar());
		
	}
	
	public void keyTyped(KeyEvent e) {
		
		
	}


}
