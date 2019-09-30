import java.applet.Applet;
import java.awt.*;

// Table is the surface that the ball rolls on.
// It is created by being given an x,y coordinate and a width
// height and colour.
// Table can be asked for these attributes
// Table can draw itself sent the graphics page
public class Table
{
        private Color tc;
        private int tx, ty, tw, th;

        Table (Color tc, int tx, int ty, int tw, int th){
                this.tc=tc;
                this.tx=tx;
                this.ty=ty;
                this.tw=tw;
                this.th=th;
        }

        public void draw(Graphics page)
        {
                page.setColor(tc);
                page.fillRect(tx, ty, tw, th);
        }

        public Color getTableColor()
        {
                return this.tc;
        }

        public int getTablex()
        {
                return this.tx;
        }

        public int getTabley()
        {
                return this.ty;
        }

        public int getTablew()
        {
                return this.tw;
        }

        public int getTableh()
        {
                return this.th;
        }
}