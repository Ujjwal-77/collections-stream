package regex.extract_dates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
		String regex ="\\b\\d{2}/\\d{2}/\\d{4}\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(date);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
