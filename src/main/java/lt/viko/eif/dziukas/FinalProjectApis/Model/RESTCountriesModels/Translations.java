package lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Translations {
    @JsonProperty("de")
    private String german;
    @JsonProperty("es")
    private String spanish;
    @JsonProperty("fr")
    private String french;
    @JsonProperty("ja")
    private String japanese;
    @JsonProperty("it")
    private String italian;

    public Translations() {

    }

    public String getGerman() {
        return german;
    }

    public void setGerman(String german) {
        this.german = german;
    }

    public String getSpanish() {
        return spanish;
    }

    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

    public String getFrench() {
        return french;
    }

    public void setFrench(String french) {
        this.french = french;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    public String getItalian() {
        return italian;
    }

    public void setItalian(String italian) {
        this.italian = italian;
    }

    @Override
    public String toString() {
        return "Translations{" +
                "german='" + german + '\'' +
                ", spanish='" + spanish + '\'' +
                ", french='" + french + '\'' +
                ", japanese='" + japanese + '\'' +
                ", italian='" + italian + '\'' +
                '}';
    }
}
