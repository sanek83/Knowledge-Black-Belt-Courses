package javaoofund.course.Exercise354;

/**
 * Knowledgeblackbelt Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */
public class Horse {

	private final int MAX_WORK_HOUR_LAZY = 34;
	private final int MAX_WORK_HOUR_HW = 80;

	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int maxWorkingHourPerWeek;
	private int hoursWorked;
	@SuppressWarnings("unused")
	private boolean isLazy; // Lazy or hard-working

	public Horse(String name, int maxWorkingHourPerWeek, int hoursWorked,
			boolean isLazy) {
		super();

		if (isLazy && (maxWorkingHourPerWeek > 34))
			throw new RuntimeException(
					"Error: Lazy Horst can't work more then 34 hours per week. Value: "
							+ maxWorkingHourPerWeek);

		if (!isLazy && (maxWorkingHourPerWeek > 80))
			throw new RuntimeException(
					"Error: hard-working  Horst can't work more then 80 hours per week. Value: "
							+ maxWorkingHourPerWeek);

		if (hoursWorked > maxWorkingHourPerWeek) {
			throw new RuntimeException(
					"Error: Horst is overworked. maxWorkingHourPerWeek: "
							+ maxWorkingHourPerWeek + " < hoursWorked: "
							+ hoursWorked);
		}
		this.name = name;
		this.maxWorkingHourPerWeek = maxWorkingHourPerWeek;
		this.hoursWorked = hoursWorked;
		this.isLazy = isLazy;
	}

	/**
	 * 
	 * @return true: if the horse worked succesfull<br>
	 *         false: if the horse has no woking hours
	 */
	public boolean everyHour(){
		boolean r = false;
        if(hoursWorked <= maxWorkingHourPerWeek){
        	r = increaseWorkedHours();  
        	System.out.println("A horse " + name + " worked " + hoursWorked + " hours this week!");
        	
        }else {
        	System.out.println("Can't any more this week!");
        }
		return r;
    }

	private boolean increaseWorkedHours() {
		this.hoursWorked++;
		return true;
	}

	public void resetWorkedHours() {
		this.hoursWorked = 0;
	}
}
