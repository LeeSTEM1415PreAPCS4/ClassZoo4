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

	        DrawPanel panel = new DrawPanel();
	        add(panel);
	        
	        Toolkit tk = Toolkit.getDefaultToolkit();
	        int wai = ((int) tk.getScreenSize().getWidth());
	        int ehx = ((int) tk.getScreenSize().getHeight());
	        setSize(wai, ehx);
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
		int wai = ((int) tk.getScreenSize().getWidth());
		int ehx = ((int) tk.getScreenSize().getHeight());	
	   	private  int jx = 400;
	   	private  int jy = 200;
	   	Graphics2D Jelly;
	   	private boolean eyesopen;
	   	KeyEvent arg0;
	   	//private Thread runner;
	   //private BufferedImage sandy;
	   //private TexturePaint sandytp;
	   	 

	   	public void init(){
	       	setFocusable(true);
	   		addKeyListener(this);
	   	}
	   	
	   	public void keyPressed(KeyEvent arg0) {
	   	switch (arg0.getKeyCode()){
   		 case KeyEvent.VK_LEFT:
   			 if(jx>=3)
   				 jx--;
   			 break;
   		 case KeyEvent.VK_RIGHT:
   			 if(jx<=wai-200)
   				 jx++;
   			 break;
   		 case KeyEvent.VK_UP:
   			 if(jy>=3)
   				 jy--;
   			 break;
   		 case KeyEvent.VK_DOWN:
   			 if(jy<=ehx-ehx+475)
   			 jy++;
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
	   		Color water = new Color (39, 128, 216);
	   		g2d.setColor(water);
	   		g2d.fillRect(0, 0, 1600, 1000);
	   		//sandytp = new TexturePaint(sandy, new Rectangle(10, 10, 100, 200));
	   		//g2d.setPaint(sandytp);
	   		//g2d.fillRect(0, 700, 1600, 200);
	   		
	   		
	   		Random rndInt = new Random(62770);
	   		for (int z = 0; z<=40; z++)
	   			{
	   				int ex = rndInt.nextInt(1600);
	   				int why = rndInt.nextInt(700);
	   				g2d.setColor(Color.black);
	   				g2d.drawOval(ex, why, 50, 50);
	   				g2d.setColor(Color.white);
	   				g2d.fillOval(ex, why, 50, 50);
	   			}
	   		
	   		//WRITES STUFF AND CHANGES FONT
	   		Random rdInt = new Random();
			Color random = new Color(rdInt.nextInt(243), rdInt.nextInt(243), rdInt.nextInt(243));
			g2d.setFont(new Font("Impact", Font.TRUETYPE_FONT, 60)); 
			g2d.setColor(random);
			g2d.drawString("Use the arrow keys", 1000, 700);
			g2d.drawString("to move the Jellyfish", 980, 775);

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
	   		    	 
	   		    
	   		

	   				
	   			//Draws the Jellyfish
	   				
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
	   				//Draw Eyes
	   				Jelly.setColor(Color.black);
	   				Jelly.fillOval(jx+60, jy+75, 25, 25);
	   				Jelly.fillOval(jx+110, jy+75, 25, 25);	
	   				}
	   				
	   				else
	   				{
	   				//Blink Eyes
	   					Jelly.setColor(Color.magenta);
	   					Jelly.fillOval(jx+60, jy+75, 25, 25);
	   					Jelly.fillOval(jx+110, jy+75, 25, 25);
	   					
	   				}
	   			
	   			

	   			}
	   		}
	   			
	   	
	   }

	   	
	    @Override
	    public void paintComponent(Graphics g) {
	   	//moveIt(1, 1);
	   	 super.paintComponent(g);
	   	 theDrawing(g);

	   	 try { Thread.sleep(100); }
  	       catch (InterruptedException e) { }
	   	 count++;
	   	 repaint();
	   	 
	   	 if (eyesopen==true)
	   	    {
	   
//	   	    	repaint();	
//	   	      try { Thread.sleep(100); }
//	   	       catch (InterruptedException e) { }
	   	     }
	   	     
	   	 else{
//	   	       repaint();
//	   	      try { Thread.sleep(5000); }
//	   	       catch (InterruptedException e) { }
	   	      
	   	     }
	   	     
	    	}


	   @Override
	   public void keyReleased(KeyEvent e) {}

	   @Override
	   public void keyTyped(KeyEvent e) {
	   	
	   }
	    }
	    

	    
	    
 }
 
 
 
 
 
 