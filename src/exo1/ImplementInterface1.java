package exo1;

public class ImplementInterface1 implements Exemple {

	public int v1;
	public int v2;
	
	public int minimum()
	{
		return(Math.min(v1, v2));
	}
	
	public int maximum()
	{
		return(Math.max(v1, v2));
	}
}
