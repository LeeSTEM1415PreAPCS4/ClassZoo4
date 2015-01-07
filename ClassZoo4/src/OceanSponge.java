import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class OceanSponge extends Applet implements KeyListener  {
	public void init(){
		addKeyListener( this );
	}
	public void paint(Graphics g){
		g.setColor(new Color(155,155,255));
		g.fillRect(0,0,getWidth(),getHeight());
	}
	
	public void keyPressed(KeyEvent arg0) {
		Character key=arg0.getKeyChar();
		if(key=='A' || key=='a'){
				System.out.println(key);
		}
				
		
	}

	private void drawAnimal(Graphics g)
	{
		
	}
	
	private void drawHabitat(Graphics g)
	{
		
	}
	
	public void keyReleased(KeyEvent e) {

		
	}
	
	public void keyTyped(KeyEvent e) {
		
		
	}


}
