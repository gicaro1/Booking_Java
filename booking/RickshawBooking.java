import java.util.Date;

/**
 * A RickshawBooking is a booking for travelling from a start point to a
 * destination point via a rickshaw taxi. In our setting, a rickshaw
 * always transports exactly one passenger.
 *
 * @author Guiovanny Cardenas Rosales 
 */
public   class RickshawBooking extends Booking {
    /** Stores  the  star  point , non-null */
    private String from;

    /** Stores  the  End   point , non-null */
    private String to ;

    /**
     * Constructs a RickshawBooking object according to the parameters.
     *
     * @param name the name for which the booking was made; must not be null
     * @param date the point in time for which the booking was made; must not be null
     *  and must not be in the past
     * @param from the start point of the rickshaw travel; must not be null
     * @param to the destination point of the rickshaw travel; must not be null
     */

    public RickshawBooking(String name, Date date, String from, String to) {
        super(name,date);
        if (from  == null) {
            throw new IllegalArgumentException("name must not be null!");
        }
        if (to == null) {
            throw new IllegalArgumentException("name must not be null!");
        }

        this.from = from ;
        this.to= to;
    }

    /**
     * @return star point  location location and must not be null.
     */
    public String getFrom(){
        return this.from;
    }

    /**
     * @return end  point  location location and must not be  null.
     */
    public String getTo(){
        return this.to;

    }

    /**
     * rickshaw  taxi always transports exactly one pessenger  
     */
    @Override
    public int   getNumberOfPersons(){

        return   1; 
    }

    @Override
    public String toString() {
        return super.toString() + "\nFrom: " + this.getFrom()
        + "\nTo: " + this.getTo();
    }
}



