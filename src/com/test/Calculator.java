package com.test;

public class Calculator {
	int addition(int num1, int num2)
	{
		int input = num1 + num2;
		return input;
	}
	
	boolean multiply(int num3, int num4)
	{
		int input1 = num3 * num4;
		if(input1 % 2 == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	double average(int arr[])
	{
		double avg=0.0;
		int sum =0;
		for(int i=0; i<=5; i++)
		{
			sum = sum + arr[i];
			avg = sum /5;
		}
		
		return avg;
	}
		

}
