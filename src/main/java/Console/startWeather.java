package Console;

import GUI.weatherFrame;

import java.io.IOException;

public class startWeather {
    public static void main(String[] args) throws IOException{
        printWeather.cleanInfOfMeteoData();
        weatherFrame.createWeatherGUI();
    }


}
