package Lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.*;

public class Weather {
    private static final String API_KEY = "VJoW5Sx0ENPNjvwh9t1HAPA9NfRZjFGK";
    private static final String HOST = "dataservice.accuweather.com";
    private static final String LOCATION_KEY = "474212_PC";
    private static final String FORECAST = "forecasts";
//    private static final String LANGUAGE = "ru-ru";
//    private static final String METRIC = "true";
//    private static final String DETAILS = "false";
    private static final String DAILY = "daily";
    private static final String DAYS = "5day";
    private static final String V = "v1";

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(V)
                .addPathSegment(DAILY)
                .addPathSegment(DAYS)
                .addPathSegment(LOCATION_KEY)
                .addQuertyParameter("apikey", API_KEY)
                .addQuertyParameter("Language", "ru-ru")
                .addQuertyParameter("metric", "true")
                .build();
        System.out.println(url.toString());
        Request request = new Request.Builder()
                .addHeader("accept", "appLication/Json")
                .url(url)
                .build();
        String JsR = client.newCall(request).execute().body().string();
        System.out.println(JsR);
    }
}
