package com.google.ex;

enum WeekDays
	{
MONDAY , TUESDAY , FRIDAY;

WeekDays()
{
	System.out.println(" Enum Constructor Invoked");
}
	}

public class EnumApp1
	{
public static void main(String args[])
{
	System.out.println(WeekDays.MONDAY);
	System.out.println(WeekDays.TUESDAY);
	System.out.println(WeekDays.FRIDAY);

	WeekDays[] days = WeekDays.values();
	System.out.println(" Days through values ::");
	for(int i= 0 ; i < days.length ; i++)
	{
	System.out.println(days[i]);
	}

}
	}


