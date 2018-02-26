package Console;

import GUI.Frame;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException{
        Printing.cleanInfOfMeteoData();
        Frame.createWeatherGUI();
    }


}
