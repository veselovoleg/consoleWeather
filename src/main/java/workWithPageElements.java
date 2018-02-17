import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class workWithPageElements {
    private static String url = "http://www.realmeteo.ru/moscow/1/current";

    //Метод, парсящий страницу с погодой
    private  static Document getPage() throws IOException {
        Document page = Jsoup.parse(new URL(url),3000);
        return page;
    }

    //Достаем с сайта нужную нам информацию
    private static Elements getInfFromPagePrivate () throws IOException {
        Document page = getPage();
        Element getInformation = page.select("table[id=realdata]").first();
        Elements getMeteoData = getInformation.select("td[class=meteodata],td[class=meteodata_small]");
        return getMeteoData;
    }

       public static void cleanInfOfMeteoData () throws IOException {
          Pattern pattern = Pattern.compile("[-+]?[0-9][0-9]?[0-9]?[.]?[0-9]?");
          Matcher matcher = pattern.matcher(getInfFromPagePrivate().toString());
          String [] columnNames = {"Температура ", "Ощущается, как ", "Атмосферное давление ", "Относительная влажность ", "Скорость ветра "};
          String [] finalMeteoData = new String [5];

          while (matcher.find()) {
              int i = 0;
              finalMeteoData [i] = matcher.group();
              System.out.println(finalMeteoData [i]);
              i++;
           }


        }
}
