import java.applet.Applet;
import java.awt.*;

public class Locator{
        private Ball[] ballLocator;
        private int number=0;
        private int limit;

        public Locator (){
            ballLocator = new Ball[11];
            limit = 10;

        }

        public void register(Ball b){
        	ballLocator[b.ballNum] = b;
			number++;
			System.out.println("Ball "+b.ballNum+ " registered");
        }

        public void update(Ball b){
             ballLocator[b.ballNum] = b;

        }

        public boolean proximity(Ball b){
        // check my location against all the others
        // evade if I am close 
            int bCenterX = b.x + b.bw/2;
            int bCenterY = b.y + b.bw/2;
            Ball btemp;

                for(int i=1;i<= number;i++){
                     if (!(i == b.ballNum)) {
                        btemp = ballLocator[i];
                        
                        int xDist=(btemp.x + b.bw/2) - bCenterX;
                        int yDist=(btemp.y + b.bw/2) - bCenterY;
                        if ( (Math.abs(xDist) <= b.bw)&& (Math.abs(yDist) <= b.bw)){
                            return true;
                        }
                     }
                }

                return false;

        }

}