package lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Translations
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
class TranslationsTest {

    /**
     * Test of getDe method, of class Translations.
     */
    @Test
    void getDe() {
        Translations instance = new Translations();
        instance.setDe("Lettland");
        String result = instance.getDe();
        assertEquals("Lettland", result);
    }

    /**
     * Test of setDe method, of class Translations.
     */
    @Test
    void setDe() {
        Translations instance = new Translations();
        instance.setDe("Lettland");
        assertEquals("Lettland", instance.getDe());
    }

    /**
     * Test of getEs method, of class Translations.
     */
    @Test
    void getEs() {
        Translations instance = new Translations();
        instance.setEs("Letonia");
        String result = instance.getEs();
        assertEquals("Letonia", result);
    }

    /**
     * Test of setEs method, of class Translations.
     */
    @Test
    void setEs() {
        Translations instance = new Translations();
        instance.setEs("Letonia");
        assertEquals("Letonia", instance.getEs());
    }

    /**
     * Test of getFr method, of class Translations.
     */
    @Test
    void getFr() {
        Translations instance = new Translations();
        instance.setFr("Lettonie");
        String result = instance.getFr();
        assertEquals("Lettonie", result);
    }

    /**
     * Test of setFr method, of class Translations.
     */
    @Test
    void setFr() {
        Translations instance = new Translations();
        instance.setFr("Lettonie");
        assertEquals("Lettonie", instance.getFr());
    }

    /**
     * Test of getJa method, of class Translations.
     */
    @Test
    void getJa() {
        Translations instance = new Translations();
        instance.setJa("ラトビア");
        String result = instance.getJa();
        assertEquals("ラトビア", result);
    }

    /**
     * Test of setJa method, of class Translations.
     */
    @Test
    void setJa() {
        Translations instance = new Translations();
        instance.setJa("ラトビア");
        assertEquals("ラトビア", instance.getJa());
    }

    /**
     * Test of getIt method, of class Translations.
     */
    @Test
    void getIt() {
        Translations instance = new Translations();
        instance.setIt("Lettonia");
        String result = instance.getIt();
        assertEquals("Lettonia", result);
    }

    /**
     * Test of setIt method, of class Translations.
     */
    @Test
    void setIt() {
        Translations instance = new Translations();
        instance.setIt("Lettonia");
        assertEquals("Lettonia", instance.getIt());
    }

    /**
     * Test of ToString method, of class Translations.
     */
    @Test
    void testToString() {
        Country instance = new Country();
        String result = instance.toString();
        assertTrue(result.contains("de='"));
    }
}