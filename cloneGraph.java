import java.util.*;
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


class cloneGraph {
    public Node cloneGraph(Node node) {

        Queue<Node> queue = new LinkedList<Node>();
        HashMap<Node,Node> map = new HashMap<Node,Node>();
        queue.add(node);
        map.put(node,new Node(node.val));
        while(!queue.isEmpty()){
            Node pop = queue.remove();
            Node clone = map.get(pop);
            map.put(pop,clone);
            for(Node neigh :pop.neighbors){
                Node cloneNeigh = null;
                if(!map.containsKey(neigh)){
                    cloneNeigh = new Node(neigh.val);
                    queue.add(neigh);
                    map.put(neigh,cloneNeigh);
                }
                else{
                    cloneNeigh = map.get(neigh);
                }
                clone.neighbors.add(cloneNeigh);
            }

        }


        return map.get(node);

    }
}