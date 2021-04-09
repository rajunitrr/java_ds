package com.raju.test;

import java.util.StringTokenizer;

public class SitecoreNudgeTest {

	private static void buildString(String s, int currentProgress, int target, int balance) {

		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			if (token.equals("#1")) {
				s = s.replace("#1", "" + currentProgress);
			} else if (token.equals("#2")) {
				s = s.replace("#2", "" + target);
			} else if (token.equals("#3")) {
				s = s.replace("#3", "" + balance);
			}

		}
		System.out.println("Build String output \n  " + s);
	}

	public static void main(String[] args) {
		String s = "Common Baby!! You have completed #1 out of #2 and remaining Balance is #3";
		int currentProgress = 25;
		int target = 100;
		int balance = 75;
		buildString(s, currentProgress, target, balance);
	}

}
