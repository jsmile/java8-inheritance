package com.jsmile.java8.inheritance.domain;

public class Service implements Product
{
   private String name;
   private int estimatedTaskDuration;
   private boolean timeAndMaterials;

   public Service( String _name, int _estimatedTaskDuration, boolean _timeAndMaterials )
   {
      this.name = _name;
      this.estimatedTaskDuration = _estimatedTaskDuration;
      this.timeAndMaterials = _timeAndMaterials;
   }

   public String getName() { return name; }
   public void setName( String name ) { this.name = name; }

   public int getEstimatedTaskDuration() { return estimatedTaskDuration; }
   public void setEstimatedTaskDuration( int estimatedTaskDuration ) { this.estimatedTaskDuration = estimatedTaskDuration; }

   public boolean isTimeAndMaterials() { return timeAndMaterials; }
   public void setTimeAndMaterials( boolean timeAndMaterials ) { this.timeAndMaterials = timeAndMaterials; }

   @Override
   public String toString()
   {
      return this.name + "( a " + this.estimatedTaskDuration + " day service )";
   }

}
