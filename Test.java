import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Test {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        List<Node> data = new ArrayList<Node>();
        List<String> inputs = new ArrayList<>();

        while ((line = in.readLine()) != null) {
            inputs.add(line);
        }

        String[] first = inputs.get(0).split(";");

        for (String str : first) {
            String[] comma = str.split(",");
            data.add(new Node(comma[0], comma[1], Double.parseDouble(comma[2])));
        }
        System.out.println(getRatio(inputs.get(1), inputs.get(2),data));
    }

    public static double getRatio(String start, String end, List<Node> data) {
        Map<String, Map<String, Double>> map = new HashMap();
        for (Node node : data) {
            if (!map.containsKey(node.start)) map.put(node.start, new HashMap());
            map.get(node.start).put(node.end, node.ratio);
            if (!map.containsKey(node.end)) map.put(node.end, new HashMap());
            map.get(node.end).put(node.start, 1.0 / node.ratio);
        }
        Queue<String> q = new LinkedList();
        Queue<Double> val = new LinkedList();
        q.offer(start);
        val.offer(1.0);
        Set<String> visited = new HashSet();
        while (!q.isEmpty()) {
            String cur = q.poll();
            double num = val.poll();
            if (visited.contains(cur)) continue;
            visited.add(cur);
            if (map.containsKey(cur)) {
                Map<String, Double> next = map.get(cur);
                for (String key : next.keySet()) {
                    if (!visited.contains(key)) {
                        q.offer(key);
                        if (key.equals(end)) return num * next.get(key);
                        val.offer(num * next.get(key));
                    }
                }
            }
        }
        return -1;
    }

    static class Node {
        String start;
        String end;
        double ratio;

        public Node(String s, String e, double r) {
            this.start = s;
            this.end = e;
            this.ratio = r;

        }
    }
}
