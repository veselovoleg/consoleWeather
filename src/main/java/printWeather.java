import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class printWeather {

    //Получаем чистые значения наших переменных
    public static void  cleanInfOfMeteoData () throws IOException {

        //Спиок наименований полученных значений
        String[] columnNames = {"Температура ", "Ощущается, как ", "Атмосферное давление ",
                "Относительная влажность ", "Скорость ветра "};
        String[] finalMeteoData = new String[5];
        //Вытягиваем значения температуры и тд
        Pattern pattern = Pattern.compile("[-+]?[0-9][0-9]?[0-9]?[.]?[0-9]?");
        Matcher matcher = pattern.matcher(workWithPageElements.getInfFromPagePublic().toString());

        int i = 0;

        while (matcher.find()) {

            finalMeteoData[i] = matcher.group();
            //Выводим значения в консоль
            System.out.println(columnNames[i]+ finalMeteoData[i]); //Тут все выводится нормально - зачения температуры, владности и тд
            i++;
        }
      
    }
}
