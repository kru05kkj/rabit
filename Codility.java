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
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            //System.out.print(d[l]);
            l++;
        }
        System.out.println("");
       // System.out.println(3/2);
        for (p = 0; p < (1 + l)/2; ++p) {
            int i;
            boolean ok = true;
            //System.out.println("p is " +p+", l is "+l +" :");
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

	public int missingInteger(int[] A) {
		// TODO Auto-generated method stub
		int alen = A.length;
		int min = 0;
		
		Arrays.sort(A);
		System.out.println("============================");
		System.out.println("alen : " +alen);
		System.out.println("alen : " +(1-(-1)));
		System.out.println("============================");
		
		min = A[0];
		for(int i=1; i < alen ; i++){
			System.out.println("A : min = " +A[i] +" - "+min +" = "+(long)(A[i]-min));
			if(Math.abs(A[i]-min)>1){
				System.out.println("return : " +(min+1));
				return min+1;
			}
			
			min = A[i];
		}
		

		return 0;
	}
}
