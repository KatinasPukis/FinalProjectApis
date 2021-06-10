package lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels;

import java.util.List;

/**
 * Represents Country object that is a piece of
 * CountryCovidHotelWeather main model
 * and it represents detailed of the country like
 * calling codes, capital, region, population, timezones,
 * borders, languages and etc. information.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class Country {

    private String name;
    private List<String> topLevelDomain;
    private String alpha2Code;
    private String alpha3Code;
    private List<String> callingCodes;
    private String capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private String population;
    private List<Double> latlng;
    private String demonym;
    private Double area;
    private Double gini;
    private List<String> timezones;
    private List<String> borders;
    private String nativeName;
    private String numericCode;
    private List<String> currencies;
    private List<String> languages;
    private Translations translations;
    private String relevance;

    /**
     * Just an empty constructor.
     *
     */
    public Country() {

    }

    /**
     * Gets countries name.
     *
     * @return countries name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets countries name.
     *
     * @param name of the country.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets top level domain of the country.
     *
     * @return top level domain of the country.
     */
    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    /**
     * Sets top level domain of the country.
     *
     * @param topLevelDomain of the country.
     */
    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    /**
     * Gets alpha 2 code of the country.
     *
     * @return alpha 2 code of the country.
     */
    public String getAlpha2Code() {
        return alpha2Code;
    }

    /**
     * Sets alpha 2 code of the country.
     *
     * @param alpha2Code of the country.
     */
    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    /**
     * Gets alpha 3 code of the country.
     *
     * @return alpha 3 code of the country.
     */
    public String getAlpha3Code() {
        return alpha3Code;
    }

    /**
     * Sets alpha 3 code of the country.
     *
     * @param alpha3Code of the country.
     */
    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    /**
     * Gets calling codes of the country.
     *
     * @return calling codes of the country.
     */
    public List<String> getCallingCodes() {
        return callingCodes;
    }

    /**
     * Sets calling codes of the country.
     *
     * @param callingCodes of the country.
     */
    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    /**
     * Gets countries capital.
     *
     * @return countries capital.
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Sets countries capital.
     *
     * @param capital of the country.
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * Gets alt spellings of the country.
     *
     * @return alt spellings of the country.
     */
    public List<String> getAltSpellings() {
        return altSpellings;
    }

    /**
     * Sets alt spellings of the country.
     *
     * @param altSpellings of the country.
     */
    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    /**
     * Gets region of the country.
     *
     * @return region of the country.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets region of the country.
     *
     * @param region of the country.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets subregion of the country.
     *
     * @return subregion of the country.
     */
    public String getSubregion() {
        return subregion;
    }

    /**
     * Sets subregion of the country.
     *
     * @param subregion of the country.
     */
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    /**
     * Gets countries population.
     *
     * @return countries population.
     */
    public String getPopulation() {
        return population;
    }

    /**
     * Sets countries population.
     *
     * @param population of the country.
     */
    public void setPopulation(String population) {
        this.population = population;
    }

    /**
     * gets Latlng of the country.
     *
     * @return Latlng of the country.
     */
    public List<Double> getLatlng() {
        return latlng;
    }

    /**
     * Sets Latlng of the country.
     *
     * @param latlng of the country.
     */
    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    /**
     * Gets countries demonym
     *
     * @return countries demonym.
     */
    public String getDemonym() {
        return demonym;
    }

    /**
     * Sets countries demonym.
     *
     * @param demonym of the country.
     */
    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    /**
     * Gets countries area.
     *
     * @return area of the country.
     */
    public Double getArea() {
        return area;
    }

    /**
     * Sets countries area.
     *
     * @param area of the country.
     */
    public void setArea(Double area) {
        this.area = area;
    }

    /**
     * Gets countries gini.
     *
     * @return countries gini.
     */
    public Double getGini() {
        return gini;
    }

    /**
     * Sets countries gini.
     *
     * @param gini of the country.
     */
    public void setGini(Double gini) {
        this.gini = gini;
    }

    /**
     * Gets timezones of the country.
     *
     * @return countries timezones.
     */
    public List<String> getTimezones() {
        return timezones;
    }

    /**
     * Sets countries timezones.
     *
     * @param timezones of the country.
     */
    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    /**
     * Gets countries borders.
     *
     * @return countries borders.
     */
    public List<String> getBorders() {
        return borders;
    }

    /**
     * Sets countries borders.
     *
     * @param borders of the country.
     */
    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    /**
     * Gets native country name.
     *
     * @return native country name.
     */
    public String getNativeName() {
        return nativeName;
    }

    /**
     * Sets native country name.
     *
     * @param nativeName of the country.
     */
    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    /**
     * Gets numeric code of the country.
     *
     * @return numeric code of the country.
     */
    public String getNumericCode() {
        return numericCode;
    }

    /**
     * Sets numeric code of the country.
     *
     * @param numericCode of the country.
     */
    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    /**
     * Gets currencies of the country.
     *
     * @return currencies of the country.
     */
    public List<String> getCurrencies() {
        return currencies;
    }

    /**
     * Sets currencides of the country.
     *
     * @param currencies of the country.
     */
    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }

    /**
     * Gets spoken languages of the country.
     *
     * @return spoken languages of the country.
     */
    public List<String> getLanguages() {
        return languages;
    }

    /**
     * Sets spoken languages of the country.
     *
     * @param languages of the country.
     */
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    /**
     * Gets country name by 5 languages.
     *
     * @return country name by 5 languages.
     */
    public Translations getTranslations() {
        return translations;
    }

    /**
     * Sets country name by 5 languages.
     *
     * @param translations of the country name.
     */
    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    /**
     * Gets countries relevance.
     *
     * @return countries relevance.
     */
    public String getRelevance() {
        return relevance;
    }

    /**
     * Sets countries relevance.
     *
     * @param relevance of the country.
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    /**
     * To String method that formats country
     * object parameters for printing.
     *
     * @return the string with country information.
     */
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", topLevelDomain=" + topLevelDomain +
                ", alpha2Code='" + alpha2Code + '\'' +
                ", alpha3Code='" + alpha3Code + '\'' +
                ", callingCodes=" + callingCodes +
                ", capital='" + capital + '\'' +
                ", altSpellings=" + altSpellings +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", population='" + population + '\'' +
                ", latlng=" + latlng +
                ", demonym='" + demonym + '\'' +
                ", area=" + area +
                ", gini=" + gini +
                ", timezones=" + timezones +
                ", borders=" + borders +
                ", nativeName='" + nativeName + '\'' +
                ", numericCode='" + numericCode + '\'' +
                ", currencies=" + currencies +
                ", languages=" + languages +
                ", translations=" + translations +
                ", relevance='" + relevance + '\'' +
                '}';
    }
}
