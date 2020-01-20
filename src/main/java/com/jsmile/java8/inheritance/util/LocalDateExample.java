package com.jsmile.java8.inheritance.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *  Java 8 LocalDate, LocalTime, LocalDateTime, Period 그리고 DateTimeFormatter 
 *  - immutable Object( 기존값은 변경되지 않고 항상 새로운 Object 를 생성하여 처리된다. )
 *  - assign 은 참조의 변경
 *  - LocalDate 에 대한 작업결과는 신규 Object 생성
 * */ 
public class LocalDateExample
{
	public static void p( Object _obj ) 
	{
		System.out.println( _obj );
	}
	
	
	public static void main( String[] args )
	{
		/**
		 *  LocalDate
		 *  - 시간이 빠진 날짜만을 다룬다.
		 * */
		// LocalDate today = new LocalDate(); 라고 객체를 생성하지 않는다.
		LocalDate today = LocalDate.now();	p( today );
		LocalDate newDate = LocalDate.of( 2019, Month.JANUARY, 20 );	p( newDate );
		LocalDate anotherDate = LocalDate.of( 2019, 1, 20 );	p( anotherDate );
		
		LocalDate aWeekAfterNow = today.plusWeeks( 1 );	p( aWeekAfterNow );
		p( today );	// today 는 변하지 않고( immutable ) 작업결과는 새로운 객체인 aWeekAfterNow 생성되어 나타남
		today = today.minusWeeks( 1 );
		p( today );	// '2019-1-20' 객체자체를 변경시키는 것이 아니라 now 의 참조를 새로운 객체( 2020-01-13 )로 변경시킴
		
		LocalDate yesterday = today.minusDays( 1 );
		System.out.println( yesterday.isBefore( today ) );
		System.out.println( "######################################" );
		
		/**
		 *  LocalTime
		 *  - 날짜를 제외한 시간만을 다룬다.
		 * */
		// LocalTime now = new LocalTime()	라는 방식으로 객체를 생성하지 않음.
		LocalTime now = LocalTime.now();	p( now );
		LocalTime timeSetting = LocalTime.of( 11, 03, 00 );	p( timeSetting );
		LocalTime anHourFromNow = now.plusHours( 1 );	p( anHourFromNow );
		LocalTime anHourEarlier = now.minusHours( 1 );	p( anHourEarlier );
		System.out.println( anHourFromNow.isBefore( now ) );
		System.out.println( "######################################" );
		
		/**
		 *  DateTime
		 *  - 날짜와 시간을 모두 다룬다.
		 * */
		LocalDateTime nowDateTime = LocalDateTime.now();	p( nowDateTime );
		LocalDateTime settingDateTime = LocalDateTime.of( 2020, Month.JANUARY, 20, 11, 15, 10, 0 );	p( settingDateTime );
		System.out.println( nowDateTime.isBefore( settingDateTime ) );
		System.out.println( "######################################" );
		
		/**
		 *  Period
		 *  - 기간을 다룬다.
		 *  - 'T' 를 기준으로 왼쪽은 날짜, 오른쪽은 시간을 나타낸다.
		 *  - 출력 양식이 숫자Y숫자M 이다.
		 * */
		Period during = Period.of( 1, 2, 3 );
		today = today.minus( during );	p( today );
		//now = now.minus( during );	// error : LocalTime 은 날짜 계산을 할 수 없다.
		nowDateTime = nowDateTime.minus( during );	p( nowDateTime );
		System.out.println( "######################################" );
		
		/**
		 *  DateTimeFormatter
		 *  - LocalDate 또는 LocalDateTime 에게만 적용된다.
		 *  - LocalTime 은 적용 제외
		 * */
		today = LocalDate.now();	
		p( today );
		DateTimeFormatter localDateFormatter = DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL );
		p( today.format( localDateFormatter ) );
		
		DateTimeFormatter patternFormatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd" );
		p( today.format( patternFormatter ) );
		patternFormatter = DateTimeFormatter.ofPattern( "dd 'in the format' yyyy" );
		p( today.format( patternFormatter ) );				
		
	}

}
