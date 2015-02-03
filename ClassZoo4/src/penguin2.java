//Gabriel Puga

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class DrawPanel extends JPanel {

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;

    	
        //Water
    	g2d.setColor(new Color (13,19,255));
    	g2d.fillRect(0,500, 2000,600);
        //?
        g2d.setColor(new Color (28, 3, 252));
        g2d.fillRect(0,500, 2000,600); 
        //Ice
        g2d.setColor(new Color (224, 241, 255));
        g2d.fillRect(600,500,445,254);          
        //Big Circle
        g2d.setColor(new Color(0,0,0));
        g2d.fillOval(680, 200, 300, 500);
        //small Circle
        g2d.setColor(new Color(255,255,255));
        g2d.fillOval(730, 340, 200, 300); 
        //Eye 1
        g2d.setColor(new Color(255,255,255));
        g2d.fillOval(780, 250, 40, 40);
        g2d.setColor(new Color(0,0,0));
        g2d.fillOval(790, 260, 20, 20);
        //Eye 2
        g2d.setColor(new Color(255,255,255));
        g2d.fillOval(850, 250, 40, 40);
        g2d.setColor(new Color(0,0,0));
        g2d.fillOval(860, 260, 20, 20);
        //Beak
        g2d.setColor(new Color(255,201,14));
        g2d.fillOval(810,280, 50,20 );
        //Feet
        g2d.setColor(new Color(255,201,14));
        g2d.fillOval(840,660, 100,50 ); 
        g2d.fillOval(740,660, 100,50 );
        //Flippers
        g2d.setColor(new Color(0,0,0));
        g2d.fillOval(443, 380,300, 75); 
        g2d.setColor(new Color(0,0,0));
        g2d.fillOval(920, 380,300, 75); 
       
        
    
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
    }
}

public class penguin2 extends JFrame {

    public penguin2() {
        initUI();
    }

    public final void initUI() {

        DrawPanel dpnl = new DrawPanel();
        add(dpnl);

        setSize(1600, 1600);
        setTitle("Penguin");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                penguin2 ex = new penguin2();
                ex.setVisible(true);
            }
        });
    }
}