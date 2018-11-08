
public class DotOnEdge extends Dot{

	Edge edge;
	DotOnEdge(Edge a)
	{
		super();
		edge = a;
		
	}
	boolean isOnEdge(Edge a)
	{
		return a==edge;
	}
}
