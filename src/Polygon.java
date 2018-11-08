import java.util.*;

public class Polygon {
	Edge[] allEdges;
	List medians = new ArrayList<Median>();
	Polygon(int edges)
	{
		allEdges = new Edge[edges];
		for(int i=0;i<allEdges.length;i++)
		{
			allEdges[i] = new Edge();
		}
	}

	Edge getEdge(int i)
	{
		return allEdges[i];
	}
	public String toString()
	{
		String s = allEdges[0].toString();
		for(int i=1;i<allEdges.length;i++)
		{
			s+=allEdges[i];
		}
		return s;
	}

}
