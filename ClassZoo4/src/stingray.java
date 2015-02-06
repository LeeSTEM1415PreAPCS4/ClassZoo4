import java.awt.*;
import java.applet.*;

public class stingray extends Applet {

public void paint (Graphics g)
{
	g.setColor(Color.black);
	g.drawRect(0, 0, 800, 600);
g. setColor(Color.cyan);
g.fillRect(0, 200, 800, 400);
g.setColor(Color.gray);
g.fillOval(250, 250, 200, 200);
g.setColor(Color.gray);
g.fillArc(125, 250, 200, 200, -45, 90);
g.setColor(Color.black);
g.fillOval(300, 300, 25, 25);
g.fillOval(300, 375, 25, 25);
g.setColor(Color.gray);
g.fillRect(450, 350, 200, 5);
}
}
 