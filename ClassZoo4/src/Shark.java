import javax.swing.*;

import java.awt.*;

final public class Shark {
	
	public static final JFrame jframe = null;
	JFrame frame;
	DrawPanel drawPanel;
	
	private int oneX = 7;
	private int oneY = 7;
	
	
	boolean up = false;
	boolean down = true;
	boolean left = false;
	boolean right = true;
	
	public static void main(String[] args) {
		new Shark().go();
		
	}
	
	private void go() {
		frame = new JFrame("shARK");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawPanel = new DrawPanel();
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(800, 800);
		frame.setLocation(375, 55);
		moveIt();
		
		
	}

	
	class DrawPanel extends JPanel {
		
		 Bubble b1 = new Bubble();
		 Bubble b2 = new Bubble();
		 Bubble b3 = new Bubble();
		 Bubble b4 = new Bubble();
		 Bubble b5 = new Bubble();
		 Bubble b6 = new Bubble();
		 Bubble b7 = new Bubble();
		 Bubble b8 = new Bubble();
		 Bubble b9 = new Bubble();
		 Bubble b10 = new Bubble();
		 Bubble b11 = new Bubble();
		 Bubble b12 = new Bubble();
		 Bubble b13 = new Bubble();
		 Bubble b14 = new Bubble();

		public void paintComponent(Graphics g) {
			
			
	        
			g.setColor(Color.decode("#15415E"));
			g.fillOval(oneX+40, oneY+190, 300, 100);             //Draw Something
			g.setColor(Color.decode("#15415E"));
			g.fillArc(oneX+40, oneY+190, 350, 100, 20, 80);
			g.fillArc(oneX+0, oneY+0, 390, 310, -30, -90);      //Draw Something Else (Close to the origin)
														//oneX starts at 160
														//oneY starts at 10
			g.setColor(Color.white);
			g.fillOval(oneX+50, oneY+190, 300, 120);
			g.setColor(Color.decode("#15415E"));
			g.fillOval(oneX+50, oneY+190, 300, 110);
			g.fillArc(oneX+50, oneY+240, 300, 200, 60, 60);
			g.fillOval(oneX+10, oneY+170, 80, 150);
	        g.setColor(Color.black);
	        g.fillOval(oneX+290, oneY+210, 20, 20);
	        g.setColor(Color.white);
	        g.fillOval(oneX+290, oneY+210, 10, 10);
	        
	        
	        
	        
	        g.drawArc(100, 100, 40, 40, 100, 360);
	        g.fillOval(100, 100, 20, 20);
	        g.fillOval(120, 120, 5, 5);
	        
	        g.drawArc(400, 100, 40, 40, 100, 360);
	        g.fillOval(400, 100, 20, 20);
	        g.fillOval(420, 120, 5, 5);
	        
	        g.drawArc(300, 200, 40, 40, 100, 360);
	        g.fillOval(300, 200, 20, 20);
	        g.fillOval(320, 220, 5, 5);
	        
	        g.drawArc(500, 400, 40, 40, 100, 360);
	        g.fillOval(500, 400, 20, 20);
	        g.fillOval(520, 420, 5, 5);
	        
	        g.drawArc(600, 700, 40, 40, 100, 360);
	        g.fillOval(600, 700, 20, 20);
	        g.fillOval(620, 720, 5, 5);
	        
	        g.drawArc(600, 100, 40, 40, 100, 360);
	        g.fillOval(600, 100, 20, 20);
	        g.fillOval(620, 120, 5, 5);
	        
	        g.drawArc(100, 600, 40, 40, 100, 360);
	        g.fillOval(100, 600, 20, 20);
	        g.fillOval(120, 620, 5, 5);
	        
	        g.drawArc(100, 400, 40, 40, 100, 360);
	        g.fillOval(100, 400, 20, 20);
	        g.fillOval(120, 420, 5, 5);
	        
	        g.drawArc(300, 500, 40, 40, 100, 360);
	        g.fillOval(300, 500, 20, 20);
	        g.fillOval(320, 520, 5, 5);
	        
	        
	        
			
	      //  Bubble b1 = new Bubble();
	        b1.moveIt(g);
	        b2.moveIt(g);
	        b3.moveIt(g);
	        b4.moveIt(g);
	        b5.moveIt(g);
	        b6.moveIt(g);
	        b7.moveIt(g);
	        b8.moveIt(g);
	        b9.moveIt(g);
	        b10.moveIt(g);
	        b11.moveIt(g);
	        b12.moveIt(g);
	        b13.moveIt(g);
	        b14.moveIt(g);

	       
	        
		}
	}
	
	private void moveIt() {
		while(true){
			if(oneX >= 283){
				right = false;
				left = true;
			}
			if (oneX <= 7){
				right = true;
				left = false;
			}
			if (oneY >= 259){
				up = true;
				down = false;
			}
			if (oneY <= 7){
				up = false;
				down = true;
			}
			if(up){
				oneY--;
			}
			if(down){
				oneY++;
			}
			if(left){
				oneX--;
			}
			if(right){
				oneX++;
			}
			try{
				Thread.sleep(10);
			} catch (Exception exc){}
			frame.repaint();
				
			}
		}
		
	}

class Bubble
{
	int x;
	int y;
	
	public Bubble()
	{
		x = (int) (Math.random() * 800);
		y = (int) (Math.random() * 800);
		
	}
	
	public void drawIt(Graphics g)
	{
    g.drawArc(x, y, 40, 40, 100, 360);
    g.fillOval(x, y, 20, 20);
    g.fillOval(x+20, y+20, 5, 5);
	}
	
	public void moveIt(Graphics g)
	{
		if (y <= 1)
		{
			y+=800;
			x = (int)(Math.random() * 800);
		}
		y--;
		drawIt(g);
	}
	
}

	
	
	
	
	