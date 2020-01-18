package com.jsmile.java8.inheritance.domain;

/**
 *  abstract class : 자신의 직접 생성은 방지하고, 공통의 특징을 하위 클래스에 강제하고 싶을 때
 *  - 기본은 public,
 *  - private, static, final 등의 method 는 사용불가
 * */
public abstract class Good
{
	public enum UnitOfMeasureType { LITER, GALLON, CUBIC_METER, CUBIC_FEET }
	private String name;
	private int modelNumber;
	private double height;
	private UnitOfMeasureType unitOfMeasure;
	private boolean flammable=true;
	private double weightPerUofM;
	
	
	public Good( String _name, int _modelNumber, double _height, UnitOfMeasureType _unitOfMeasure, boolean _flammable,
			double _weightPerUofM )
	{
		// 생성자에서는 반드시 parent 의 생성자를 먼저 선언해야 함.
		super();
		name = _name;
		modelNumber = _modelNumber;
		height = _height;
		unitOfMeasure = _unitOfMeasure;
		flammable = _flammable;
		weightPerUofM = _weightPerUofM;
	}
	

	public String getName() { return name; }
	public void setName( String name ) { this.name = name; }
	
	public int getModelNumber() {return modelNumber; }
	public void setModelNumber( int modelNumber ) { this.modelNumber = modelNumber; }
	
	public double getHeight() { return height; }
	public void setHeight( double height ) { this.height = height; }
	
	public UnitOfMeasureType getUnitOfMeasure() { return unitOfMeasure; }
	public void setUnitOfMeasure( UnitOfMeasureType unitOfMeasure ) { this.unitOfMeasure = unitOfMeasure; }
	
	public boolean isFlammable() { return flammable; }
	public void setFlammable( boolean flammable ) { this.flammable = flammable; }
	
	public double getWeightPerUofM() { return weightPerUofM; }
	public void setWeightPerUofM( double weightPerUofM ) { this.weightPerUofM = weightPerUofM; }
	
	public abstract double volume();
	
	public double weight() { return ( volume() * weightPerUofM ); }
	
	public String toSimpleString() { return name + " - " + modelNumber; }
	
	public abstract  String toString();
	
	
}
