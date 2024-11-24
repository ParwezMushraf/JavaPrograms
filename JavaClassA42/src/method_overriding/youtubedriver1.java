package method_overriding;

public class youtubedriver1 extends youtubedriver {
	
	public void watch() {
		super.watch();
		System.out.println("watching shorts");
		}

	public static void main(String[] args) {
		youtubedriver1 y=new youtubedriver1();
		y.watch();

	}

}
