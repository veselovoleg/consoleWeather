package GUI;
import Console.printWeather;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;


import static Console.printWeather.ClonedValuesOfMeteoData;

public class weatherFrame {
    static  String [] valuesForFrame = printWeather.ClonedValuesOfMeteoData.clone();


    public static void createWeatherGUI() {

        JFrame frame = new JFrame("Погода в Москве");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 400);
        frame.setPreferredSize(new Dimension(500, 200));
        frame.pack();
        frame.setVisible(true);
    }
}
