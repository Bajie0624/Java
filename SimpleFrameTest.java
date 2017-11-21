package inheritance;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.lang.String;

public class SimpleFrameTest extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                {
                    SimpleFrame frame = new SimpleFrame();
                    frame.setTitle("hello");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}
class SimpleFrame extends JFrame{

    public SimpleFrame(){
        add(new NoteComponent());
        pack();
        }
    }

class NoteComponent extends JComponent{
    /*public static final int MESSAGE_X = 75;*/
    //public static final int MESSAGE_Y = 100;
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;
        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);
        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.draw(ellipse);
        g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;
        Ellipse2D circle =  new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX+radius, centerY+radius);
        g2.draw(circle);
    }
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
