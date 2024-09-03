package turkpol.org.pl.bootcamp_turkpol.lessonafterages.controller;

import com.google.gson.Gson;
import turkpol.org.pl.bootcamp_turkpol.lessonafterages.model.Country;
import turkpol.org.pl.bootcamp_turkpol.lessonafterages.model.NationalityResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class StudentController {

    public static void main(String[] args) {

        String uri = "http://localhost:8080/api/students";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();


        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {

                System.out.println(response.body());

                // create model class
                // find your name
                // send your name to the API - https://api.nationalize.io/?name=
                // and get the first country you are from.
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
