/*
    Define (x,y) points. Compare two (x,y) points and keep them in order.
    Calculate slopes for the given arguments.
*/

package Assignments;

import java.util.Comparator;

public class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int xArg,int yArg){
        if((xArg<32767)&&(yArg<32767)){
            x=xArg;
            y=yArg;
        }
    }

    public String toString(){
        return "("+x+","+y+")";
    }

    @Override
    public int compareTo(Point point) {
        if(y<point.y){
            return -1;
        }
        if(y==point.y){
            if(x<point.x){
                return -1;
            }
        }
        return 0;
    }

    private class PointComparator implements Comparator<Point>
    {
        public int compare(Point p1, Point p2)
        {
            double p1Slope = slopeTo(p1);
            double p2Slope = slopeTo(p2);

            if (p1Slope > p2Slope) {
                return 1;
            }

            if (p1Slope < p2Slope) {
                return -1;
            }
            return 0;
        }
    }

    public Comparator<Point> slopeOrder(){
        return new PointComparator();
    }

    public double slopeTo(Point point){
        if((x==point.x)&&(y!=point.y)){return Double.POSITIVE_INFINITY;}
        if((x==point.x)&&(y==point.y)){return Double.NEGATIVE_INFINITY;}
        if((x!=point.x)&&(y==point.y)){return 0;}
        double slope=Math.round((y-point.y)*100.0/(x-point.x))/100.0;
        return slope;
    }
}
