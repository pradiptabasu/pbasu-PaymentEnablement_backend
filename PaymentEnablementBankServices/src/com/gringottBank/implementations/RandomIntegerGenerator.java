package com.gringottBank.implementations;

import java.util.Random;

public class RandomIntegerGenerator 
{
	public int getRandomNumberInRange(int min, int max, int seed) 
	{

		if (min >= max) 
		{
			min = min + max;
			max = min - max;
			min = min - max;
		}

		Random r = new Random();
		r.setSeed(seed);
		return r.nextInt((max - min) + 1) + min;
	}
}
