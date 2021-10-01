package dataStructure;

import java.util.*;
public class EfficientJanitor {
	
	static int efficientJanitor(float[] f) {
		int n = f.length;
		Arrays.sort(f);
		
 
		float diff = f[n-1] - f[0]; // diff of max and min number in array
		int j = n-1 ;// second pointer
		int count = 0; // no of takes
		int i = 0;
		while(i <= j ) {
			System.out.println(i + " " + j);
			if( (f[j] > 3) || ((f[i]+f[j]) > 3)) {
				count++;
				j--;
				
			} else {
			
				i++;
				j--;
				count++;
			}	
		
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		float[] weight = new float[n];
		for(int i = 0; i < n; i++) {
			weight[i] = in.nextFloat();
		}
		System.out.println(efficientJanitor(weight));
	}

}
