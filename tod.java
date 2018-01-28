package sLList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.util.LinkedList;
import java.util.Random;
public class tod {

	private int h;
	private int m;
	private int s;
	private String d;
	private tod next=null;
	
	public tod(int h,int m, int s, String d) {
	
	this.h=h;
	this.m=m;
	this.s=s;
	this.d=d;
	}
	
	

	public tod nextElement()
{
	return next;
}
	public void NextElement(tod next)
	{
		this.next=next;		 
	}
	public int getHour()
{
	return h;
}
	public void setHour(int h)
	{
		this.h=h;
	}
	
	public int getMinute()
	{
		return m;
	}
		public void setMinute(int m)
		{
			this.m=m;
		}
		
		public int getSecond()
		{
			return s;
		}
			public void setSecond(int s)
			{
				this.s=s;
			}
			public String getDay()
			{
				return d;
			}
			public void setDay(String d)
			{
				this.d=d;
			}

}