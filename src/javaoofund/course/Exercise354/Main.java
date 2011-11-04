package javaoofund.course.Exercise354;
/**
 * Knowledgeblackbelt
 * Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */
public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Horse a = new Horse("Blacky", 70, 35, false);
		a.everyHour();
		Horse b = new Horse("Sultan", 30, 1, true);
		b.everyHour();
		
		Horse c = new Horse("Georges", 50, 51, true);

	}

}
