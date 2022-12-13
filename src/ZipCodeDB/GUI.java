package ZipCodeDB;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("cs219 Weather App");
        frame.add(new GUIPanel());
        frame.setVisible(true);

        // when the user clicks the x on the title bar it will also stop running the program.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack(); // makes the j frame the size of the internal components

    }
}
