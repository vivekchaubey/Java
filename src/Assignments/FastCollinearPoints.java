/*
    Taking one point at a time and calculating slope with others.
    Then sorting the slope and finding out the same slope values
    three times to identify the four collinear points.
* */

package Assignments;

import java.util.*;
import java.util.Map.*;

public class FastCollinearPoints {
    List<List<Point>> colPoints=new ArrayList<>();

    public void printHashMap(HashMap<Point,Double> hashMap){
        for (Entry<Point, Double> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
    }

    public List<Entry<Point,Double>> getSlopeSortedList(HashMap<Point,Double> hashMap){
        List<Entry<Point,Double>> list=new ArrayList<>();
        list.addAll(hashMap.entrySet());
        Collections.sort(list, new Comparator<Entry<Point, Double>>() {
            @Override
            public int compare(Entry<Point, Double> o1, Entry<Point, Double> o2) {
                if(o1.getValue()<o2.getValue()){return -1;}
                if(o1.getValue().equals(o2.getValue())){return 0;}
                return 1;
            }
        });
        return list;
    }

    public FastCollinearPoints(Point[] points){
        List<Entry<Point,Double>> slopeSortedList;

        for(int i=0;i<points.length;i++){
            HashMap<Point, Double> temp=new HashMap<>();
            for(int j=i+1;j<points.length;j++){
                double slope=points[i].slopeTo(points[j]);
                temp.put(points[j],slope);
            }
            slopeSortedList=getSlopeSortedList(temp);
            for(int k=0;k<slopeSortedList.size()-2;k++){
                if((slopeSortedList.get(k).getValue().equals(slopeSortedList.get(k + 1).getValue()))
                        &&(slopeSortedList.get(k + 1).getValue().
                        equals(slopeSortedList.get(k + 2).getValue()))){
                    List<Point> t1=new ArrayList<>();
                    t1.add(points[i]);
                    t1.add(slopeSortedList.get(k).getKey());
                    t1.add(slopeSortedList.get(k+1).getKey());
                    t1.add(slopeSortedList.get(k+2).getKey());
                    colPoints.add(t1);
                }
            }
        }

        for(List<Point> each:colPoints){
            Collections.sort(each);
        }
    }
    public int numberOfSegments(){
        return colPoints.size();
    }
    public LineSegment[] segments(){
        LineSegment[] segments=new LineSegment[colPoints.size()];
        for(int i=0;i<segments.length;i++){
            LineSegment a=new LineSegment(colPoints.get(i).get(0),
                    colPoints.get(i).get(3));
            segments[i]=a;
        }
        return segments;
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
        FastCollinearPoints fcp=new FastCollinearPoints(points);
        fcp.segments();
    }
}
