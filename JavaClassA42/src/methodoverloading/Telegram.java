package methodoverloading;

public class Telegram {
	public String send()
	{
		String s1="no argument";
		return s1;
		
	}
	public long send(long number)
	{
		System.out.println("sending number"+num);
		return num;
	}
	public String send(String sms)
	{
		System.out.println("sending message"+sms);
		return sms;
	}

	public static void main(String []args)
	{
		Telegram t=new Telegram();
		String sms=t.send("hi");
		
		
	}
}
