package sLList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Random;

public class sLList {
	
	
	
	
	
	public static void main(String[] argv)
	{
		int size=8;
		tod timearray[]=new tod[size];
	timearray[0]=new tod(0,0,0,"midnight");
	timearray[1]=new tod(12,0,0,"noon");
	timearray[2]=new tod(14,0,0,"lunch");
	timearray[3]=new tod(19,0,0,"supper");
	timearray[4]=new tod(23,0,0,"bed time");
	
	
		
		
		
		tod current = null;
		
		int i=0;
		
		
	
		while(timearray[i]!=null)
		{
			current=timearray[i];
			System.out.print(current.getHour());
			System.out.print(":");
			System.out.print(current.getMinute());
			System.out.print(":");
			System.out.print(current.getSecond());
			System.out.print(":");
			System.out.println(current.getDay());
			
			current=current.nextElement();
			i=i+1;
		}
		
		addBreakfast(timearray, size, current);
		addClasstime(timearray,size,current);
		endClasstime(timearray,size,current);
	}

		static void fill(tod timeArray[], tod current)
		{
			current=timeArray[0];
			
	
	
	}
		static void addBreakfast(tod timeArray[], int size, tod current)
		{
			int i=0;
			tod image;
			do
			{
				current=timeArray[i];
				System.out.print(current.getHour());
				System.out.print(":");
				System.out.print(current.getMinute());
				System.out.print(":");
				System.out.print(current.getSecond());
				System.out.print(":");
				System.out.println(current.getDay());
				
				current=current.nextElement();
				i=i+1;
				if(i==1)
				{
					timeArray[i+1]=timeArray[i];
					timeArray[i]=new tod(10,0,0,"breakfast");
					
				}
				if(i>1)
				{
					image=timeArray[i+1];
					timeArray[i+1]=timeArray[i];
					timeArray[i+1]=image;
				}
			}while(timeArray[i]!=null);
		}
		static void addClasstime(tod timeArray[], int size, tod current)
		{
			int i=0;
			tod image;
			do
			{
				current=timeArray[i];
				System.out.print(current.getHour());
				System.out.print(":");
				System.out.print(current.getMinute());
				System.out.print(":");
				System.out.print(current.getSecond());
				System.out.print(":");
				System.out.println(current.getDay());
				
				current=current.nextElement();
				i=i+1;
				if(i==1)
				{
					timeArray[i+1]=timeArray[i];
					timeArray[i]=new tod(8,0,0,"class starts");
					
				}
				if(i>1)
				{
					image=timeArray[i+1];
					timeArray[i+1]=timeArray[i];
					timeArray[i+1]=image;
				}
			}while(timeArray[i]!=null);
		}
	
		static void endClasstime(tod timeArray[], int size, tod current)
		{
			int i=0;
			tod image;
			do
			{
				current=timeArray[i];
				System.out.print(current.getHour());
				System.out.print(":");
				System.out.print(current.getMinute());
				System.out.print(":");
				System.out.print(current.getSecond());
				System.out.print(":");
				System.out.println(current.getDay());
				
				current=current.nextElement();
				i=i+1;
				if(i==1)
				{
					timeArray[i+1]=timeArray[i];
					timeArray[i]=new tod(9,30,0,"class ends");
					
				}
				if(i>1)
				{
					image=timeArray[i+1];
					timeArray[i+1]=timeArray[i];
					timeArray[i+1]=image;
				}
			}while(timeArray[i]!=null);
		}
}
