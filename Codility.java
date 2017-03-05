package com.algorithm.tryhelloworld;

import java.util.Arrays;
import java.util.List;

public class Codility {

	/* large number, negative number, overflow, large sequence, performance */
	public int equilibriumIndex(int[] input) {
		// TODO Auto-generated method stub
		int result =-1;
		
		for (int i =0; i < input.length; i++){
			if (sumArray(0, i, input) == sumArray(i+1, input.length, input) ){
				result = i;
				break;
			}
		}
		return result;
	}

	private int sumArray(int i, int i2, int[] input) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int j=i; j<i2;j++){
			sum+=input[j];
		}
		//System.out.println("sum of "+i+ " and "+ i2+" is "+sum);
		return sum;
	}

	public int equilibriumIndexImp(int[] input) {
		// TODO Auto-generated method stub
		long sumLeft =0;
		long sumRight =0;
		
		for(int i=0;i<input.length;i++){
			sumRight+=input[i];
		}
		
		for(int i=0;i<input.length;i++){
			sumRight-=input[i];
			//System.out.println(i+" : "+sumLeft + " : " +sumRight);
			if(sumLeft==sumRight) return i;
			
			
			sumLeft+=input[i];

		}
		
		return -1;
	}

	public int largeNumberOfFamily(int N) {
		// TODO Auto-generated method stub
		char[] digits = (""+N).toCharArray();
		
		System.out.println("int N is " +N);
		Arrays.sort(digits);
		System.out.println("sorted N is " +digits.toString());

		return 0;
	}

}
