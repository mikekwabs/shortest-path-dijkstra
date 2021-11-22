public class GraphShow {
    public static void main(String[] args) {
        GraphWeighted graphWeighted = new GraphWeighted(true);
        NodeWeighted zero = new NodeWeighted(0, "0");
        NodeWeighted one = new NodeWeighted(1, "1");
        NodeWeighted two = new NodeWeighted(2, "2");
        NodeWeighted three = new NodeWeighted(3, "3");
        NodeWeighted four = new NodeWeighted(4, "4");
        NodeWeighted five = new NodeWeighted(5, "5");
        NodeWeighted six = new NodeWeighted(6, "6");

        // Our addEdge method automatically adds Nodes as well.
        // The addNode method is only there for unconnected Nodes,
        // if we wish to add any
        graphWeighted.addEdge(zero, one, 8);
        graphWeighted.addEdge(zero, two, 11);
        graphWeighted.addEdge(one, three, 3);
        graphWeighted.addEdge(one, four, 8);
        graphWeighted.addEdge(one, two, 7);
        graphWeighted.addEdge(two, four, 9);
        graphWeighted.addEdge(three, four, 5);
        graphWeighted.addEdge(three, five, 2);
        graphWeighted.addEdge(four, six, 6);
        graphWeighted.addEdge(five, four, 1);
        graphWeighted.addEdge(five, six, 8);

        graphWeighted.DijkstraShortestPath(zero, six);
    }
}
