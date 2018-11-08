
public class Dot {
	static int dotCount = 0;
	char dot = 'A';
	
	Dot()
	{
		dot+=dotCount;
		dotCount++;
	}

	public String toString()
	{
		return Character.toString(dot);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge a = new Edge();
		Dot c = new Dot();
		Median med = a.buildMedianOnEdge(c);
		System.out.println(med.getFirstEdge().equals(a));
	}

}
