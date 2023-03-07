package java_programs;

/// fix the bug in the following method
import java.util.*;
public class SQRT {
    public static double sqrt(double x, double epsilon) {
        double approx = x / 2f;
        while (Math.abs(x-approx) > epsilon) {
            approx = 0.5f * (approx + x / approx);
        }
        return approx;
    }
}

/// fixed method
import java.util.*;
public class SQRT {
    public static double sqrt(double x, double epsilon) {
        double approx = x / 2f;
        while (Math.abs(x-approx*approx) > epsilon) {
            approx = 0.5f * (approx + x / approx);
        }
        return approx;
    }
}