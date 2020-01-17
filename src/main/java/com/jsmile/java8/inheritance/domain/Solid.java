package com.jsmile.java8.inheritance.domain;

public class Solid extends Good
{
	private double width;
	private double length;
	
	
	public Solid( String _name, int _modelNumber, double _height, UnitOfMeasureType _unitOfMeasure, boolean _flammable,
			double _weightPerUofM, double _width, double _length )
	{
		super( _name, _modelNumber, _height, _unitOfMeasure, _flammable, _weightPerUofM );
		
		this.width = _width;
		this.length = _length;
	}
	

	public double getWidth() { return width; }
	public void setWidth( double _width ) { width = _width; }

	public double getLength() { return length; }
	public void setLength( double _length ) { length = _length; }
	

	@Override
	public double volume()
	{
		return width * length * getHeight();
	}

	@Override
	public String toSimpleString()
	{
		return super.toSimpleString() + " that is " + volume() + "" + getUnitOfMeasure() + " in size";
	}
	
}
