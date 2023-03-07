package java_programs;

/// fix the bug in the following method
import java.util.*;
public class DETECT_CYCLE {
    public static boolean detect_cycle(Node node) {
        Node hare = node;
        Node tortoise = node;
        while (true) {
            if (hare.getSuccessor() == null)
                return false;
            tortoise = tortoise.getSuccessor();
            hare = hare.getSuccessor().getSuccessor();
            if (hare == tortoise)
                return true;
        }
    }
}

/// fixed method
import java.util.*;
public class DETECT_CYCLE {
    public static boolean detect_cycle(Node node) {
        Node hare = node;
        Node tortoise = node;
        while (true) {
            if (hare.getSuccessor() == null)
                return false;
            tortoise = tortoise.getSuccessor();
            hare = hare.getSuccessor().getSuccessor();
            if (hare == tortoise)
                return true;
            if (hare == null)
                return false;
        }
    }
}