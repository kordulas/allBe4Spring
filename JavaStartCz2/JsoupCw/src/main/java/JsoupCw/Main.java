package JsoupCw;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.connect("http://example.com/").get();
        String h1 = document.select("h1").first().text();
        String p = document.select("p").first().text();
        String attr = document.select("a").first().attr("href");

        System.out.println(h1);
        System.out.println(p);
        System.out.println(attr);

    }
}
