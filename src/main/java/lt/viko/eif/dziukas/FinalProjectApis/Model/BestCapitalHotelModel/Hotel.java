package lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel;

public class Hotel {
    private String name;
    private String link;
    private String rating;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

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
