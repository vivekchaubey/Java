/*
    Get input as array of n points. It then takes 4 points in pair and checks
    the collinearity of the given four points. It then stores the pair of 4
    points in an array of output.
*/

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteCollinearPoints {
    List<LineSegment> output=new ArrayList<>();

    private void checkCollinear(Point[] points){
        Arrays.sort(points);

        double slope1=points[0].slopeTo(points[1]);
        double slope2=points[0].slopeTo(points[2]);
        double slope3=points[0].slopeTo(points[3]);
        if((slope1==slope2)&&(slope1==slope3)){
            output.add(new LineSegment(points[0],points[3]));
        }
    }


    public BruteCollinearPoints(Point[] points){
        List<Point[]> fourAtaTime=new ArrayList<>();
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                for(int k=j+1;k<points.length;k++){
                    for(int l=k+1;l<points.length;l++){
                        Point[] temp={points[i],points[j],points[k],points[l]};
                        fourAtaTime.add(temp);
                    }
                }
            }
        }

        for(int i=0;i<fourAtaTime.size();i++){
            checkCollinear(fourAtaTime.get(i));
        }

    }

    public static void main(String[] args) {
        Point p1= new Point(-1,1);
        Point p2= new Point(0,3);
        Point p3= new Point(1,5);
        Point p4= new Point(2,7);
        Point p5= new Point(1,0);
        Point p6= new Point(2,0);
        Point p7= new Point(3,0);
        Point p8= new Point(4,0);
        Point p9= new Point(1,10);
        Point p10= new Point(3,2);

        Point[] points={p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        BruteCollinearPoints bcp=new BruteCollinearPoints(points);
        bcp.print();
    }
    public int numberOfSegments(){
        int size=0;
        if(output.size()!=0){
            size=output.size();
        }
        return size;
    }
    private void print(){
        LineSegment[] output=segments();
        if(output.length==0){
            System.out.println("no collinear points");
        }else{
            for(LineSegment each:output){
                System.out.println(each);
            }
        }
    }
    public LineSegment[] segments(){
        LineSegment[] segments=new LineSegment[output.size()];
        output.toArray(segments);
        return segments;
    }
}
