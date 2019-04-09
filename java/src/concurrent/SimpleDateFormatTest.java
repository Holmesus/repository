package concurrent;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** SimpleDateFormat 线程安全问题 */
public class SimpleDateFormatTest {

	public static void main(String[] args) {

	}

	public static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<>() {

		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}

	};

	public static Date parse(String dateStr) throws ParseException {
		return threadLocal.get().parse(dateStr);
	}

	public static String format(Date date) {
		return threadLocal.get().format(date);
	}
}
