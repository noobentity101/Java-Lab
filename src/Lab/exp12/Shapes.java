package Lab.exp12;

import java.applet.*;
import java.awt.*;

public class  Shapes extends Applet {
    int x = 300, y = 100, r = 50;
    public void paint(Graphics g) {
        g.drawLine(30,300,200,10);
        g.drawOval(x-r,y-r,100,100);
        g.drawRect(400,50,200,100);
    }
}