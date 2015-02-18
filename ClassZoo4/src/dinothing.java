

import javax.swing.*;

import java.applet.Applet;
import java.awt.*;

final public class dinothing {

JFrame frame;

DrawPanel drawPanel;

private int oneX = 7;

//private int oneY = 7;

//boolean up = false;

//boolean down = true;

boolean left = false;

boolean right = true;

public static void main(String[] args) {

new dinothing().go();

}

private void go() {

frame = new JFrame("Test");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

drawPanel = new DrawPanel();

frame.getContentPane().add(drawPanel, BorderLayout.CENTER);

frame.pack();

frame.setLocationRelativeTo(null);

frame.setVisible(true);

frame.setResizable(false);



moveIt();

}
	
	
@SuppressWarnings("unused")
class DrawPanel extends JPanel {
	
	public DrawPanel(){
		setPreferredSize(new Dimension(1600, 1600));
	}

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public void paintComponent(Graphics g) {
	{//sky
		g.setColor(new Color(0,102,202));
		g.fillRect(0, 0, 1600, 600);
	//ground
		g.setColor(new Color(83,63,62));
		g.fillRect(0, 600, 1600, 400);
	
}{//tree
	g.setColor(new Color(83,63,62));
	g.fillRect(1425, 525, 25, 75);
	g.fillRect(200, 525, 25, 75);
	
	g.setColor(new Color(0,176,0));
	g.fillRect(1400, 500, 75, 25);
	g.fillRect(1425, 475, 25, 25);
	g.fillRect(175, 500, 75, 25);
	g.fillRect(200, 475, 25, 25);
}{//lake
	g.setColor(new Color(0,63,198));
	g.fillOval(700, 675, 225, 225);
}



/*g.setColor(Color.BLUE);

g.fillRect(0, 0, this.getWidth(), this.getHeight());

g.setColor(Color.RED);

g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);

g.setColor(Color.WHITE);

g.fillRect(6, 6, this.getWidth()-12, this.getHeight()-12);

g.setColor(Color.BLACK);

g.fillRect(oneX, oneY, 6, 6);*/
	{g.setColor(new Color(0,123,0));
	//drawHabitat();
	//drawAnimal(1, 'f'); 
	getWidth();
	getHeight();
	//left arm
	g.fillRect( oneX +175,550,125,25);
	g.fillRect( oneX +200,525,25,75);
	//right arm
	g.fillRect( oneX +375,550,125,25);
	g.fillRect( oneX +450,525,25,75);
	//body
	g.fillRect( oneX +300,525,75,75);
	//head
	g.fillRect( oneX +325,450,50,75);
	g.fillRect( oneX +375,450,75,50);
	//legs
	g.fillRect( oneX +300, 600, 25, 75);
	g.fillRect( oneX +350, 600, 25, 75);
	g.fillRect( oneX +325, 600, 25, 25);
	g.fillRect( oneX +275, 650, 25, 25);
	g.fillRect( oneX +375, 650, 25, 25);
	}
	//g.fillRect(x, y, width, height);
	/* Graphics Therizinosaurus;
	 
	 int y=0;
	 int width=0;
	 int height=0;*/

	
	
	
}
{
	int oneX = 7;
}
}

private void moveIt() {

	while(true){
	
		if(oneX >= 990){
		
			right = false;
			
			left = true;
			
		}
		
		if(oneX <= 10){
		
			right = true;
			
			left = false;
			
		}
		
		/*if(oneY >= 259){
		
			up = true;
			
			down = false;
			
		}
		
		if(oneY <= 7){
		
			up = false;
			
			down = true;
			
		}
		
		if(up){
		
			oneY--;
		
		}
		
		if(down){
		
			oneY++;
		
		}*/
		
		if(left){
		
			oneX--;
		
		}
		
		if(right){
		
			oneX++;
		
		}
		
		try{
		
			Thread.sleep(11);
		
		} catch (Exception exc){}
		
			frame.repaint();
	
	}

}

}