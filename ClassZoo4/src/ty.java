

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.applet.*;

public class ty extends Applet implements KeyListener 
{
	public void paint(Graphics g) 
	{{
		g.setColor(new Color(0,102,202));
		g.fillRect(0, 0, 1600, 600);
	}{
		g.setColor(new Color(83,63,62));
		g.fillRect(0, 600, 1600, 400);
	}
	g.setColor(new Color(0,123,0));
	//drawHabitat();
	drawAnimal(1, 'f'); 
	getWidth();
	getHeight();
	//left arm
	g.fillRect(175,550,125,25);
	g.fillRect(200,525,25,75);
	//right arm
	g.fillRect(375,550,125,25);
	g.fillRect(450,525,25,75);
	//body
	g.fillRect(300,525,75,75);
	//head
	g.fillRect(325,450,50,75);
	g.fillRect(375,450,75,50);
	//legs
	g.fillRect(300, 600, 25, 75);
	g.fillRect(350, 600, 25, 75);
	g.fillRect(325, 600, 25, 25);
	g.fillRect(275, 650, 25, 25);
	g.fillRect(375, 650, 25, 25);
	//g.fillRect(x, y, width, height);
	 Graphics Therizinosaurus;
	 int x=0;
	 int y=0;
	 int width=0;
	 int height=0;

	
	
	
	
	}
	
	
	 //public void init(){
			
		//addKeyListener( this );
		
	//}

//public void keyPressed(KeyEvent arg0) {
//	Character key=arg0.getKeyChar();
//	if(key=='A' || key=='a'||key=='d'||key=='D'||key=='W'||key=='w'||key=='s'||key=='S'){
//		//System.out.println(key);
//		drawAnimal(Therizinosaurus ,key);
	


private void drawAnimal(int therizinosaurus2, Character key) {
	// TODO Auto-generated method stub
	
}
	int Therizinosaurus;
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	 int x=0;
	 int y=0;
	 int width=0;
	 int height=0;
	 
	private void drawAnimal(Graphics g,Character key)
	{
		//Therizinosaurus=g.create(t);
		//Therizinosaurus.setColor(new Color(0,123,0));
		//Therizinosaurus.fillRect(RArm);
		//Therizinosaurus.fillRect(LArm);
		//Therizinosaurus.fillRect(RLeg);
		//Therizinosaurus.fillRect(LLeg);
		//Therizinosaurus.fillRect(x-width, y-height, width, height);
		//if(key=='N');
	//}
	//{
//		  x=getWidth();
	//	  y=getHeight();
		//  width=getWidth()/5;
		  //height=getHeight()/5;
	//	}else if(key=='A'||key=='a'){
	//	x-=5;
		//}else if(key=='D'||key=='d'){
			//x+=5;
//		}else if(key=='w'||key=='W'){
	//		y-=5;
		//}else if(key=='s'||key=='S'){
			//y+=5;
		}
		
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}