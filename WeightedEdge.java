public class WeightedEdge implements Comparable<WeightedEdge> {

    WeightedNode source;
    WeightedNode destination;
    double weight;

    WeightedEdge(WeightedNode s, WeightedNode d, double w) {
        // Note that we are choosing to use the (exact) same objects in the Edge class
        // and in the GraphShow and GraphWeighted classes on purpose - this MIGHT NOT
        // be something you want to do in your own code, but for sake of readability
        // we've decided to go with this option
        source = s;
        destination = d;
        weight = w;
    }

    public String toString() {
        return String.format("(%s -> %s, %f)", source.name, destination.name, weight);
    }

    // We need this method if we want to use PriorityQueues instead of LinkedLists
    // to store our edges, the benefits are discussed later, we'll be using
    // LinkedLists
    // to make things as simple as possible
    public int compareTo(WeightedEdge otherEdge) {

        // We can't simply use return (int)(this.weight - otherEdge.weight) because
        // this sometimes gives false results
        if (this.weight > otherEdge.weight) {
            return 1;
        } else
            return -1;
    }
}