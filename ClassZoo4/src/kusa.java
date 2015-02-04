//Emerson Shands
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class DrawPanelbear extends JPanel {

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
       
   

      //background
		//sky and land
		g2d.setColor(new Color(153,167,253));
		g2d.fillRect(0, 0, 1600, 900);
		
		g2d.setColor(new Color(0,64,0));
		g2d.fillRect(0, 500, 1600, 900);
			
//drawing bear
		//chest- shape
		g2d.setColor(new Color(131,92,59));
		g2d.fillOval(600, 300,325, 400);
		//ears
		  GradientPaint gp1 = new GradientPaint
	        		(5, 5,	Color.blue, 20, 20, Color.MAGENTA, true);
		  g2d.setPaint(gp1);
		
		g2d.fillArc(617, 140,100, 100, 20, 220);
		
		 GradientPaint gp2 = new GradientPaint
	        		(5, 20,	Color.blue, 20, 5, Color.MAGENTA, true);
		  g2d.setPaint(gp2);
		  
		g2d.fillArc(815, 140,100, 100, 310, 220);
		g2d.setColor(Color.black);
		g2d.fillArc(630, 155,70, 70, 23, 200);
		g2d.fillArc(830, 155,70, 70, 323, 200);
		
		//Head-shape
		g2d.setColor(new Color(131,92,59));
		g2d.fillOval(615, 165,300, 200);
		
		
		
		//arms-connecting2d
		g2d.setColor(new Color(131,92,59));
	
		g2d.fillRoundRect(490,160, 75, 190, 10, 10);
		g2d.fillRoundRect(960,160, 75, 190, 10, 10);
		
		//left fore-arm
		g2d.fillOval(490, 340, 75, 20);
		g2d.fillOval(500, 345, 75, 20);
		g2d.fillOval(510, 350, 75, 20);
		g2d.fillOval(520, 355, 75, 20);
		g2d.fillOval(530, 360, 75, 20);
		g2d.fillOval(540, 365, 75, 20);
		g2d.fillOval(550, 370, 75, 20);
		g2d.fillOval(560, 375, 75, 20);
		g2d.fillOval(570, 380, 75, 20);
		g2d.fillOval(580, 385, 75, 20);
		g2d.fillOval(590, 390, 75, 20);
		g2d.fillOval(600, 395, 75, 20);
		
		//right fore-arm
		int x1= 960;
		int y1= 340;
	for (int jerk = 0; jerk <12; jerk+=1){
		g2d.fillOval(x1,y1, 75, 20);
		x1-=10;
		y1+=5;
	
	}
		
	
		//hands
	g2d.fillOval(490, 140, 75, 50);	
	g2d.fillOval(960, 140, 75, 50);
	
		//fg2dngers
	g2d.setColor(Color.black);
	g2d.fillOval(968, 159, 10, 13);
	g2d.fillOval(981, 155, 10, 13);
	g2d.fillOval(994, 154, 10, 13);
	g2d.fillOval(1007, 157, 10, 13);
	g2d.fillOval(1020, 160, 10, 13);
	
	g2d.fillOval(498, 159, 10, 13);
	g2d.fillOval(510, 155, 10, 13);
	g2d.fillOval(522, 154, 10, 13);
	g2d.fillOval(534, 157, 10, 13);
	g2d.fillOval(546, 160, 10, 13);
	
	//palms
	g2d.fillOval(965, 185, 40, 20);
	g2d.fillOval(990, 185, 40, 20);
	g2d.fillOval(978, 175, 40, 20);
	
	g2d.fillOval(492, 185, 40, 20);
	g2d.fillOval(522, 185, 40, 20);
	g2d.fillOval(505, 175, 40, 20);
	
	// belly
	g2d.fillOval(625, 325,275, 350);
	
	//leg2ds
	g2d.setColor(new Color(113,70,47));
	g2d.fillOval(625,550,120,160);
	g2d.fillOval(780,550,120,160);
	

	//details
		//nose
	g2d.setColor(Color.BLACK);
	int[] nosex= new int[]{757,777,767};
	int[] nosey= new int[]{270,270,290};
	g2d.fillPolygon(nosex, nosey, 3);
		//eyes
	g2d.fillOval(680, 210, 45, 70);
	g2d.fillOval(800, 210, 45, 70);
		//mouth
	 
	g2d.drawLine( 767, 290, 790, 303);
	g2d.drawLine( 767, 290, 744, 303);
	
	
	//trees
	g2d.setColor(new Color(131,92,59));
	g2d.fillRect(40, 0, 200, 1000);
	g2d.setColor(new Color(112,69,46));
    

    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
    }
}

public class kusa extends JFrame {

    public kusa() {
        initUI();
    }

    public final void initUI() {

        DrawPanel dpnl = new DrawPanel();
        add(dpnl);

        setSize(1200000000, 800);
        setTitle("Mr. Bean");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                kusa ex = new kusa();
                ex.setVisible(true);
            }
        });
    }
}
	