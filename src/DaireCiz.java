
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class DaireCiz extends JComponent{
    private Color renk;
    
    public DaireCiz(Color renk){
        super();
        this.renk = renk;
    }

    public DaireCiz(){
        this(Color.BLACK);
    }
    
    public void paintComponent(Graphics a,int x,int y, int cap){
        super.paintComponent(a);
        a.drawOval(x-cap/2, y-cap/2, cap, cap);
    }
}