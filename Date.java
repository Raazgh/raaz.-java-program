
/**
 * Gets the year, month and day as an int and gives us a daye of birth
 * @author raas and sam
 * @version 1.0
 */
public class Date {
    private final int year;
    private final int month;
    private final int day;
    /**
     * @param year  is the year of born
     * @param month is the month of born
     * @param day   is the day of born
     */
    public Date(final int year,
                final int month,
                final int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Givs us the year ,month and day of the birth in Yy-Mm-Dd format.
     * @return
     */

    public String getYyMmDd() {return "" + year + "-" + month + "-" + day;}

    /**
     * @return gets the year of the birth
     */
    public int getYear(){return year;}

    /**
     * @return gets the month of the birth
     */
    public int getMonth() {return month;}

    /**
     * @return gets the day of the birth
     */public int getDay() {return day;}
}

