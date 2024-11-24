package methodoverloading;

public class Whatsapp {
	public void send ()
	{
		System.out.println("no arguments");
	}
	public void send(long number)
	{
		System.out.println("sending number"+ number);
	}
	public void send(String sms) {
		System.out.println("sending sms"+sms);
	}
	public void send(double money)
	{
		System.out.println("sending money"+money);
	}

}
