package nguyen_assignment6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class Bike 
{
    private final int xLeft;
    private final int yTop;
     
   public Bike(int x, int y)
    {
        xLeft = x;
        yTop = y;
        
    }
    
    public void draw(Graphics2D g2)
    {
     
    Rectangle stick = new Rectangle(xLeft+150,yTop+150,10,5);   
    Ellipse2D.Double steer = new Ellipse2D.Double(xLeft+250,yTop+100,75,10);
    Ellipse2D.Double steer1 = new Ellipse2D.Double(xLeft+250,yTop+85,10,25); 
    Ellipse2D.Double steer2 = new Ellipse2D.Double(xLeft+315,yTop+85,10,25);
        
    Ellipse2D.Double rearTire1 = new Ellipse2D.Double(xLeft+50,yTop+200,100,100);
    Ellipse2D.Double rearTire2 = new Ellipse2D.Double(xLeft+55,yTop+205,90,90);
    Ellipse2D.Double rearTire3 = new Ellipse2D.Double(xLeft+70,yTop+220,60,60); 
    Ellipse2D.Double rearTire4 = new Ellipse2D.Double(xLeft+90,yTop+240,20,20);
    
    Point2D.Double r1 = new Point2D.Double(xLeft+100,yTop+250);
    Point2D.Double r2= new Point2D.Double(xLeft+100,yTop+295);
    Point2D.Double r3= new Point2D.Double(xLeft+135,yTop+280);
    Point2D.Double r4= new Point2D.Double(xLeft+100,yTop+205);
    Point2D.Double r5= new Point2D.Double(xLeft+145,yTop+250);
    Point2D.Double r6= new Point2D.Double(xLeft+65,yTop+280);
    Point2D.Double r7= new Point2D.Double(xLeft+55,yTop+250);
        
    Line2D.Double stroke1 = new Line2D.Double(r1,r2);
    Line2D.Double stroke2 = new Line2D.Double(r1,r3);
    Line2D.Double stroke3 = new Line2D.Double(r1,r4);
    Line2D.Double stroke4 = new Line2D.Double(r1,r5);
    Line2D.Double stroke5 = new Line2D.Double(r1,r6);
    Line2D.Double stroke6 = new Line2D.Double(r1,r7);
        
    Ellipse2D.Double frontTire1 = new Ellipse2D.Double(xLeft+300,yTop+200,100,100);
    Ellipse2D.Double frontTire2 = new Ellipse2D.Double(xLeft+305,yTop+205,90,90);
    Ellipse2D.Double frontTire3 = new Ellipse2D.Double(xLeft+320,yTop+220,60,60);
    Ellipse2D.Double frontTire4 = new Ellipse2D.Double(xLeft+340,yTop+240,20,20);
      
    Point2D.Double r8 = new Point2D.Double(xLeft+350,yTop+250);
    Point2D.Double r9= new Point2D.Double(xLeft+350,yTop+295);
    Point2D.Double r10= new Point2D.Double(xLeft+385,yTop+280);
    Point2D.Double r11= new Point2D.Double(xLeft+350,yTop+205);
    Point2D.Double r12= new Point2D.Double(xLeft+395,yTop+250);
    Point2D.Double r13= new Point2D.Double(xLeft+315,yTop+280);
    Point2D.Double r14= new Point2D.Double(xLeft+305,yTop+250);
    Point2D.Double r15= new Point2D.Double(xLeft+315,yTop+220);
    Point2D.Double r16= new Point2D.Double(xLeft+385,yTop+220);
        
    Line2D.Double stroke7 = new Line2D.Double(r8,r9);
    Line2D.Double stroke8 = new Line2D.Double(r8,r10);
    Line2D.Double stroke9 = new Line2D.Double(r8,r11);
    Line2D.Double stroke10 = new Line2D.Double(r8,r12);
    Line2D.Double stroke11 = new Line2D.Double(r8,r13);
    Line2D.Double stroke12 = new Line2D.Double(r8,r14);
    Line2D.Double stroke13 = new Line2D.Double(r8,r15);
    Line2D.Double stroke14 = new Line2D.Double(r8,r16);
    
    Ellipse2D.Double pedal1 = new Ellipse2D.Double(xLeft+180,yTop+230,40,40);
    Rectangle pedal2= new Rectangle(xLeft+185,yTop+215,30,8); 
    Ellipse2D.Double seat = new Ellipse2D.Double(xLeft+120,yTop+130,60,20);
    Ellipse2D.Double chain = new Ellipse2D.Double(xLeft+100,yTop+230,120,35);
    Ellipse2D.Double stand = new Ellipse2D.Double(xLeft+190,yTop+220,15,80);
        
    int [] x1 ={xLeft+150,xLeft+300,xLeft+200};
    int [] y1 ={yTop+150,yTop+150,yTop+250};
    int [] x2 ={xLeft+160,xLeft+280,xLeft+200};
    int [] y2 ={yTop+155,yTop+155,yTop+255};
    
    Polygon body1 = new Polygon(x1,y1,3);
    Polygon body2 = new Polygon(x2,y2,3);
    
    int [] x3 ={xLeft+50,xLeft+100,xLeft+180};
    int [] y3 ={yTop+200,yTop+250,yTop+200};
    int [] x5 ={xLeft+55,xLeft+95,xLeft+175};
    int [] y5 ={yTop+205,yTop+255,yTop+205};
    Polygon body3 = new Polygon(x3,y3,3);
    Polygon body5 = new Polygon(x5,y5,3);
    
    int [] x4 ={xLeft+275,xLeft+350,xLeft+295};
    int [] y4 ={yTop+100,yTop+250,yTop+100};
    int [] x6 ={xLeft+272,xLeft+350,xLeft+292};
    int [] y6 ={yTop+100,yTop+250,yTop+100};
    Polygon body4 = new Polygon(x4,y4,3);
    Polygon body6 = new Polygon(x6,y6,3);
      
        g2.draw(frontTire1);
        g2.draw(rearTire1);
        g2.draw(frontTire2);
        g2.draw(rearTire2);
        g2.draw(frontTire3);
        g2.draw(rearTire3);
        g2.fill(frontTire4);
        g2.fill(rearTire4);
        g2.fill(pedal1);
        g2.fill(pedal2);
        pedal2.translate(0,78);
        g2.fill(pedal2);
        g2.fill(seat);
        g2.draw(chain);
        g2.draw(stand);
        g2.draw(body1);
        g2.draw(body2);
        g2.draw(body3);
        g2.draw(body4);
        g2.draw(body5);
        g2.draw(body6);
        g2.draw(stroke1);
        g2.draw(stroke2);
        g2.draw(stroke3);
        g2.draw(stroke4);
        g2.draw(stroke5);
        g2.draw(stroke6);
        g2.draw(stroke7);
        g2.draw(stroke8);
        g2.draw(stroke9);
        g2.draw(stroke10);
        g2.draw(stroke11);
        g2.draw(stroke12);
        g2.draw(stroke13);
        g2.draw(stroke14);
        g2.draw(stick);
        stick.translate(30,0);
        g2.fill(stick);
        stick.translate(30,0);
        g2.fill(stick); 
        stick.translate(30,0);
        g2.fill(stick);
        stick.translate(30,0);
        g2.fill(stick); 
        g2.fill(steer);
        g2.fill(steer1);
        g2.fill(steer2);
     }
 }

