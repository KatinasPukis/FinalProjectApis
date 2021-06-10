package lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents Translations object that is a piece of
 * Country main Countries model
 * and it represents country name in 5 different languages.
 *
 * @author Dainoras Ziukas, Valdemar Subotkovski, Dominykas Pleteras
 * @version 1.0
 * @since 1.0
 */
public class Translations {
    private String de;
    private String es;
    private String fr;
    private String ja;
    private String it;

    /**
     * Just an empty constructor.
     *
     */
    public Translations() {

    }

    /**
     * Gets country name in german.
     *
     * @return country name in german.
     */
    public String getDe() {
        return de;
    }

    /**
     * Sets country name in german.
     *
     * @param de language.
     */
    public void setDe(String de) {
        this.de = de;
    }

    /**
     * Gets country name in spanish.
     *
     * @return country name in spanish.
     */
    public String getEs() {
        return es;
    }

    /**
     * Sets country name in spanish.
     *
     * @param es language.
     */
    public void setEs(String es) {
        this.es = es;
    }

    /**
     * Gets country name in french.
     *
     * @return country name in french.
     */
    public String getFr() {
        return fr;
    }

    /**
     * Sets country name in french.
     *
     * @param fr language.
     */
    public void setFr(String fr) {
        this.fr = fr;
    }

    /**
     * Gets country name in japanese.
     *
     * @return country name in japanese.
     */
    public String getJa() {
        return ja;
    }

    /**
     * Sets country name in japanese.
     *
     * @param ja language.
     */
    public void setJa(String ja) {
        this.ja = ja;
    }

    /**
     * Gets country name in italian.
     *
     * @return country name in italian.
     */
    public String getIt() {
        return it;
    }

    /**
     * Sets country name in italian.
     *
     * @param it language.
     */
    public void setIt(String it) {
        this.it = it;
    }

    /**
     * To String method that formats translations
     * object parameters for printing.
     *
     * @return the string with translations information.
     */
    @Override
    public String toString() {
        return "Translations{" +
                "de='" + de + '\'' +
                ", es='" + es + '\'' +
                ", fr='" + fr + '\'' +
                ", ja='" + ja + '\'' +
                ", it='" + it + '\'' +
                '}';
    }
}
