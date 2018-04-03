package com.orderProcessing.dao.test;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateParseDemo {

	public static void main(String[] args) {
		String dt1 = "31/03/2018";
		
		DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
		DateTime dt = formatter.parseDateTime(dt1);
		
		System.out.println(dt.toString());
		
		
	}
}
