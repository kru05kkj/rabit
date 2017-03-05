package com.algorithm.tryhelloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
public class Example {
	public String getMinMaxString(String sNumbers) {
		// TODO Auto-generated method stub
		String[] sNumberArray;
		String sReturn="";
		int[] iNumbers;
		int iMin =0;
		int iMax =0;
		
		sNumberArray = sNumbers.split(" ");
		iNumbers = new int[sNumberArray.length];
		
		for(int i =0 ; i < sNumberArray.length; i++){
			iNumbers[i] = Integer.valueOf(sNumberArray[i]);
			if (i == 0 ){
				iMin = iNumbers[i];
				iMax = iNumbers[i];
			}
			
			//System.out.println("0 is " + iNumbers[i]);
			if (iNumbers[i] > iMax) {
				iMax = iNumbers[i];
			} else if ( iNumbers[i] < iMin ){
				iMin = iNumbers[i];
			}
		}
		sReturn = String.valueOf(iMin) + " " + String.valueOf(iMax);
		//System.out.println(sReturn);
		
		return sReturn;
	}

	public String evenOrOdd(int i) {
		// TODO Auto-generated method stub
		String sReturn = "";
		if (i%2 == 1 ){
			sReturn = "Odd";
		} else {
			sReturn = "Even";
		}
		return sReturn;
	}

	public int getStrToInt(String str) {
		// TODO Auto-generated method stub
		return Integer.valueOf(str);
	}

	public String waterMelon(int iCount) {
		// TODO Auto-generated method stub
		char[] cPattern = {'수', '박'};
		String sReturn ="";
		for(int i =0; i < iCount; i++ ){
			sReturn+=cPattern[i%2];
		}
		return sReturn;
	}

	public Object findKimTest(String[] seoul) {
		// TODO Auto-generated method stub
		int iReturn =0;
		
		while(iReturn<seoul.length){
			
			if(seoul[iReturn]=="Kim") break;
			iReturn++;
		}
		return "김서방은 "+iReturn+"에 있다";
	}

	public String printTriangle(int num) {
		// TODO Auto-generated method stub
		String sReturn ="";
		for( int i =0; i < num; i++){
			for(int j = 0; j < i+1; j++){
				sReturn+="*";
			}
			sReturn+="\n";
		}
		//System.out.println(sReturn);
		return sReturn;
	}

	public String reverseStr(String str){
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
	
		return new StringBuilder(new String(chars)).reverse().toString();
	}

	public int[] divisible(int[] array, int divisor) {
		// TODO Auto-generated method stub
		List<Integer> iList= new ArrayList<Integer>();
		
		for(int i =0; i < array.length; i++){
			if(array[i]%divisor==0){
				iList.add(array[i]);
			}
		}
		return listToArray(iList);
	}
	
	private int[] listToArray(List<Integer> list){
		int[] array = new int[list.size()];
		for(int i=0; i< list.size(); i++){
			array[i]= list.get(i).intValue();
		}
		return array;
	}

	public String getMiddle(String str) {
		// TODO Auto-generated method stub
		char[] chars = str.toCharArray();
		int length = chars.length;
		String sReturn ="";
		
		if(length%2==0 ){
			sReturn = sReturn+chars[(length/2)-1]+chars[length/2];
		} else {
			
			sReturn = sReturn+chars[(int)(length/2)];
		}
		
		return sReturn;
	}

	public int[] gcdlcm(int i, int j) {
		// TODO Auto-generated method stub
		int[] iArray = new int[2];
		if(i==j) {
			iArray[0] = i;
			iArray[1] = i;
		} else {
			iArray[0]= gcd(i,j);
			iArray[1]= i*j/iArray[0];
		}
		return iArray;
	}
	
	private int gcd(int i, int j) {
		// TODO Auto-generated method stub
		int temp =0;
		if(i>j) {
			temp = i;
			i =j;
			j= temp;
		}
		
		while(i>0){
			temp = i;
			i = j%i;
			j = temp;
		}
		return j;
	}

	public long fibonacci(int num) {
		// TODO Auto-generated method stub
		long answer = 0;
		List<Long> array = new ArrayList<Long>();
		array.add(0L);
		array.add(1L);
		
		for(int i =2; i<=num;i++){
			array.add(array.get(i-2)+array.get(i-1));
			//System.out.println("["+i+"] elements is "+array.get(i-1));
		}
		
		//System.out.println("elements are "+array.toString());
		answer = array.get(num);
		return answer;
	}
    public long fibonacciRec(int num) {
        
        long answer = 0;
        if(num == 0) return 0;
        else if(num == 1) return 1;
        
        answer = fibonacci(num-1) + fibonacci(num-2);
        return answer;
    }

	public int getMinSum(int[] param1, int[] param2) {
		// TODO Auto-generated method stub
		int answer =0;
		int len = param1.length;
		
		Arrays.sort(param1);
		Arrays.sort(param2);
		

		for(int i=0;i<len;i++){
			answer = answer + param1[i] * param2[len-i-1];
		}
		
		return answer;
	}

	public int jumpCase(int num) {
		// TODO Auto-generated method stub
		
		if ( num<=2 ){
			return num;
		} else {
			return jumpCase(num-1)+jumpCase(num-2);
		}	
	}

	public int numberOfPrime(int num) {
		int[] array = new int[num+1];
		int result =0;
		// TODO Auto-generated method stub
		
		for(int i=0;i<=num;i++){
			array[i]= i;
		}
		
		for(int i =2 ; i <=num; i++){
			if(array[i]!=0){
				for(int j= i+i; j<=num; j+=i){
					array[j]=0;
				}
				result++;
			}
		}
		
		return result;
	}

	public int getCoreNumber(int num, int[] core) {
		// TODO Auto-generated method stub
		int coreCount = core.length;
		int coreNumber =0;
		int[] param = new int[core.length];
		
		for(int i = 0;i < num;i++){
			for(int j =0; j < coreCount; j++){
				if( param[j] > 0){
					i++;
					core[j]--;
					coreNumber = j;
				}
			}			
		}
		return coreNumber;
	}


}
