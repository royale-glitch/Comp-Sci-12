/*
 RollerBallDriver
*/
import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class RollerBallDriver extends Applet implements Runnable{

//By extension Applets inherit abilities.
//By implementing Runnable an independant thread can be 
//created for this applet that will not affect the 
//other tasks the computer is performing.
 
	Font theFont = new Font("TimesRoman",Font.BOLD,36);
    int frame;
    int delay;
	Thread runner;
	Table t1;
	Ball b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Color brown;
 
   public void start() {
		runner = new Thread(this);
		runner.start();
   }

   public void stop() {
		runner = null;
   }
  
   public void run() {
   
   	// Remember the starting time	long tm = System.currentTimeMillis();
		while (Thread.currentThread() == runner) {
		try {
        Thread.currentThread().sleep(delay);
		} catch (InterruptedException e) {}
		
      	repaint();
		}
   }
 
   /**
     * Initialize the applet and compute the delay between frames.
     * Initialize world and entity.
     */
 	public void init() {
	//Timing
		String str = getParameter("fps");
		int fps = (str != null) ? Integer.parseInt(str) : 50;
		delay = (fps > 0) ? (1 / fps) : 100;

 	//construct a table and a ball
	//Table(Color,x,y,width,height)
	//Ball(ID,theTable,Color,diameter)
        t1=new Table(Color.white, 50, 50, 300, 150);
        
        b1=new Ball(1, t1, Color.red, 20);
        b2=new Ball(2, t1, Color.green, 20);
        b3=new Ball(3, t1, Color.blue, 20);
        b4=new Ball(4, t1, Color.yellow, 20);
        b5=new Ball(5, t1, Color.black, 20);
        b6=new Ball(6, t1, Color.red, 20);
        b7=new Ball(7, t1, Color.green, 20);
        b8=new Ball(8, t1, Color.blue, 20);
        b9=new Ball(9, t1, Color.yellow, 20);
        b10=new Ball(10, t1, Color.black, 20);
      
        
    	brown =new Color (1*16, 9*16, 6*16);

	}
	
	public void paint(Graphics g) {
        g.setColor(brown);  //Background color
        g.fillRect(0,0, getSize().width, getSize().height);
		update(g);

	}
	
    public void update(Graphics g){

        // Draw the table, roll the ball
        t1.draw(g);
        
        b1.roll(g);
        b2.roll(g);
        b3.roll(g);
        b4.roll(g);
        b5.roll(g);
        b6.roll(g);
        b7.roll(g);
        b8.roll(g);
        b9.roll(g);
        b10.roll(g);
        }

}