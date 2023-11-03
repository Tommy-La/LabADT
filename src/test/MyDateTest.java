/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dateADT.MyDate;

/**
 * 
 */
class MyDateTest {

	private MyDate date1;
    private MyDate date2;
    
	@BeforeEach
	void setUp() throws Exception {
		
		date1 = new MyDate();
	    date2 = new MyDate();
		
	}

	/**
	 * Test method for {@link dateADT.MyDate#compareTo(dateADT.DateADT)}.
	 */
	@Test
	void testCompareTo() {
		date1.setDate(2023, 11, 1);
        date2.setDate(2023, 11, 2);

        assertTrue(date1.compareTo(date2) < 0);
        assertTrue(date2.compareTo(date1) > 0);
        assertEquals(0, date1.compareTo(date1));
	}

	/**
	 * Test method for {@link dateADT.MyDate#toISOFormat()}.
	 */
	@Test
	void testToISOFormat() {
		date1.setDate(2023, 11, 1);
        assertEquals("2023-11-01", date1.toISOFormat());

        date2.setDate(2022, 5, 15);
        assertEquals("2022-05-15", date2.toISOFormat());
	}

	/**
	 * Test method for {@link dateADT.MyDate#advanceByDays(int)}.
	 */
	@Test
	void testAdvanceByDays() {
		date2.setDate(2023, 11, 3);
		date2.advanceByDays(2);
        assertEquals("2023-11-5", date2.toISOFormat());
	}

	/**
	 * Test method for {@link dateADT.MyDate#retreatByDays(int)}.
	 */
	@Test
	void testRetreatByDays() {
		date2.setDate(2023, 11, 3);
		date2.retreatByDays(2);
        assertEquals("2023-11-1", date2.toISOFormat());
	}

	/**
	 * Test method for {@link dateADT.MyDate#SetDate(int, int, int)}.
	 */
	@Test
	void testSetDate() {
		date1.setDate(2022, 7, 15);
	    
	    assertEquals(2022, date1.getYear());
	    assertEquals(7, date1.getMonth());
	    assertEquals(15, date1.getDay());
	}

}
