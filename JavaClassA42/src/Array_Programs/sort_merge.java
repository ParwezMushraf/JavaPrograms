package Array_Programs;

import java.util.Arrays;

public class sort_merge {

	public static void main(String[] args) {
		int a[]= {10,201};
		int b[]= {101,20,0,301};
		int c[]=new int [a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
				}else {
					c[i]=b[i-a.length];
				}
		}
		for(int i=0;i<c.length-1;i++) {
			for(int j=0;j<c.length-1;j++) {
				if(c[j]>c[j+1]) {
					int temp=c[j];
					c[j]=c[j+1];
							c[j+1]=temp;
				}
			}
		}
		for(int i:c) {
			System.out.println(i);
		}
	}}