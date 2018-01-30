package abstract_sphere;

abstract public class Shape 
{
	abstract void volume (int length,int breadth, int height);
	abstract void area (float radius);

void start (int length, int breadth, int height, float radius)
{
	volume (length, breadth, height);
	area (radius);
}

}
