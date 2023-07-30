//Display Date and time in certain formats.

import java.util.Date;
import java.text.SimpleDateFormat;

class driver3
{
	public static void main(String args[])
	{
		Date D1 = new Date();
		SimpleDateFormat D = new SimpleDateFormat("dd/MM/yy");
		String ND1 = D.format(D1);
		System.out.println("Date: "+ND1);
	}
}

class driver4
{
	public static void main(String args[])
	{
		Date D1 = new Date();
		SimpleDateFormat D = new SimpleDateFormat("dd/MM/yy");
		SimpleDateFormat T = new SimpleDateFormat("hh:mm:ss a");

		String ND1 = D.format(D1);
		String NT1 = T.format(D1);
		System.out.println("Date: "+ND1+"\nTime: "+NT1);
	}
}
