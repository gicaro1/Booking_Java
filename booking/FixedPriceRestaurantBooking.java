import java.util.Date;

/**
 * A FixedPriceRestaurantBooking is a RestaurantBooking where a special menu
 * for the evening with a fixed price per person is ordered in advance. Thus,
 * the total price for all persons together is also fixed.
 *
 * @author Guiovanny Cardenas Rosales 
 */
public  class FixedPriceRestaurantBooking extends RestaurantBooking implements HasFixedPrice {

    /** Stores  the price for each person  in pence */
    private int pricePerPersonInPence;

    /**
     * Constructs a new FixedPriceRestaurantBooking according to the parameters.
     *
     * @param name the name for which the booking was made; must not be null
     * @param date the point in time for which the booking was made; must not be null
     *  and must not be in the past
     * @param location the address of the restaurant; must not be null
     * @param numberOfPersons the number of persons for whom the booking is made; at least 1
     * @param pricePerPersonInPence the price per person in pence
     */
    
    public FixedPriceRestaurantBooking(String name, Date date, String location, int numberOfPersons, int pricePerPersonInPence) {
        super(name,date,location,numberOfPersons);
        this.pricePerPersonInPence = pricePerPersonInPence;
    }

    /**
     * @returns   fixed price in pence for this object;
     */
    public int getFixedPriceInPence(){
        return this.pricePerPersonInPence * this.getNumberOfPersons() ;  
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrice: " + this.getFormattedPrice();
    }

}
