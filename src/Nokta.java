
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Nokta {

    int x;
    int y;
    Alan a1;
    Nokta c1;
    Nokta c2;
    Nokta c3;
    Nokta c4;
    int Nesil;

    public void ciz(JPanel jp) {
        Graphics gc = jp.getGraphics();
        if(Nesil==0){gc.setColor(Color.RED);}else if(Nesil==1){gc.setColor(Color.BLUE);}else if(Nesil==2){gc.setColor(Color.GREEN);}
        else if(Nesil==3){gc.setColor(Color.ORANGE);}else if(Nesil==4){gc.setColor(Color.MAGENTA);}else if(Nesil==5){gc.setColor(Color.CYAN);}
        gc.fillOval(x - 5, y - 5, 10, 10);
        gc.drawLine(x - a1.sol + 1, y, x + a1.sag - 1, y);
        gc.drawLine(x, y - a1.ust + 1, x, y + a1.alt - 1);
    }

    Nokta(int x1, int y1, int x2, int y2, int n, JPanel jp) {
        this.c1 = null;
        this.c2 = null;
        this.c3 = null;
        this.c4 = null;
        this.Nesil = n;
        this.x = x2;
        this.y = y2;
        this.a1 = new Alan(x1, y1, x2, y2);
        ciz(jp);
    }

    Nokta(Alan g, int x1, int y1, int x2, int y2, int n, JPanel jp) {
        this.x = x2;
        this.y = y2;
        this.Nesil = n;
        a1 = new Alan(g, x1, y1, x2, y2);
        ciz(jp);
    }
}
