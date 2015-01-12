import java.awt.*;
import java.applet.*;
import java.util.Date;
import java.util.Random;

public class Jellyfish extends Applet implements Runnable{
	private boolean eyesopen;
	Thread runner;
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	}

	private void drawHabitat(Graphics g)
	{
		{
			Color water = new Color(70, 194, 217);

			g.setColor(water);
			g.fillRect(0, 0, 1000, 1000);

			Random rndInt = new Random(6277);

			for (int z = 0; z<=25; z++)
				{
					int ex = rndInt.nextInt(900);
					int why = rndInt.nextInt(1000);
					g.setColor(Color.black);
					g.drawOval(ex, why, 50, 50);
					g.setColor(Color.white);
					g.fillOval(ex, why, 50, 50);
				}
			
		
}
		}
	private void drawAnimal(Graphics g)
	{
		{
		
	    	 if (eyesopen)
		    	  eyesopen = false;
		      else
		    	  eyesopen = true;

			
		//Jellyfish
			g.setColor(Color.magenta);
			g.fillOval(400, 200, 200, 200);
			g.fillRect(400, 300, 200, 100);

			int xx = 405;
			int xxx = 595;
			for (int x = 400; x<=595; x=x+20)
			{

				g.fillRect(x, 400, 2, 150);
				g.fillRect(xx, 400, 2, 150);
				g.fillRect(xxx, 400, 2, 150);
				xx = xx + 15;
				xxx = xxx - 15;
				
			}
			
			if (eyesopen==true)
			{
			//Draw Eyes
			g.setColor(Color.black);
			g.fillOval(460, 275, 25, 25);
			g.fillOval(510, 275, 25, 25);
			//for (long delay = 99999; delay < 10000000; delay++);
			}
			else
			{
			//Blink Eyes
			g.setColor(Color.magenta);
			g.fillOval(460, 275, 25, 25);
			g.fillOval(510, 275, 25, 25);
			g.setColor(Color.black);
			}
		
		
		}
		}
		public void run() {
		     while (true){
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
		   }
		
		 public void start() {
		     if (runner == null) {
		       runner = new Thread(this);
		       runner.start();
		     }
		   }

		

	
}





