package com.jsmile.java8.inheritance.domain;

/**
 *  interface : 상속관계는 아니지만 공통적인 기능을 강제하고 싶을 때 사용
 *  - 선언되지 않아도 기본은 public
 *  - default abstract method 는 기존의 인터페이스에 새로운 기능을 추가하고자 하지만 하위 구현 클래스에 영향을 주고 싶지 않을 대
 *  - static abstract method 는 속성이 아닌 보다 강력한 기능 그룹을 표현하고자 할 때 사용.
 * */
public interface Product
{
   public abstract String getName();
   public abstract void setName( String _name );
   public abstract String toString();
}
