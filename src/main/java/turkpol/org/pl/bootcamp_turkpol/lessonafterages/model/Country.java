package turkpol.org.pl.bootcamp_turkpol.lessonafterages.model;

import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("country_id")
    private String countryId;
    private double probability;

    public Country(String countryId, double probability) {
        this.countryId = countryId;
        this.probability = probability;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId='" + countryId + '\'' +
                ", probability=" + probability +
                '}';
    }
}
