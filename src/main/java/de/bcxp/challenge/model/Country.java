package de.bcxp.challenge.model;

import com.opencsv.bean.CsvBindByName;

/**
 * Bean of the Country
 */
public class Country {

    @CsvBindByName(column = "Name")
    private String name;
    @CsvBindByName(column = "Capital")
    private String capital;
    @CsvBindByName(column = "Accession")
    private String year;
    @CsvBindByName(column = "Population")
    private String population;
    @CsvBindByName(column = "Area (km²)")
    private float area;
    @CsvBindByName(column = "GDP (US$ M)")
    private float gdp;
    @CsvBindByName(column = "HDI")
    private float hdi;
    @CsvBindByName(column = "MEPs")
    private int meps;

    public Country(String name, String capital, String year, String population, float area, float gdp, float hdi, int meps) {
        this.name = name;
        this.capital = capital;
        this.year = year;
        this.population = population;
        this.area = area;
        this.gdp = gdp;
        this.hdi = hdi;
        this.meps = meps;
    }

    public Country() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {

        this.population = population;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getGdp() {
        return gdp;
    }

    public void setGdp(float gdp) {
        this.gdp = gdp;
    }

    public float getHdi() {
        return hdi;
    }

    public void setHdi(float hdi) {
        this.hdi = hdi;
    }

    public int getMeps() {
        return meps;
    }

    public void setMeps(int meps) {
        this.meps = meps;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", year='" + year + '\'' +
                ", population='" + population + '\'' +
                ", area=" + area +
                ", gdp=" + gdp +
                ", hdi=" + hdi +
                ", meps=" + meps +
                '}';
    }
}
