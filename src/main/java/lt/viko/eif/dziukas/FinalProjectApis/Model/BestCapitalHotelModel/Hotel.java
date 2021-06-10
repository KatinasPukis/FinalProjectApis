package lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel;

/**
 * Represents Hotel object that is a piece of
 * CountryCovidHotelWeather main model
 * and it represents best cities founded hotel information
 * like name, the booking link, rating and price.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class Hotel {

    private String name;
    private String link;
    private String rating;
    private String price;

    /**
     * Gets the hotel name.
     *
     * @return the hotel name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the hotel name.
     *
     * @param name of the hotel.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the hotel booking link.
     *
     * @return hotels booking link.
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the hotels booking link.
     *
     * @param link of the hotels booking.
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Gets the hotel rating.
     *
     * @return hotels rating.
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the hotel rating.
     *
     * @param rating of the hotel.
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Gets the hotel price
     *
     * @return hotel price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the hotel price
     *
     * @param price of the hotel
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * To String method that formats hotel
     * object parameters for printing.
     *
     * @return the string with hotel information.
     */
    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", rating='" + rating + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
