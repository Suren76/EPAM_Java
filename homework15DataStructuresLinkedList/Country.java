package homework15DataStructuresLinkedList;

import java.util.Objects;

public class Country {
    private String name;
    private String anthem;
    private String emblem;
    private String flag;
    private int population;
    private int area;

    public Country(String name, String anthem, String emblem, String flag, int population, int area) {
        this.name = name;
        this.anthem = anthem;
        this.emblem = emblem;
        this.flag = flag;
        this.population = population;
        this.area = area;
    }

    public Country(Country country) {
        this(
                country.name,
                country.anthem,
                country.emblem,
                country.flag,
                country.population,
                country.area
        );
    }

    public String getAnthem() {
        return anthem;
    }

    public void setAnthem(String anthem) {
        this.anthem = anthem;
    }

    public String getEmblem() {
        return emblem;
    }

    public void setEmblem(String emblem) {
        this.emblem = emblem;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return getPopulation() == country.getPopulation() && getArea() == country.getArea() &&
                Objects.equals(getAnthem(), country.getAnthem()) &&
                Objects.equals(getEmblem(), country.getEmblem()) &&
                Objects.equals(getFlag(), country.getFlag());
    }

    @Override
    public String toString() {
        return "Country{" +
                "anthem='" + anthem + '\'' +
                ", emblem='" + emblem + '\'' +
                ", flag='" + flag + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
