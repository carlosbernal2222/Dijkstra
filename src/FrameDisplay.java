import javax.swing.*;
import java.util.ArrayList;

public class FrameDisplay extends JFrame {

    int WIDTH = 450;
    int HEIGHT = 450;

    public FrameDisplay(ArrayList<Point> points,
                        double localSearchCost,
                        int[] localSearchRoute)
    {
        //TO IMPLEMENT
        setSize(WIDTH, HEIGHT);
        setTitle("Shortest Path");

        GraphDisplay graphDisplay = new GraphDisplay(points, localSearchCost, localSearchRoute);
        add(graphDisplay);
    }

}
