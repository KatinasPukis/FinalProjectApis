package lt.viko.eif.dziukas.FinalProjectApis.Model;

import lt.viko.eif.dziukas.FinalProjectApis.APIs.COVID19;
import lt.viko.eif.dziukas.FinalProjectApis.Model.BestCapitalHotelModel.Hotel;
import lt.viko.eif.dziukas.FinalProjectApis.Model.COVID19Models.Root;
import lt.viko.eif.dziukas.FinalProjectApis.Model.RESTCountriesModels.Translations;

import java.util.List;
// NEBAIGTA GALIMA KEIST
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
    private Root covidStatistics;
    //private Hotel bestHotelInCountriesCapital; // MOKAMAS Api, axujenai nax XDD


}
