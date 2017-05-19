package com.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExamples {

	public static void main(String[] args) {
		String text    =
		        "This is the text to be searched " +
		        "for occurrences of the http:// pattern.";

		String pattern = ".*http://.*";

		boolean matches = Pattern.matches(pattern, text);

		System.out.println("matches = " + matches);
		
		String textOne    =
		        "This is the text which is to be searched " +
		        "for occurrences of the word 'is'.";

		String patternString = "is";

		Pattern patternOne = Pattern.compile(patternString);
		Matcher matcher = patternOne.matcher(textOne);

		int count = 0;
		while(matcher.find()) {
		    count++;
		    System.out.println("found: " + count + " : "
		            + matcher.start() + " - " + matcher.end());
		}
	}
}
