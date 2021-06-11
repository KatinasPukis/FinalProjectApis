package lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Country
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class CountryTest {

    /**
     * Test of getName method, of class Country.
     */
    @Test
    void getName() {
        Country instance = new Country();
        instance.setName("Latvia");
        String result = instance.getName();
        assertEquals("Latvia", result);
    }

    /**
     * Test of setName method, of class Country.
     */
    @Test
    void setName() {
        Country instance = new Country();
        instance.setName("Estonia");
        assertEquals("Estonia", instance.getName());
    }

    /**
     * Test of getTopLevelDomain method, of class Country.
     */
    @Test
    void getTopLevelDomain() {
        Country instance = new Country();
        List<String> expResult = null;
        List<String> result = instance.getTopLevelDomain();
        assertEquals(null, result);
    }

    /**
     * Test of setTopLevelDomain method, of class Country.
     */
    @Test
    void setTopLevelDomain() {
        List<String> topLevelDomain = null;
        Country instance = new Country();
        instance.setTopLevelDomain(topLevelDomain);
    }

    /**
     * Test of getAlpha2Code method, of class Country.
     */
    @Test
    void getAlpha2Code() {
        Country instance = new Country();
        instance.setAlpha2Code("LV");
        String result = instance.getAlpha2Code();
        assertEquals("LV", result);
    }

    /**
     * Test of setAlpha2Code method, of class Country.
     */
    @Test
    void setAlpha2Code() {
        Country instance = new Country();
        instance.setAlpha2Code("LV");
        assertEquals("LV", instance.getAlpha2Code());
    }

    /**
     * Test of getAlpha3Code method, of class Country.
     */
    @Test
    void getAlpha3Code() {
        Country instance = new Country();
        instance.setAlpha3Code("LVA");
        String result = instance.getAlpha3Code();
        assertEquals("LVA", result);
    }

    /**
     * Test of setAlpha3Code method, of class Country.
     */
    @Test
    void setAlpha3Code() {
        Country instance = new Country();
        instance.setAlpha3Code("LVA");
        assertEquals("LVA", instance.getAlpha3Code());
    }

    /**
     * Test of getCallingCodes method, of class Country.
     */
    @Test
    void getCallingCodes() {
        Country instance = new Country();
        List<String> expResult = null;
        List<String> result = instance.getCallingCodes();
        assertEquals(null, result);
    }

    /**
     * Test of setCallingCodes method, of class Country.
     */
    @Test
    void setCallingCodes() {
        List<String> callingCodes = null;
        Country instance = new Country();
        instance.setTopLevelDomain(callingCodes);
    }

    /**
     * Test of getCapital method, of class Country.
     */
    @Test
    void getCapital() {
        Country instance = new Country();
        instance.setCapital("Riga");
        String result = instance.getCapital();
        assertEquals("Riga", result);
    }

    /**
     * Test of setAlpha2Code method, of class Country.
     */
    @Test
    void setCapital() {
        Country instance = new Country();
        instance.setCapital("Tallin");
        assertEquals("Tallin", instance.getCapital());
    }

    /**
     * Test of getAltSpellings method, of class Country.
     */
    @Test
    void getAltSpellings() {
        Country instance = new Country();
        List<String> expResult = null;
        List<String> result = instance.getAltSpellings();
        assertEquals(null, result);
    }

    /**
     * Test of setAltSpellings method, of class Country.
     */
    @Test
    void setAltSpellings() {
        List<String> altSpellings = null;
        Country instance = new Country();
        instance.setTopLevelDomain(altSpellings);
    }

    /**
     * Test of getRegion method, of class Country.
     */
    @Test
    void getRegion() {
        Country instance = new Country();
        instance.setRegion("Europe");
        String result = instance.getRegion();
        assertEquals("Europe", result);
    }

    /**
     * Test of setRegion method, of class Country.
     */
    @Test
    void setRegion() {
        Country instance = new Country();
        instance.setRegion("Asia");
        assertEquals("Asia", instance.getRegion());
    }

    /**
     * Test of getSubregion method, of class Country.
     */
    @Test
    void getSubregion() {
        Country instance = new Country();
        instance.setSubregion("Northern Europe");
        String result = instance.getSubregion();
        assertEquals("Northern Europe", result);
    }

    /**
     * Test of setSubregion method, of class Country.
     */
    @Test
    void setSubregion() {
        Country instance = new Country();
        instance.setSubregion("Western Europe");
        assertEquals("Western Europe", instance.getSubregion());
    }

    /**
     * Test of getPopulation method, of class Country.
     */
    @Test
    void getPopulation() {
        Country instance = new Country();
        instance.setPopulation("1900001");
        String result = instance.getPopulation();
        assertEquals("1900001", result);
    }

    /**
     * Test of setPopulation method, of class Country.
     */
    @Test
    void setPopulation() {
        Country instance = new Country();
        instance.setPopulation("2500000");
        assertEquals("2500000", instance.getPopulation());
    }

    /**
     * Test of getLatlng method, of class Country.
     */
    @Test
    void getLatlng() {
        Country instance = new Country();
        List<Double> expResult = null;
        List<Double> result = instance.getLatlng();
        assertEquals(null, result);
    }

    /**
     * Test of setLatlng method, of class Country.
     */
    @Test
    void setLatlng() {
        List<String> Latlng = null;
        Country instance = new Country();
        instance.setTopLevelDomain(Latlng);
    }

    /**
     * Test of getDemonym method, of class Country.
     */
    @Test
    void getDemonym() {
        Country instance = new Country();
        instance.setDemonym("Estonian");
        String result = instance.getDemonym();
        assertEquals("Estonian", result);
    }

    /**
     * Test of setDemonym method, of class Country.
     */
    @Test
    void setDemonym() {
        Country instance = new Country();
        instance.setDemonym("Latvian");
        assertEquals("Latvian", instance.getDemonym());
    }

    /**
     * Test of getArea method, of class Country.
     */
    @Test
    void getArea() {
        Country instance = new Country();
        instance.setArea(64559.0);
        Double result = instance.getArea();
        assertEquals(64559.0, result);
    }

    /**
     * Test of setArea method, of class Country.
     */
    @Test
    void setArea() {
        Country instance = new Country();
        instance.setArea(66530.0);
        assertEquals(66530, instance.getArea());
    }

    /**
     * Test of getGini method, of class Country.
     */
    @Test
    void getGini() {
        Country instance = new Country();
        instance.setGini(32.0);
        Double result = instance.getGini();
        assertEquals(32.0, result);
    }

    /**
     * Test of setGini method, of class Country.
     */
    @Test
    void setGini() {
        Country instance = new Country();
        instance.setGini(29.0);
        assertEquals(29.0, instance.getGini());
    }

    /**
     * Test of getTimezones method, of class Country.
     */
    @Test
    void getTimezones() {
        Country instance = new Country();
        List<String> expResult = null;
        List<String> result = instance.getTimezones();
        assertEquals(null, result);
    }

    /**
     * Test of setTimezones method, of class Country.
     */
    @Test
    void setTimezones() {
        List<String> timezones = null;
        Country instance = new Country();
        instance.setTopLevelDomain(timezones);
    }

    /**
     * Test of getBorders method, of class Country.
     */
    @Test
    void getBorders() {
        Country instance = new Country();
        List<String> expResult = null;
        List<String> result = instance.getBorders();
        assertEquals(null, result);
    }

    /**
     * Test of setBorders method, of class Country.
     */
    @Test
    void setBorders() {
        List<String> setBorders = null;
        Country instance = new Country();
        instance.setTopLevelDomain(setBorders);
    }

    /**
     * Test of getNativeName method, of class Country.
     */
    @Test
    void getNativeName() {
        Country instance = new Country();
        instance.setNativeName("Latvija");
        String result = instance.getNativeName();
        assertEquals("Latvija", result);
    }

    /**
     * Test of setNativeName method, of class Country.
     */
    @Test
    void setNativeName() {
        Country instance = new Country();
        instance.setNativeName("Latvija");
        assertEquals("Latvija", instance.getNativeName());
    }

    /**
     * Test of getNumericCode method, of class Country.
     */
    @Test
    void getNumericCode() {
        Country instance = new Country();
        instance.setNumericCode("232");
        String result = instance.getNumericCode();
        assertEquals("232", result);
    }

    /**
     * Test of setNumericCode method, of class Country.
     */
    @Test
    void setNumericCode() {
        Country instance = new Country();
        instance.setNumericCode("444");
        assertEquals("444", instance.getNumericCode());
    }

    /**
     * Test of getCurrencies method, of class Country.
     */
    @Test
    void getCurrencies() {
        Country instance = new Country();
        List<String> expResult = null;
        List<String> result = instance.getCurrencies();
        assertEquals(null, result);
    }

    /**
     * Test of setCurrencies method, of class Country.
     */
    @Test
    void setCurrencies() {
        List<String> currencies = null;
        Country instance = new Country();
        instance.setTopLevelDomain(currencies);
    }

    /**
     * Test of getLanguages method, of class Country.
     */
    @Test
    void getLanguages() {
        Country instance = new Country();
        List<String> expResult = null;
        List<String> result = instance.getLanguages();
        assertEquals(null, result);
    }

    /**
     * Test of setLanguages method, of class Country.
     */
    @Test
    void setLanguages() {
        List<String> languages = null;
        Country instance = new Country();
        instance.setTopLevelDomain(languages);
    }

    /**
     * Test of getTranslations method, of class Country.
     */
    @Test
    void getTranslations() {
        Country instance = new Country();
        Translations expResult = null;
        Translations result = instance.getTranslations();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTranslations method, of class Country.
     */
    @Test
    void setTranslations() {
        Translations translations = null;
        Country instance = new Country();
        instance.setTranslations(translations);
    }

    /**
     * Test of getRelevance method, of class Country.
     */
    @Test
    void getRelevance() {
        Country instance = new Country();
        instance.setRelevance("0");
        String result = instance.getRelevance();
        assertEquals("0", result);
    }

    /**
     * Test of setRelevance method, of class Country.
     */
    @Test
    void setRelevance() {
        Country instance = new Country();
        instance.setRelevance("1");
        assertEquals("1", instance.getRelevance());
    }

    /**
     * Test of testToString method, of class Country.
     */
    @Test
    void testToString() {
        Country instance = new Country();
        String result = instance.toString();
        assertTrue(result.contains("altSpellings="));
    }
}