package ctec.model;

import java.awt.Color;

public class Dish
{
	private boolean isDirty;
	private Color color;
	private int radius;
	
	public Dish(boolean isDirty, Color color, int radius)
	{
		this.isDirty = isDirty;
		this.color = color;
		this.radius = radius;
	}
	
	public boolean isDirty()
	{
		return isDirty;
	}
	
	public Color color()
	{
		return color;
	}
	
	public int radius()
	{
		return radius;
	}


}
