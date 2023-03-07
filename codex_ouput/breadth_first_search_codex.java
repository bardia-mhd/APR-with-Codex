package java_programs;

/// fix the bug in the following method
import java.util.*;
import java.util.ArrayDeque;
public class BREADTH_FIRST_SEARCH {
    public static Set<Node> nodesvisited = new HashSet<>();
    public static boolean breadth_first_search(Node startnode, Node goalnode) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.addLast(startnode);
        nodesvisited.add(startnode);
        while (true) {
            Node node = queue.removeFirst();
            if (node == goalnode) {
                return true;
            } else {
                for (Node successor_node : node.getSuccessors()) {
                    if (!nodesvisited.contains(successor_node)) {
                        queue.addFirst(successor_node);
                        nodesvisited.add(successor_node);
                    }
                }
            }
        }
    }
}
/// fixed method
import java.util.*;
import java.util.ArrayDeque;
public class BREADTH_FIRST_SEARCH {
    public static Set<Node> nodesvisited = new HashSet<>();
    public static boolean breadth_first_search(Node startnode, Node goalnode) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.addLast(startnode);
        nodesvisited.add(startnode);
        while (!queue.isEmpty()) {
            Node node = queue.removeFirst();
            if (node == goalnode) {
                return true;
            } else {
                for (Node successor_node : node.getSuccessors()) {
                    if (!nodesvisited.contains(successor_node)) {
                        queue.addFirst(successor_node);
                        nodesvisited.add(successor_node);
                    }
                }
            }
        }
        return false;
    }
}