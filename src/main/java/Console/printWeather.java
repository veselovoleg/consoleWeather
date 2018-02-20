package Console;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class printWeather {
    //Отсюда будем брать значения для окна
    public static String [] ClonedValuesOfMeteoData = new String[5];

    //Получаем чистые значения наших переменных
    public static void  cleanInfOfMeteoData () throws IOException {

        //Спиок наименований полученных значений
        String[] namesOfValues = {"Температура ", "Ощущается, как ", "Атмосферное давление ",
                "Относительная влажность ", "Скорость ветра "};
        String[] aboutValues = {"°C","°C"," мм.рт.ст.","%"," м/сек." };

        String[] valuesOfMeteoData = new String[5];
        //Вытягиваем значения температуры и тд
        Pattern pattern = Pattern.compile("[-+]?[0-9][0-9]?[0-9]?[.]?[0-9]?");
        Matcher matcher = pattern.matcher(workWithPageElements.getInfFromPagePublic().toString());

        int i = 0;

        while (matcher.find()) {

            valuesOfMeteoData[i] = matcher.group();
            ClonedValuesOfMeteoData = valuesOfMeteoData;
            //Выводим значения в консоль
            System.out.println(namesOfValues[i]+ valuesOfMeteoData[i]+aboutValues[i]);
            i++;
        }



    }
}
