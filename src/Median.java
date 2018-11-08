
public class Median {

	Dot dot;//מאיזה קודקוד יוצא התיכון
	Edge edge;//לאיזו צלע יוצא התיכון
	DotOnEdge middlePoint;//הנקודה החדשה שנוצרה על הצלע
	Edge firstEdge,secondEdge;//שתי הצלעות החדשות שנוצרו
	Median(Dot source,Edge target)
	{
		this.dot = source;
		this.edge=target;
		middlePoint = new DotOnEdge(target);
		firstEdge = new Edge(target.getFirstDot(),middlePoint);
		secondEdge = new Edge(middlePoint,target.getSecondDot());
		firstEdge.insertEquals(secondEdge);
		secondEdge.insertEquals(firstEdge);
		System.out.println("Built median from dot: "+ dot +" to edge: "+edge+".\n"
				 +"The new dot created: "+middlePoint);
	}
	Edge getFirstEdge()
	{
		return firstEdge;
	}
	Edge getSecondEdge()
	{
		return secondEdge;
	}
	public String toString()
	{
		return "Built median from dot: "+ dot +" to edge: "+edge+".\n"
				 +"The new dot created: "+middlePoint;
	}
}
