package Console;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class workWithPageElements {
    private static String url = "http://www.realmeteo.ru/moscow/1/current";


    //Метод, парсящий страницу с погодой
    private  static Document getPage() {
        Document page = null;
        try {
            page = Jsoup.parse(new URL(url),3000);
        } catch (IOException timeoutException) {
            //timeoutException.printStackTrace();
            System.out.println("В настоящее время сайт не доступен");
        }
        return page;

    }

    //Достаем с сайта нужную нам информацию
    private static Elements getInfFromPagePrivate ()  {
        Document page = getPage();
        Element getInformation = page.select("table[id=realdata]").first();
        Elements getMeteoData = getInformation.select("td[class=meteodata],td[class=meteodata_small]");
        if (page == null ||getMeteoData == null) System.out.println("Нет данных с сайта");
                return getMeteoData;
    }

    //Паблик метод, который будем передавать в другой класс
    public static Elements getInfFromPagePublic () throws IOException {
        return getInfFromPagePrivate();
    }


}
