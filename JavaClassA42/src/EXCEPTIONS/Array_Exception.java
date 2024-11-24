package EXCEPTIONS;

public class Array_Exception {

	public static void main(String[] args) {
		int a[]= {1,2,5,7,8};
		
			try {
				for(int i=0;i<=a.length;i++) {
				System.out.println(a[i]);
			}
				}
			catch(ArrayIndexOutOfBoundsException A) {
				System.out.println("Exception handl....");
				
			}
			}
		}

	


