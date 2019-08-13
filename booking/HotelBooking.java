import java.util.Date;

/**
 * A HotelBooking is a LocationBooking with a fixed total price, a number of
 * booked single rooms, and a number of booked double rooms.
 *
 * @author  Guiovanny Cardenas Rosales 
 */
public  class HotelBooking extends LocationBooking implements HasFixedPrice {
    /**  Stores the total amount of  */
    private int  totalPriceInPence;

    /** Stores the number of  booked Single  rooms and must be at least 0 */
    private int  singleRooms;

    /**  Storesthe number of  booked Double  rooms and must be at least 0  */
    private int  doubleRooms;

    /**
     * Constructs a new HotelBooking according to the parameters.
     * Note that at least one room must be booked.
     *
     * @param name the name for which the booking was made; must not be null
     * @param date the point in time for which the booking was made; must not be null
     *  and must not be in the past
     * @param location the address of the hotel; must not be null
     * @param totalPriceInPence the total price in pence for the booking
     * @param singleRooms the number of single rooms, must be at least 0
     * @param doubleRooms the number of double rooms, must be at least 0 
     */
    public HotelBooking(String name, Date date, String location, int totalPriceInPence, int singleRooms, int doubleRooms) {

        super(name,date,location);

        if (singleRooms < 0  ) {
            throw new IllegalArgumentException("must be at least 0" + " found " + singleRooms);
        }
        if (doubleRooms < 0  ) {
            throw new IllegalArgumentException("must be at least 0");
        }
        if(singleRooms==0 && doubleRooms==0){
            throw new IllegalArgumentException(" one room must be booked ");
        }
        this.totalPriceInPence = totalPriceInPence ;
        this.singleRooms = singleRooms;
        this.doubleRooms = doubleRooms;

    }

    /**
     * @return  the number of  booked Single rooms and must be at least 0.
     */
    public int getSingleRooms (){
        return this.singleRooms;
    }

    /**
     * @return  the number of  booked Double  rooms and must be at least 0.
     */
    public int getDoubleRooms(){

        return this.doubleRooms;
    }

    @Override
    public  int getNumberOfPersons(){

        return  this.singleRooms + 2 * this.doubleRooms ;
    }

    /**
     * @returns the total price in pence for this booking  ;
     */
    public int getFixedPriceInPence(){
        return this.totalPriceInPence;  
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocation: " + this.getLocation()
        + "\nPrice: " + this.getFormattedPrice()
        + "\nSingle rooms: " + this.getSingleRooms()
        + "\nDouble rooms: " + this.getDoubleRooms();
    }

}
