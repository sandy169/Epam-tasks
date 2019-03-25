import java.io.*;
import java.util.*;
class indianArmy
{
	public static void main(String args[] ) throws Exception 
	{
		indianArmy t = new indianArmy();
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int checkPoints = Integer.parseInt(str[0]);
		long Start = Long.parseLong(str[1]);
		long End = Long.parseLong(str[2]);
		Point points[] = new Point[checkPoints];
		for(int i=0;i<checkPoints;i++) {
			str = br.readLine().split(" ");
			long A = Long.parseLong(str[0]);
			long B = Long.parseLong(str[1]);
			points[i] = new Point();
			points[i].x = A-B;
			points[i].y = A+B;
		}
		if(Start == End) {
		    System.out.println(0); return;
		    
		}
		Arrays.sort(points);
		long dist=0;
		for(int i=0;i<points.length && Start<End;i++) {
			if(points[i].x>Start) 
			dist += points[i].x-Start;
			if(points[i].y>Start) 
			Start=points[i].y;
		}
		if(End-Start > 0) dist += End-Start;
		System.out.println(dist);
	}
	static class Point implements Comparable<Point>{
		long x,y;
		@Override
		public int compareTo(Point o) {
			return (x<o.x?-1:(x==o.x?0:1));
		}
	}
}