package turkpol.org.pl.bootcamp_turkpol.lessonafterages.controller;

import com.google.gson.Gson;
import turkpol.org.pl.bootcamp_turkpol.lessonafterages.model.Country;
import turkpol.org.pl.bootcamp_turkpol.lessonafterages.model.NationalityResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CountryController {

    public static void main(String[] args) {
        String name = "Burak";

        String uri = "https://api.nationalize.io/?name=" + name;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();


        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {

                Gson gson = new Gson();
                NationalityResponse nationalityResponse= gson.fromJson(response.body(), NationalityResponse.class);


                for(Country country : nationalityResponse.getCountry()){
                    if (country.getCountryId().equals("TR")){

                        System.out.println(country.getCountryId());
                        System.out.println(country.getProbability());
                    }
                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
