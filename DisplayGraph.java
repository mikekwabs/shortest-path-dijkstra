public class DisplayGraph {
    public static void main(String[] args) {
        WeightedGraph graphWeighted = new WeightedGraph(true);
        WeightedNode zero = new WeightedNode(0, "Entrance");
        WeightedNode one = new WeightedNode(1, "Institute Of African Studies");
        WeightedNode two = new WeightedNode(2, "JQB");
        WeightedNode three = new WeightedNode(3, "Kwame Nkrumah Complex");
        WeightedNode four = new WeightedNode(4, "College of Basic and Applied Science");
        WeightedNode five = new WeightedNode(5, "Legon Hall");
        WeightedNode six = new WeightedNode(6, "Akuafo Hall");
        WeightedNode seven = new WeightedNode(7, "Balme Library");
        WeightedNode eight = new WeightedNode(8, "Absa Bank");
        WeightedNode nine = new WeightedNode(9, "UGCS");
        WeightedNode ten = new WeightedNode(5, "CommonWealth");

        // Our addEdge method automatically adds Nodes as well.
        // The addNode method is only there for unconnected Nodes,

        graphWeighted.addEdge(zero, one, 180);
        graphWeighted.addEdge(zero, two, 205);
        graphWeighted.addEdge(zero, three, 113);
        graphWeighted.addEdge(one, four, 287);
        graphWeighted.addEdge(two, three, 282);
        graphWeighted.addEdge(two, seven, 741);
        graphWeighted.addEdge(three, four, 270);
        graphWeighted.addEdge(three, eight, 522);
        graphWeighted.addEdge(four, five, 247);
        graphWeighted.addEdge(four, six, 246);
        graphWeighted.addEdge(five, six, 316);
        graphWeighted.addEdge(five, ten, 535);
        graphWeighted.addEdge(six, eight, 112);
        graphWeighted.addEdge(six, ten, 755);
        graphWeighted.addEdge(seven, eight, 297);
        graphWeighted.addEdge(seven, nine, 188);
        graphWeighted.addEdge(seven, ten, 820);
        graphWeighted.addEdge(eight, ten, 665);
        graphWeighted.addEdge(four, five, 2);
        graphWeighted.addEdge(nine, ten, 653);

        // Since the source node is set to zero, the first argument of the dijkstra algorithm below must be set to zero, unless otherwise.
        graphWeighted.DijkstraShortestPath(zero, seven);
    }
}
