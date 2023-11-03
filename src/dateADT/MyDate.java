package dateADT;

public class MyDate extends DateADT {


	@Override
	public int compareTo(DateADT otherDate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toISOFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void advanceByDays(int days) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retreatByDays(int days) {
		// TODO Auto-generated method stub

	}

	public void setDate(int y, int m, int d) {
		setYear(y);
		setMonth(y);
		setDay(d);
	}

}
