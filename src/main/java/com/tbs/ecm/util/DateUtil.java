package com.tbs.ecm.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public class Format {
		public static final String MMM_DD_YYYY_HHMMSS = "MMM dd, yyyy hh:mm:ss";
	}

	private static DateFormat df = null;

	public static Date convertStringToDate(String date, String inputDateFormat) {
		try {
			return new SimpleDateFormat(inputDateFormat).parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String parseDate(Date date, String inputDateFormat) {
		try {
			df = new SimpleDateFormat(inputDateFormat);
			df.format(date);
			return df.format(date);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
