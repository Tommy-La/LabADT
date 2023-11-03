package dateADT;

/**
 * The DateADT abstract class represents a date in various aspects and provides methods
 * for date manipulation and comparison.
 */
public abstract class DateADT {

	private int year;
	private int month;
	private int day;


    /**
     * Compares this date with another date.
     *
     * @param otherDate The date to compare with.
     * @return An integer less than 0 if this date is earlier than otherDate,
     *         0 if they are equal, and an integer greater than 0 if this date is later.
     */
    public abstract int compareTo(DateADT otherDate);

    /**
     * Returns the date in ISO format (YYYY-MM-DD).
     *
     * @return The date in ISO format as a string.
     */
    public abstract String toISOFormat();

    /**
     * Advances the date by a specified number of days.
     *
     * @param days The number of days to advance the date.
     */
    public abstract void advanceByDays(int days);

    /**
     * Retreats the date by a specified number of days.
     *
     * @param days The number of days to retreat the date.
     */
    public abstract void retreatByDays(int days);

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

    
}
