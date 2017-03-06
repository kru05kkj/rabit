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
        int result =-1;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            System.out.print(d[l]);
            l++;
        }

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

}
