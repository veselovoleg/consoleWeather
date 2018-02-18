import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class printWeather {





    //Получаем чистые значения наших переменных
    public static void  cleanInfOfMeteoData () throws IOException {

        //Спиок наименований полученных значений
        String [] columnNames = {"Температура ", "Ощущается, как ", "Атмосферное давление ",
                "Относительная влажность ", "Скорость ветра "};
        String [] finalMeteoData = new String [5];
        //Вытягиваем значения температуры и тд
        Pattern pattern = Pattern.compile("[-+]?[0-9][0-9]?[0-9]?[.]?[0-9]?");
        Matcher matcher = pattern.matcher(workWithPageElements.getInfFromPagePublic().toString());

        while (matcher.find()) {
            int i = 0;
            finalMeteoData [i] = matcher.group();
            //Выводим значения в консоль
            System.out.println(finalMeteoData [i]);
            i++;
        }
    }

}
