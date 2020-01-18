package com.jsmile.java8.inheritance.domain;

public class Liquid extends Good
{
	private double radius;


	public Liquid( String _name, int _modelNumber, double _height, UnitOfMeasureType _unitOfMeasure, boolean _flammable,
			double _weightPerUofM, double _radius )
	{
		super( _name, _modelNumber, _height, _unitOfMeasure, _flammable, _weightPerUofM );
		
		this.radius = _radius;
	}
	
	
	public double getRadius() { return radius; }
	public void setRadius( double _radius ) { radius = _radius; }

	@Override
	public double volume() 
	{
		// parent의 private height 속성 접근을 위해 getHeight() 사용 
		return Math.PI * radius * radius * getHeight();
	}

	@Override
	public String toSimpleString()
	{
		return super.toSimpleString() + " Liguid " + " " + getUnitOfMeasure();
	}

	public String toString()
	{
		return super.toSimpleString() + " Liguid " + " " + getUnitOfMeasure();
	}
}
