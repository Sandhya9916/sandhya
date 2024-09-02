package Gromming;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program1 {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	Date d=cal.getTime();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY hh-mm-ss");
	String dateStamp=sdf.format(d);
	String dateTimeStamp=sdf.format(d);
	System.out.println(dateTimeStamp);

	
}
}
