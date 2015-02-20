////Marquita Walker////

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.Rectangle;
//import java.awt.TexturePaint;
import java.util.Random;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.image.BufferedImage;
import java.awt.Toolkit;
//import java.io.File;
//import java.io.IOException;


 @SuppressWarnings("serial")
public class Jellyfish extends JFrame {
	 private int count=0;
	

		public Jellyfish() {
	        initUI();
	    }

	    public final void initUI() {

	    	////Draws the panel and sets size and title////
	        DrawPanel panel = new DrawPanel();
	        add(panel);
	        
	        Toolkit tk = Toolkit.getDefaultToolkit();
	        int SWidth = ((int) tk.getScreenSize().getWidth());
	        int SHeight = ((int) tk.getScreenSize().getHeight());
	        setSize(SWidth, SHeight);
	        setTitle("Jellyfish");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public static void main(String[] args) {

	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                Jellyfish ex = new Jellyfish();
	                ex.setVisible(true);
	            }
	        });
	    }
	    
	   
		class DrawPanel extends JPanel implements KeyListener
	    
	    {
		Toolkit tk = Toolkit.getDefaultToolkit();
		int SWidth = ((int) tk.getScreenSize().getWidth());
		int SHeight = ((int) tk.getScreenSize().getHeight());	
	   	private  int jx = 400;
	   	private  int jy = 200;
	   	Graphics2D Jelly;
	   	private boolean eyesopen;
	   	KeyEvent arg0;
	   	Bubblesss b1= new Bubblesss();
	   	Bubblesss b2= new Bubblesss();
	   	Bubblesss b3= new Bubblesss();
	   	Bubblesss b4= new Bubblesss();
	   	Bubblesss b5= new Bubblesss();
	   	Bubblesss b6 = new Bubblesss();
	   	Bubblesss b7= new Bubblesss();
	   	Bubblesss b8= new Bubblesss();
	   	int yoff;
	   	
	   	
	   	
	   	//private Thread runner;
	   //private BufferedImage sandy;
	   //private TexturePaint sandytp;
	   	 

	   	public void init(){
	       	setFocusable(true);
	   		addKeyListener(this);
	   	}
	   	
	   	public void keyReleased(KeyEvent arg0) {
	   	////Moves the Jellyfish using the arrow keys////
	   	switch (arg0.getKeyCode()){
   		 case KeyEvent.VK_LEFT:
   			 if(jx>=3)
   				 jx=jx-1;
   			System.out.println("left"+ " " +jx);
   			 break;
   		 case KeyEvent.VK_RIGHT:
   			 if(jx<=SWidth-200)
   				 jx=jx+1;
   			 //System.out.println("right" + " " +jx);
   			 break;
   		 case KeyEvent.VK_UP:
   			 if(jy>=3)
   				 jy=jy-1;
   			 System.out.println("up");
   			 break;
   		 case KeyEvent.VK_DOWN:
   			 if(jy<=SHeight-SHeight+475)
   			 jy=jy+1;
   			 break;
   		 }
	   	 
	   }
	   	private void theDrawing(Graphics g)  {
	   		Jelly = (Graphics2D) g;
	   			//loadImages();
	   			drawHabitat(Jelly);
				drawAnimal(Jelly, arg0);
				init();
	   		 
	   	}
	   	
	   private void drawHabitat(Graphics2D g2d) {
	   		////Draws the water habitat////
		   Color water = new Color (39, 128, 216);
	   		g2d.setColor(water);
	   		g2d.fillRect(0, 0, 1600, 1000);
	   		//sandytp = new TexturePaint(sandy, new Rectangle(10, 10, 100, 200));
	   		//g2d.setPaint(sandytp);
	   		//g2d.fillRect(0, 700, 1600, 200);
	   		
	   		
	   			/*Random rndInt = new Random();
	   		for (int z = 0; z<=40; z++)
	   			{
	   				int ex = rndInt.nextInt(1600);
	   				int why = rndInt.nextInt(700);
	   				g2d.setColor(Color.black);
	   				g2d.drawOval(ex, why, 50, 50);
	   				g2d.setColor(Color.white);
	   				g2d.fillOval(ex, why, 50, 50);
	   			}*/
	   		
	   		b1.moveIt(g2d);
	   		b2.moveIt(g2d);
	   		b3.moveIt(g2d);
	   		b4.moveIt(g2d);
	   		b5.moveIt(g2d);
	   		b6.moveIt(g2d);
	   		b7.moveIt(g2d);
	   		b8.moveIt(g2d);

	    }
	   		
	   	/*private void loadImages() {
	   		try{
	   			sandy = ImageIO.read(this.getClass().getResource("sandy.jpg"));
	   		} catch (IOException ex) {
	   			System.out.println("Uh, error!");
	   			Logger.getLogger(DrawPanel.class.getName()).log(Level.SEVERE, null, ex);
	   		}
	   	}*/
	   
	   	private void drawAnimal(Graphics2D Jelly, KeyEvent arg0){
	   		{
	   			{
	   			
	   		    	 if (eyesopen&&count>50)
	   			    	  {eyesopen = false;
	   			    	  count=0;}
	   			      else if (!eyesopen)
	   			    	  {eyesopen = true;
	   		    	 		count=0;}
	   		    	 
	   		    
	   		

	   				
	   			////Draws the Jellyfish////
	   				
	   				Jelly.setColor(Color.magenta);
	   				
	   				Jelly.fillOval(jx, jy, 200, 200);
	   				Jelly.fillRect(jx, jy+100, 200, 100);
	   				
	   				int xx = jx+5;
	   				int xxx = jx+195;
	   				for (int x = jx; x<=jx+195; x=x+20)
	   				{

	   					Jelly.fillRect(x, jy+200, 2, 150);
	   					Jelly.fillRect(xx, jy+200, 2, 150);
	   					Jelly.fillRect(xxx, jy+200, 2, 150);
	   					xx = xx + 15;
	   					xxx = xxx - 15;
	   					
	   				}
	   				if (eyesopen==true)
	   				{
	   				////Draws Eyes////
	   				Jelly.setColor(Color.black);
	   				Jelly.fillOval(jx+60, jy+75, 25, 25);
	   				Jelly.fillOval(jx+110, jy+75, 25, 25);	
	   				}
	   				
	   				else
	   				{
	   				////Blinks Eyes////
	   					Jelly.setColor(Color.magenta);
	   					Jelly.fillOval(jx+60, jy+75, 25, 25);
	   					Jelly.fillOval(jx+110, jy+75, 25, 25);
	   					
	   					
	   				}
	   			////Writes text on the screen////
	   		Random rdInt = new Random();
			Color random = new Color(rdInt.nextInt(75)+100, rdInt.nextInt(75), rdInt.nextInt(43)+200);
			Jelly.setFont(new Font("Impact", Font.TRUETYPE_FONT, 60)); 
			Jelly.setColor(random);
			Jelly.drawString("Use the arrow keys", 1000, 700);
			Jelly.drawString("to move the Jellyfish", 980, 775);
	   			

	   			}
	   		}
	   			
	   	
	   }
	   	
	    @Override
	    public void paintComponent(Graphics g) {
	   	 super.paintComponent(g);
	   	 theDrawing(g);

	   	 try { Thread.sleep(100); }
  	       catch (InterruptedException e) { }
	   	 count++;
	   	 
	   	 repaint();
	    }


	   @Override
	   public void keyPressed(KeyEvent e) {}

	   @Override
	   public void keyTyped(KeyEvent e) {
	   	
	   }
	    }
	    

	    
	    
 }
 
 class Bubblesss
 {
	 Graphics2D ocean;
	 int ex;
	 int why;
	 int yoff;
     Toolkit tk = Toolkit.getDefaultToolkit();
     int SWidth = ((int) tk.getScreenSize().getWidth());
     int SHeight = ((int) tk.getScreenSize().getHeight());
	 
	 public Bubblesss()
	 {
		 Random rand = new Random();
		 
			 ex = rand.nextInt(1600);
			 why = rand.nextInt(700);
	
	 }
	 
	 public void drawBubbles(Graphics2D g2d)
	 {
			g2d.setColor(Color.black);
			g2d.drawOval(ex, why, 50, 50);
			g2d.setColor(Color.white);
			g2d.fillOval(ex, why, 50, 50);

	 }
	 
	 public void moveIt(Graphics2D g2d)
	 {
				if(why<=SHeight)
					why-=5;
				if (why<=0)
					{why = SHeight;}
				drawBubbles(g2d);
	 }
	 
	/* public void moveY(Graphics2D g2d)
	 {
		 why+=yoff;
		drawBubbles(g2d);
	 }*/
 }
 
 
 