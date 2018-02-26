package GUI;
import Console.Printing;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Frame {
    static  String [] valuesForFrame = Printing.ClonedValuesOfMeteoData.clone();


    public static void createWeatherGUI() {

        JFrame frame = new JFrame("Погода в Москве");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(500, 400);
        frame.setPreferredSize(new Dimension(200, 200));
        frame.pack();
        frame.setVisible(true);
    }
}
