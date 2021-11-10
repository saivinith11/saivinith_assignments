package DrawShapes;

public abstract class Shape {

abstract void draw();
	
	public static void main(String[] args) 
	{
		Shape l=new Line();
		l.draw();
		Rectangle r=new Rectangle();
		r.draw();
		Cube c=new Cube();
		c.draw();
	}

}