class bikeComponent extends JComponent{ 
   
   @Override
   public void paintComponent(Graphics g)
   {
       Graphics2D g2 = (Graphics2D) g;
       Bike bike1 = new Bike(0,0);
              
       int bike2x = getWidth()-500;
       int bike2y = getHeight()-500;
       Bike bike2 = new Bike(bike2x,bike2y);
       
       int bike3y = getHeight()-500;
             
       Bike bike3 = new Bike(0,bike3y);
       int bike4x = getWidth()-500;
       Bike bike4 = new Bike(bike4x,0);
       
       g2.setColor(Color.RED);
       bike1.draw(g2);
       g2.setColor(Color.BLUE);
       bike2.draw(g2);
       g2.setColor(Color.MAGENTA);
       bike3.draw(g2);
       g2.setColor(Color.DARK_GRAY);
       bike4.draw(g2);
       
       g2.setColor(Color.RED);
       g2.drawString("Thuy Tien Nguyen",450,350);
       
   }
   
}

public class Nguyen_Assignment6 {

    
    public static void main(String[] args) 
    {
       JFrame frame = new JFrame();
        frame.setSize(1000,800);
        frame.setTitle("Thuy Tien Nguyen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bikeComponent component = new bikeComponent();
        frame.add(component);
        frame.setVisible(true);
        
    }
  
}

