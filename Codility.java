package com.codility;

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
		
		//System.out.println("int N is " +N);
		Arrays.sort(digits);

		return Integer.parseInt(new StringBuilder(new String(digits)).reverse().toString());
	}

	public int distSameNumberOrg(int[] A) {
		// TODO Auto-generated method stub
		int N = A.length;
        int result = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (A[i] == A[j])
                    result = Math.max(result, Math.abs(i - j));
        return result;

	}

	public int distSameNumber(int[] A) {
		// TODO Auto-generated method stub
			int N = A.length;
			int[] B= new int[N+1];
			int result = 0;
			
			for(int i =0;i < N;i++){
				B[A[i]]=i;
			}
/*			
			for(int i=1; i<= N; i++){
				System.out.println("A "+(i-1)+" : " + A[i-1]);
				System.out.println("B "+i+" : " +B[i]);
			}*/
	        
	        for (int i = 0; i < N  ; i++){
	        	if(B[A[i]]>0)
	        	    result = Math.max(result, (B[A[i]] -i));
	        }
	        
	        return result;

	}

    int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            System.out.print(d[l]);
            l++;
        }
        System.out.println("");
        System.out.println(3/2);
        for (p = 1; p < 1 + l; ++p) {
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; ++i) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return -1;
    }

    int solutionFix(int n) {
        int[] d = new int[30];
        int len = 0;
        int p;
        while (n > 0) {
            d[len] = n % 2;
            n /= 2;
          System.out.print(d[len]);
            len++;
        }
        System.out.println(" len : "+len );
        for ( int i =len/2; i > 1; i--){
        	System.out.println("========="+i+"===========" );

        	for (int j=0; j<=(len-2*i);j++){
            	if(this.hasPattern(ArrayUtils.subarray(d, j+i, len),  ArrayUtils.subarray(d, j, (j+i)))) {
            		return i;
            	}
        	}
        	        	
        }

        return 1;
    }
    
    private void printIntArray(int[] a){
    	for(int i=0;i<a.length;i++) System.out.print(a[i]);
    	//System.out.println();
    }
    
    private boolean hasPattern(int[] target, int[] pattern) {
		// TODO Auto-generated method stub
    	int lenOfTarget = target.length;
    	int lenOfPattern = pattern.length;
    	//boolean isMatch = false;
    	
    	System.out.println("========= hasPattern ===========" );
    	printIntArray(pattern);System.out.print(" + " );printIntArray(target);System.out.println();
    	System.out.println("================================" );
    	
    	for(int i =0; i < lenOfTarget; i++ ){
    		for(int j=0; j < lenOfPattern && (lenOfTarget-i) >=lenOfPattern ;j++){
    			System.out.print("Target["+(i+j)+"]"+":Pattern["+j+"]="+"["+target[j+i]+"]"+"["+pattern[j]+"]");
    			if(target[i+j]==pattern[j]){
    				System.out.println("==> Match");
    				if (j== (lenOfPattern-1)) return true;
    			} else {
    				System.out.println("==> False");
    				break;
    			}
    		}
    	}
    	
		return false;
	}
    
    private boolean compareArray(int[] pattern, int[] compareA){
    	int pl=pattern.length;
    	int cl=compareA.length;
    	
    	if(pl > cl) return false;
    	
    	for(int i =0; i < cl-pl; i++){
    		if(Arrays.equals(pattern, Arrays.copyOfRange(compareA, i, pl))){
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    private int[][] getListOfPattern(int[] array){
    	
    	return null;
    }

	public String change124(int n) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int attatch =0;
			
		while( n >2 ){
			if(n==3) {sb.append(4); break;}
			
			attatch = n%3;
			
			sb.append(attatch);
			n /= 3;
		}
		if(n<=2) sb.append(n);
		
		return sb.reverse().toString();
	}

	public int frogJump(int X, int Y, int D) {
		// TODO Auto-generated method stub
        int count =0;
        
        while( X<Y){
          X+=D;  
          count++;
        }
        return count;
	}

	public int frogJump2(int X, int Y, int D) {
		// TODO Auto-generated method stub
        int count = (int)Math.ceil((Y-X)/(double)D);

        return count;
	}

	public int permMissingElem(int[] A) {
		// TODO Auto-generated method stub
		int alen = A.length;
		boolean[] compare = new boolean[alen+2];
		
		for(int i=0; i< alen; i++){
			compare[A[i]]=true;
		}
		
		for(int j=1; j<=alen+1; j++){
			if(compare[j]==false) return j;
		}
		return 0;
	}

	public int tapeEquilibrium(int[] A) {
		// TODO Auto-generated method stub
		int alen = A.length;
		int[] sum = new int[alen];
		int diff =0;
		
		sum[0]=A[0];
		
		for (int i=1; i< alen; i++){
			sum[i] = A[i]+sum[i-1];
		}
		
		diff = 2000;
		
		for(int j=0; j < alen-1; j++){

			diff = Math.min(diff, Math.abs(sum[alen-1]-sum[j]-sum[j]));
			if(diff==0) break;
		}
		
		return diff;
	}

	public int binarygap(int N) {
		// TODO Auto-generated method stub
		int[] A= new int[32];
		int i=0;
		int count=0;
		int maxCount=0;
		boolean isFirstOne =false;
		while(N>0){
			A[i]=N%2;
			N /=2;
			i++;
		}
		//System.out.println("============="+N+"===============");
		for(int j=0; i>j;j++){
			//System.out.print(A[j]);
			if(A[j]==1){
				maxCount = Math.max(maxCount, count);
				count=0;
				isFirstOne = true;
			} else if (isFirstOne){
				count++;
			}
		}
		//System.out.println("");
		
		return maxCount;
	}

	public int oddOccurrencesInArrayBug(int[] A) {
		// Runtime error. OutOfMemory
		int alen = A.length;
		boolean[] isUnpaired = new boolean[1000000000];
		
		for(int i=0; i < alen ;i++){
			
			if(!isUnpaired[A[i]]){
				isUnpaired[A[i]]=true;
			} else {
				isUnpaired[A[i]]=false;
			}
		}
		
		for(int j=0; j < 1000000000; j++ ){
			if(isUnpaired[j]) return j;
		}
		
		return 0;
	}
	
	public int oddOccurrencesInArrayPerf(int[] A) {
		// Performance fail
		//  medium2 => 9s/limit 3.28
		//  big2 => over 20s/limit 14.83
		// https://codility.com/demo/results/training3UZK4M-DU9/
		HashMap map = new HashMap();
		int alen = A.length;
		System.out.println("============================");

		for(int i=0; i < alen; i++) {
			System.out.println("A["+i+"] : "+A[i]);
			try {
				if(!(boolean)map.get(A[i])){
					map.put(A[i], true);
				} else {
					map.put(A[i], false);
				}
			} catch (Exception NullPointerException) {
				map.put(A[i], true);
			}
		}
		Set key = map.keySet();
		for (Iterator iterator = key.iterator(); iterator.hasNext();) {
            int keyName = (int) iterator.next();
            boolean valueName = (boolean) map.get(keyName);

            System.out.println(keyName+" = " +map.get(keyName));
            if(valueName) return keyName;
         }

		return 0;
	}
	
	public int oddOccurrencesInArrayPerf2(int[] A) {
		// // https://codility.com/demo/results/training3UZK4M-DU9/
		HashMap<Integer, Boolean> map = new HashMap();
		int alen = A.length;
		System.out.println("============================");

		for(int i=0; i < alen; i++) {
			System.out.println("A["+i+"] : "+A[i]);
			Boolean isPaired = map.get(A[i]);
			
			if(isPaired==null|| isPaired){
				map.put(A[i], false);
			} else {
				map.put(A[i], true);
			}

		}
		Set key = map.keySet();
		for (Iterator iterator = key.iterator(); iterator.hasNext();) {
            int keyName = (int) iterator.next();
            boolean valueName = (boolean) map.get(keyName);

            System.out.println(keyName+" = " +map.get(keyName));
            if(!valueName) return keyName;
         }

		return 0;
	}
	
	public int oddOccurrencesInArray(int[] A) {
		// https://codility.com/demo/results/trainingKH24HW-VH8/
		// 100% score
		
		int unpaired = 0;
		//System.out.println("============================");
		
		for (int i : A) {
			unpaired ^= i;
			//System.out.println("A["+i+"] :::" + unpaired);
		}
		return unpaired;
	}

	public int[] cyclicRotation(int[] A, int K) {
		// 87%  https://codility.com/demo/results/trainingHHWQXY-Z8K/
		// 100% https://codility.com/demo/results/trainingF4RCW9-PNW/
		// ArithmeticException in empty array case
		int alen = A.length;
		
		// For ArithmeticException in empty array case
		if(alen == 0||K==0 ) return A;
		
		int moving = K%alen;
		int[] B = new int[alen];
		
		//System.out.println("============================");
		//System.out.println("moving : " +moving);
		for(int i=0; i < alen; i++){
			B[(i+moving)%alen] = A[i];
		}
		
		return B;
	}


	/*
	 * O(N)
	 *  result https://codility.com/demo/results/trainingNX7M8C-XFN/
	 * https://codility.com/demo/results/trainingE5YCMK-JDW/
	 */
	public int missingInteger(int[] A) {
		// TODO Auto-generated method stub
		int alen = A.length;
		int[] positives = new int[100000];
		int missing =0;
		boolean isFirst = true;
		int countOfPositives =0;
				
		for(int i=0; i < alen ; i++){
			if(A[i] > 0 ) {
				positives[A[i]]++;
				countOfPositives++;
			}
		}
		
		for(int j=1 ; j < 100000; j++){
			if(positives[j]>0){
				if(isFirst) {
					isFirst =false;
				}
				
				countOfPositives-= positives[j];
				missing = j;
				
				if (!isFirst && countOfPositives==0) {
					return missing+1;
				}
			} else {
				if (!isFirst && countOfPositives>0) {
					return missing+1;
				}
			}

		}

		return 0;
	}
	//https://codility.com/demo/results/training2QRY9F-2QJ/
	public int distinct(int[] A) {
		// TODO Auto-generated method stub
		int result =0;
		int temp =-1000000;
		mergesort(A);
		
		
		for(int i = 0; i <A.length ; i++){
			if(temp!=A[i]){
				result++;
				temp=A[i];
			}
		}
		
		this.printIntArray(A);
		return result;
	}

	private int[] mergesort(int[] A) {
		// TODO Auto-generated method stub
		int alen = A.length;
		
		
		System.out.println("============== Sort =================");
		this.printIntArray(A);
		if(alen<=1) return A;
		
		//int[] first = ArrayUtils.subarray(A, 0, alen/2);
		//int[] second = ArrayUtils.subarray(A, alen/2, alen+1);
		int[] first =Arrays.copyOfRange(A, 0, alen/2);
		int[] second = Arrays.copyOfRange(A, alen/2, alen);
		System.out.println("++++++++++++++++++++++++++++++++++");
		this.printIntArray(first);
		this.printIntArray(second);
		
		mergesort(first);
		mergesort(second);
		merge(first, second, A);
		
		return A;
	}

	private void merge(int[] first, int[] second, int[] A) {
		// TODO Auto-generated method stub
        int firstLen = first.length;
        // Next element to consider in the second array
        int secondLen = second.length;
        int alen = A.length;
        
        // Next open position in the result
        int positionOfFirst = 0;
        int positionOfSecond = 0;
        int positionOfA=0;
        
		System.out.println("============== Merge =================");
		this.printIntArray(first);
		this.printIntArray(second);
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
		
        while (positionOfFirst < firstLen && positionOfSecond < secondLen) {
        	if(first[positionOfFirst] < second[positionOfSecond]) {
        		A[positionOfA]=first[positionOfFirst] ;
        		positionOfFirst++;
        	} else {
        		A[positionOfA]=second[positionOfSecond] ;
        		positionOfSecond++;
        	}
        	positionOfA++;
        }
        
        while(positionOfFirst < firstLen){
        	A[positionOfA]=first[positionOfFirst] ;
    		positionOfFirst++;
    		positionOfA++;
        }
        while(positionOfSecond < secondLen){
        	A[positionOfA]=second[positionOfSecond] ;
    		positionOfSecond++;
    		positionOfA++;
        }
        
        
        this.printIntArray(A);
	}
}
