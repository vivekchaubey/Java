/*
    Creates the line segment between given points.
 */

package Assignments;

public class LineSegment {
    private final Point p;
    private final Point q;

    public LineSegment(Point pArg, Point qArg) {
        if (pArg == null || qArg == null) {
            throw new NullPointerException("argument is null");
        }
        this.p = pArg;
        this.q = qArg;
    }

    public String toString() {
        return p + " -> " + q;
    }

    public int hashCode() {
        throw new UnsupportedOperationException();
    }

}

