import java.util.*;
public class Edge {
	Dot firstDot;
	Dot secondDot;
	List<Edge> allEqualsEdges = new ArrayList<Edge>();
	Edge()
	{
		firstDot = new Dot();
		secondDot = new Dot();
	}
	Edge(Dot a,Dot b)
	{
		firstDot =a;
		secondDot=b;
	}
	Dot getFirstDot()
	{
		return this.firstDot;
	}
	Dot getSecondDot()
	{
		return this.secondDot;
	}
	void insertEquals(Edge other)
	{
		allEqualsEdges.add(other);
	}
	boolean equals(Edge other)
	{
		return allEqualsEdges.contains(other);
	}
	Median buildMedianOnEdge(Dot source)
	{
		return new Median(source,this);
	}
	public String toString()
	{
		return firstDot.toString()+secondDot.toString();
	}
}
