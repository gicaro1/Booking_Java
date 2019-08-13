import java.util.Date;

/**
 * A LocationBooking is a booking for a fixed location.
 *  Abstract subclass for our Booking hierarchy. location booking  provides a name,
 * a date (the point in time for which the booking was made), and location.
 * 
 * @author Guiovanny Cardenas Rosales 
 */
public  abstract class LocationBooking extends Booking {

    /** Stores  the name of the location, non-null */
    private    String location;

    

    /**
     * Constructs a new Location with a name,date, location .
     *
     * @param name the name for which the booking was made; must not be null
     * @param date the point in time for which the booking was made;
     * must not be null and must not be in the past
     * @ the location where the booking was made;
     *  
     */
    public LocationBooking(String name, Date date,String location ){
        super(name,date);
        if (location  == null) {
            throw new IllegalArgumentException("location must not be null!");
        }  

        this.location = location;

    }

     /**
     * Returns the number of persons for whom the booking has been made.
     * Concrete subclasses will need to provide a suitable implementation.
     *   EXTENDABILITY CODE FOR FUTURE RELEASE SOFTWARE  
     * @return the number of persons for which the booking has been made,
     *  greater than or equal to zero
     */
    public abstract int getNumberOfPersons();

    /**
     * @return the name of the location, non-null
     */
    public String getLocation(){
        return this.location;
    }

}