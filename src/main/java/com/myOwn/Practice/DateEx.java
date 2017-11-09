/**
 * 
 */
package com.myOwn.Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Mahesh Chouhan
 *
 */
public class DateEx {

	public static void main(String[] args){
		try {
		String dateInString = "Friday, Jun 7, 2013 12:10:56 PM";
		SimpleDateFormat format=new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");
		Date dateExact=format.parse(dateInString);
		
		System.out.println("Date "+dateExact);
		
		
		SimpleDateFormat format1=new SimpleDateFormat("dd:MM:yyyy HH:mm:ss");
		String dateString=format1.format(dateExact);
		System.out.println("String "+dateString);
		
		
		
		//After, before , equal
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd:MM:yyyy HH:mm:s");
		Date date1=sdf.parse("13:09:2015 10:34:45");
		Date date2=sdf.parse("13:10:2015 10:34:45");
		
		System.out.println("13:09:2015 10:34:45 after 13:10:2015 10:34:45 --> "+date1.after(date2));
		
		System.out.println("13:09:2015 10:34:45 before 13:10:2015 10:34:45 --> "+date1.before(date2));
		
		System.out.println("13:09:2015 10:34:45 equals 13:10:2015 10:34:45 --> "+date1.equals(date2));
				
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}