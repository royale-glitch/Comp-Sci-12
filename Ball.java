import java.applet.Applet;
import java.awt.*;

public class Ball{
        //information about ball
        //supplied by the constructor
        public int ballNum;
        public int bw;
        public int x, y;
        private Color bc;

        //information about a ball's speed
        //deltaX=1 indicates X changes 1 pixel each time
        
        int speed = (int)(Math.random()*4)+1;
        int speed2 = (int)(Math.random()*4)+1;
        public int deltaX=speed;        
        public int deltaY=speed2;

        //information about the table
        //retreived from the table object by the constructor
        private Table t;
        private Color tc;
        private int tTop;
        private int tBottom;
        private int tLeft;
        private int tRight;

        // Locator is a place to store information about
        // the location of every ball on the table
        public static Locator ballLocator = new Locator();


        public Ball(int n, Table t, Color bc, int bw){
                this.ballNum=n;
                this.t=t;
                this.bc=bc;
                this.bw=bw;
                
                //initial position is random
                x=t.getTablex()+(int)(Math.random()*(t.getTablew()-bw));
                y=t.getTabley()+(int)(Math.random()*(t.getTableh()-bw));
                
                //Ball stores information about the table
                this.tTop=t.getTabley();
                this.tBottom=tTop+t.getTableh()-bw;
                this.tLeft=t.getTablex();
                this.tRight=tLeft+t.getTablew()-bw;
                this.tc=t.getTableColor();
                
				//Let Locator know about this ball
                ballLocator.register(this);
       }

        // Each Ball rolls itself on the table
        // This happens each update
        
        public void roll (Graphics g){
                 // setting ball to table's colour
                 // makes it invisible
                 g.setColor(this.tc);
                 g.fillOval(x,y,bw,bw);
                 
                 // avoids falling off
                 if (x < tLeft) deltaX *= -1;
                 if (x > tRight) deltaX *= -1;
                 if (y < tTop) deltaY *= -1;
                 if (y > tBottom) deltaY *= -1;


                 x+=deltaX;
                 y+=deltaY;

                 // register location
                 ballLocator.update(this);

                 // uncomment the following 5 lines
                 // to allow proximity detection
                 
            
                 if (ballLocator.proximity(this)){
                     deltaX *= -1;
                     deltaY *= -1;
                 }                

                 // setting ball to ball's colour
                 // makes it visible in new location
                 g.setColor(bc);
                 g.fillOval(x,y,bw,bw);
                 
        }
}