import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraphDisplay extends JPanel
{

    ArrayList<Point> points;
    double localSearchCost;
    int[] localSearchRoute;

    public GraphDisplay(ArrayList<Point> points,
                        double localSearchCost,
                        int[] localSearchRoute)
    {
        this.points = points;
        this.localSearchCost = localSearchCost;
        this.localSearchRoute = localSearchRoute;
    }

    public void paint(Graphics g)
    {
        //TO IMPLEMENT
        super.paint(g);

        for (int i = 0; i < points.size(); i++) {
            Point p = points.get(i);
            g.fillOval(p.x - 5, p.y - 5, 10, 10);
        }

        for (int i = 0; i < localSearchRoute.length; i++) {
            Point p1 = points.get(localSearchRoute[i]);
            Point p2 = points.get(localSearchRoute[(i + 1) % localSearchRoute.length]);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }

        g.drawString("Local Search Total Cost:" + localSearchCost, 20, 20);

    }
}
