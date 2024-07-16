package ch19.serverClient;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String thisTimeDotDate() {

		String result;

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		result = sdf.format(date.getTime());
		return result;
	}
}
