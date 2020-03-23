package com.qa.main;

public class CureSimulator {

	public void whatAmIDoingToday(String day) {
		switch (day) {
		default:
			System.out.println("You need to listen to the Cure");
			break;
		case "Monday":
			System.out.println("I don't care if Monday's blue");
		case "Tuesday":
			System.out.println("Tuesday's grey");
		case "Wednesday":
			System.out.println("And Wednesday too");
		case "Thursday":
			System.out.println("Thursday I don't care about you");
		case "Friday":
			System.out.println("It's Friday I'm in love");
		case "Saturday":
			System.out.println("Saturday wait");
		case "Sunday":
			System.out.println("and Sunday always comes too late");
		}
	}
}
