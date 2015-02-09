import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
//import java.awt.Insets;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;





//import java.util.Timer;
//import java.util.TimerTask;
//import java.awt.Event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;


 public class Jellyfish extends JFrame {
	private static final long serialVersionUID = 1L;

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
	        setTitle("I AM WATCHING YOU");
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
	   	 private  int jx = 400;
	   	private  int jy = 200;
	   	 
	   	 /*public void moveIt(int x, int y)
	   	 {
	   		 jx += x;
	   		 jy += y;
	   	 }*/
	   	/**
	   	 * 
	   	 */
	   	
	   	private static final long serialVersionUID = 1L;
	   	private Graphics2D Jelly;
	   	private boolean eyesopen;
	   	//private Thread runner;
	   //private	BufferedImage sandy;
	   //	private TexturePaint sandytp;
	   	 

	   	public void init(){
	       	
	       	addKeyListener( this );
	       	
	   	}
	   	
	   	private void theDrawing(Graphics g)  {
	   		Graphics2D g2d = (Graphics2D) g;
	   		
	   			//loadImages();
	   			drawHabitat(g2d);
	   			drawAnimal(g2d, 'N');
	   		 
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
	   		
	    }
	   		
	   	

	   public void keyPressed(KeyEvent arg0) {
	   	Character key=arg0.getKeyChar();
	   	if(key=='A' || key=='a'||key=='d'||key=='D'||key=='W'||key=='w'||key=='s'||key=='S'){
	       	drawAnimal(Jelly, key);
	   	}
	   }
	       	
	   	/*private void loadImages() {
	   		try{
	   			sandy = ImageIO.read(this.getClass().getResource("sandy.jpg"));
	   		} catch (IOException ex) {
	   			System.out.println("Uh, error!");
	   			Logger.getLogger(DrawPanel.class.getName()).log(Level.SEVERE, null, ex);
	   		}
	   	}*/
	   	 

	   		
	   		
	   	
	   	private void drawAnimal(Graphics2D g2d, Character key){
	   		{
	   			{
	   			
	   		    	 if (eyesopen)
	   			    	  eyesopen = false;
	   			      else
	   			    	  eyesopen = true;

	   				
	   			//Jellyfish
	   				
	   				g2d.setColor(Color.magenta);
	   				
	   				g2d.fillOval(jx, jy, 200, 200);
	   				g2d.fillRect(jx, jy+100, 200, 100);

	   				int xx = jx+5;
	   				int xxx = jx+195;
	   				for (int x = jx; x<=jx+195; x=x+20)
	   				{

	   					g2d.fillRect(x, jy+200, 2, 150);
	   					g2d.fillRect(xx, jy+200, 2, 150);
	   					g2d.fillRect(xxx, jy+200, 2, 150);
	   					xx = xx + 15;
	   					xxx = xxx - 15;
	   					
	   				}
	   				
	   				if (eyesopen==true)
	   				{
	   				//Draw Eyes
	   				g2d.setColor(Color.black);
	   				g2d.fillOval(jx+60, jy+75, 25, 25);
	   				g2d.fillOval(jx+110, jy+75, 25, 25);
	   				
	   				/*//"I'm watching you"
	   				Random rdInt = new Random();
	   				Color random = new Color(rdInt.nextInt(243), rdInt.nextInt(243), rdInt.nextInt(243));
	   				g2d.setFont(new Font("Impact", Font.TRUETYPE_FONT, 60)); 
	   				g2d.setColor(random);
	   				g2d.drawString("Use 'a', 'w', 's', 'd'", 1000, 700);
	   				g2d.drawString("to pop all the bubbles", 980, 775);
	   				*/
	   				}
	   				else
	   				{
	   				//Blink Eyes
	   					g2d.setColor(Color.magenta);
	   					g2d.fillOval(460, 275, 25, 25);
	   					g2d.fillOval(510, 275, 25, 25);
	   				}
	   			
	   			

	   			}
	   		}
	   			
	   	
	   }

	   	
	   		
	   		
	   		
	   	    
	   	
	   	
	    @Override
	    public void paintComponent(Graphics g) {
	   	//moveIt(1, 1);
	   	 super.paintComponent(g);
	   	 theDrawing(g);
	   	 
	   	 
	   	 if (eyesopen==true)
	   	    {
	   	     
	   	    	repaint();
	   	    	
	   	      try { Thread.sleep(100); }
	   	       catch (InterruptedException e) { }
	   	      
	   	      
	   	     }
	   	     
	   	     else{
	   	    	 
	   	       repaint();
	   	      
	   	      try { Thread.sleep(5000); }
	   	       catch (InterruptedException e) { }
	   	      
	   	     }
	   	     
	    	}


	   @Override
	   public void keyReleased(KeyEvent e) {
	   	// TODO Auto-generated method stub
	   	
	   }

	   @Override
	   public void keyTyped(KeyEvent e) {
	   	// TODO Auto-generated method stub
	   	
	   }
	    }
	    

	    
	    
 }
 
 
 
 
 
