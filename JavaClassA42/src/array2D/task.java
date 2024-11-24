package array2D;

public class task {

	public static void main(String[] args) {
		double d[][]=new double[3][3];
		d[0][0]=10.10;
		d[0][1]=40.40;
		d[0][2]=d[0][0];
		d[1][0]='A';
		d[1][1]=120.120;
		d[1][2]=14.14;
		d[2][0]=18.18;
		d[2][1]=80.80;
		d[2][2]='b';
		System.out.println(d[0][2]);
		System.out.println(d[0][1]);
		System.out.println(d[0][2]);
		System.out.println(d[1][1]);
		System.out.println(d[1][2]);
		System.out.println(d[2][0]);
		System.out.println(d[2][1]);
		System.out.println(d[2][2]);

	}

}
