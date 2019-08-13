import java.util.Date;

/**
 * A RestaurantBooking is a booking at a specific location
 * for a given number of persons.
 * 
 * @author  Guiovanny Cardenas Rosales 
 */
public  class RestaurantBooking extends LocationBooking {
     /**  Stores the number of persons for whom the booking is made ,must be  least 1 */
    private  int numberOfPersons ;

    /**
     * Constructs a new RestaurantBooking according to the parameters.
     *
     * @param name the name for which the booking was made; must not be null
     * @param date the point in time for which the booking was made; must not be null
     *  and must not be in the past
     * @param location the address of the restaurant; must not be null
     * @param numberOfPersons the number of persons for whom the booking is made; at least 1
     */
    public RestaurantBooking(String name, Date date, String location, int numberOfPersons ){
        super(name,date,location);

        if (numberOfPersons < 1   ) {
            throw new IllegalArgumentException("must be at least 0");
        }
        this.numberOfPersons = numberOfPersons ;
    }

    /**
     * @returns  the number of persons  for whom the  booking  has been made, must be at least 1;
     **/

    @Override
    public int  getNumberOfPersons(){
        return this.numberOfPersons;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocation: " + this.getLocation();
    }
}
