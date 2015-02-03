import java.awt.*;
import java.applet.*;
import java.util.Random;

public class NarwhalHabitat extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{
		//Body
		g.setColor(new Color(109,141,145));
		g.fillArc(350,200,175,300,180,-135);
		//Head
		//g.setColor(Color.black);
		g.fillArc(410,229,105,105,45,-155);
		//Eyes
		g.setColor(new Color(235,233,223));
		g.fillOval(500,260,10,30);//Right
		g.fillOval(485,260,10,30);//Left
		//Irises
		g.setColor(new Color(0,0,255));
		g.fillOval(502,265,6,23);//Right
		g.fillOval(487,265,6,23);//Left
		//Horn
		g.setColor(new Color(235,247,200));
		Polygon horn = new Polygon();
		horn.addPoint(500,250);
		horn.addPoint(575,190);
		horn.addPoint(515,270);
		g.fillPolygon(horn);
		//Stripes on Horn
		g.setColor(new Color(252,190,88));
		g.drawArc(500,244,27,15,180,-190);
		g.drawArc(512,236,27,15,180,-180);
		g.drawArc(522,226,23,10,180,-180);
		//Smile
		int y=315;
		for(int x=462;x>=430;x-=1)
		{
			g.setColor(Color.black);
			g.drawArc(x,270,50,50,y,-135);
			y-=1;
		}
		//Tongue
		y=315;
		for(int x=450;x>=430;x-=1)
		{
			g.setColor(Color.pink);
			g.drawArc(x,285,15,15,y,-135);
			y-=1;
		}
		
	}
	
	private void drawHabitat(Graphics g)
	{
		g.setColor(Color.black);
		//Rectangle
		g.drawRect(10,10,800,700);
		//Ice Hole
		g.fillOval(350,300,100,100);
		
		
		/*//Left Igloo
		g.drawArc(20,20,100,150,0,180);//Main
		g.drawLine(20,95,120,95);//Bottom
		//Vertical Lines
		g.drawLine(40,95,40,35);//Left
		g.drawLine(60,95,60,23);//2nd
		g.drawLine(80,95,80,23);//3rd
		g.drawLine(100,95,100,35);//Right
		//Horizontal Lines
		g.drawLine(60,23,80,23);//Top
		g.drawLine(40,35,100,35);//Second
		g.drawLine(33,47,108,47);//Third
		g.drawLine(26,59,114,59);//Fourth
		g.drawLine(23,71,118,71);//Fifth
		g.drawLine(22,83,119,83);//Sixth
		//Opening
		g.fillArc(60,71,20,48,0,180);
		*/
		
		/*//Right Igloo
		g.drawArc(320,20,100,150,0,180);//Main
		g.drawLine(320,95,420,95);//Bottom
		//Vertical Lines
		g.drawLine(340,95,340,35);//Left
		g.drawLine(360,95,360,23);//2nd
		g.drawLine(380,95,380,23);//3rd
		g.drawLine(400,95,400,35);//Right
		//Horizontal Lines
		g.drawLine(360,23,380,23);//Top
		g.drawLine(340,35,400,35);//Second
		g.drawLine(333,47,408,47);//Third
		g.drawLine(326,59,414,59);//Fourth
		g.drawLine(323,71,418,71);//Fifth
		g.drawLine(322,83,419,83);//Sixth
		//Opening
		g.fillArc(360,71,20,48,0,180);*/
		
		
		
		//Random Igloos(Test)
		//Setup
		Random rand=new Random();
		int x=rand.nextInt(300)+10;
		int y=rand.nextInt(590)+10;
		
		//Start of Igloo
		g.drawArc(x,y,100,150,0,180);//Arc
		g.drawLine(x,y+75,x+100,y+75);//Bottom
		//Vertical Lines
		g.drawLine(x+20,y+75,x+20,y+15);//Left
		g.drawLine(x+40,y+75,x+40,y+3); //Second
		g.drawLine(x+60,y+75,x+60,y+3); //Third
		g.drawLine(x+80,y+75,x+80,y+15);//Right
		//Horizontal Lines
		g.drawLine(x+40,y+3,x+60,y+3);  //Top
		g.drawLine(x+20,y+15,x+80,y+15);//Second
		g.drawLine(x+13,y+27,x+88,y+27);//Third
		g.drawLine(x+6,y+39,x+94,y+39); //Fourth
		g.drawLine(x+3,y+51,x+98,y+51); //Fifth
		g.drawLine(x+2,y+63,x+99,y+63); //Bottom
		//Opening
		g.fillArc(x+40,y+51,20,48,0,180);//Opening
		
		
		
		//Declaring New Variables
		int a=rand.nextInt(180)+520;
		int b=rand.nextInt(590)+10;
		
		//Start of Right Igloo
		g.drawArc(a,b,100,150,0,180);//Arc
		g.drawLine(a,b+75,a+100,b+75);//Bottom
		//Vertical Lines
		g.drawLine(a+20,b+75,a+20,b+15);//Left
		g.drawLine(a+40,b+75,a+40,b+3); //Second
		g.drawLine(a+60,b+75,a+60,b+3); //Third
		g.drawLine(a+80,b+75,a+80,b+15);//Right
		//Horizontal Lines
		g.drawLine(a+40,b+3,a+60,b+3);  //Top
		g.drawLine(a+20,b+15,a+80,b+15);//Second
		g.drawLine(a+13,b+27,a+88,b+27);//Third
		g.drawLine(a+6,b+39,a+94,b+39); //Fourth
		g.drawLine(a+3,b+51,a+98,b+51); //Fifth
		g.drawLine(a+2,b+63,a+99,b+63); //Bottom
		//Opening
		g.fillArc(a+40,b+51,20,48,0,180);//Opening
		
		
	}
}
