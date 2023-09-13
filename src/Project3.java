import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project3 {

    public static void main(String[] args)
    {
        new Project3();
    }

    /**
     * Reads input file with points, instantiates graph, obtain shortest route,
     * and graphs it.
     */
    public Project3()
    {
        //read filename
        Scanner in = new Scanner(System.in);
        System.out.print("Name of file: ");
        String filename = in.nextLine();

        //get points from file
        ArrayList<Point> points = getPointsFromFile(filename);

        //obtain adjacency matrix and define graph with it
        int[][] matrix = generateMatrix(points);
        Graph g = new Graph(matrix);

        //compute solution to problem
        int[] localSearchRoute = new int[points.size()];
        double localSearchCost = g.TSP_localSearch(localSearchRoute);

        FrameDisplay frame = new FrameDisplay(points, localSearchCost, localSearchRoute);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * Reads points from given input file and returns them in an array list.
     *
     * @param filename name of input file
     * @return array list of points
     */
    public ArrayList<Point> getPointsFromFile(String filename)
    {
        //TO IMPLEMENT
        ArrayList<Point> points = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNext()) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                points.add(new Point(x, y));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return points;
    }

    /**
     * Generates a square matrix from the given array list of points.
     * Cell [i][j] of the matrix will contain the distance between points[i] and
     * points[j].
     *
     * @param points array list of points
     * @return matrix of pairwise distances
     */
    public int[][] generateMatrix(ArrayList<Point> points)
    {
        //TO IMPLEMENT
        int n = points.size();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    Point p1 = points.get(i);
                    Point p2 = points.get(j);
                    double distance = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
                    matrix[i][j] = (int) Math.round(distance);
                }
            }
        }
        return matrix;
    }
}
