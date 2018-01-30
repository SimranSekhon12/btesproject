package abstract_sphere;

public class Sphere extends Rectangle
{
	void area (float radius)
	{
		float arr = (float) ((4.0/3.0)*Math.PI*Math.pow(radius,3));
		System.out.println("area of sphere = "+arr);
	}
}
