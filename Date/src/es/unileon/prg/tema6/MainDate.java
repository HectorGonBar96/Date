public class MainDate {

	public static void main(String[] args) {

		Date today;
		Date tomorrow;
		
		today = new Date(20,3,2016);
		tomorrow = new Date (22,3,2016);
		
		System.out.println(today.isSameYear(tomorrow));
		System.out.println(today.isSameMonth(tomorrow));
		System.out.println(today.isSameDay(tomorrow));
		System.out.println(today.isSame(tomorrow));
		System.out.println(today.getMonthName());
		System.out.println(today.checkDayOfMonth());
		System.out.println(today.getSeason());
		System.out.println(today.getMonthNameEndYear());

	}

}

