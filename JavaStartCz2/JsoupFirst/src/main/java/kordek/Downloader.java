package kordek;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Downloader {
    public static void main(String[] args) throws IOException {

//        URL url = new URL("https://www.wykop.pl/");
//        InputStream inputStream = url.openStream();
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        String line = null;
//        while ((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//        }
//        bufferedReader.close();

        Document document = Jsoup.connect("https://www.wykop.pl/").get();
        Elements h2element = document.select("h2");
        for (Element element : h2element) {
            System.out.println(element.text() + " :::" + element.select("a").first().attr("href"));
        }
    }
}
