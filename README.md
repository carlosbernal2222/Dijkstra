# Dijkstra Shortest Path Project

This project implements the Dijkstra algorithm to find the shortest path in a graph. It is written in Java and provides a graphical user interface to display the shortest path.

## Project Structure

The project consists of the following Java classes:

- `FrameDisplay.java`: A `JFrame` subclass that sets up the main window for displaying the graph.
- `Graph.java`: Implements the `GraphInterface` and represents the graph structure with methods to manipulate and query the graph.
- `GraphDisplay.java`: A `JPanel` subclass responsible for the graphical representation of the graph and the shortest path.
- `GraphInterface.java`: An interface defining the structure of a graph.
- `PermutationNeighborhood.java`: Provides a method to generate a neighborhood of permutations for a given array, used in local search.
- `Point.java`: Represents a point with x and y coordinates.
- `Project3.java`: Contains the `main` method and handles file input, graph instantiation, and visualization.

## Compilation and Execution

To compile and run the project, follow these steps:

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Navigate to the `src` directory of the project.
3. Compile the Java files using the following command:
javac *.java

4. Run the `Project3` class using the Java interpreter:
java Project3

5. Follow the on-screen prompts to input the filename containing the graph data.


