package turkpol.org.pl.bootcamp_turkpol.lessonafterages.model;

import java.util.List;

public class NationalityResponse {
    private int count;
    private String name;
    private List<Country> country;


    public NationalityResponse(int count, String name, List<Country> country) {
        this.count = count;
        this.name = name;
        this.country = country;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "NationalityResponse{" +
                "count=" + count +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
