package exo1;

public class ImplementInterface2 implements Exemple{

	public int v1;
	public int v2;
	public int v3;
	
	public int minimum()
	{
		int temp = Math.min(v1, v2);
		return (Math.min(temp, v3));
	}
	
	public int maximum()
	{
		int temp = Math.max(v1, v2);
		return (Math.max(temp, v3));
	}
}
