public class DisplayGraph {
    public static void main(String[] args) {
        WeightedGraph graphWeighted = new WeightedGraph(true);
        WeightedNode zero = new WeightedNode(0, "0");
        WeightedNode one = new WeightedNode(1, "1");
        WeightedNode two = new WeightedNode(2, "2");
        WeightedNode three = new WeightedNode(3, "3");
        WeightedNode four = new WeightedNode(4, "4");
        WeightedNode five = new WeightedNode(5, "5");
        WeightedNode six = new WeightedNode(6, "6");

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
