package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// jpanel is the "base class". GUI panel is the "derived" class.
public class GUIPanel extends JPanel{

    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    private Database db; // the zipcode database

    public GUIPanel() {
      this.zipcode = new JTextField("zipcode", 7);
      //
      this.add(this.zipcode);

      this.submit = new JButton("submit");
      this.add(submit);
      this.submit.addActionListener(new SubmitButtonListener());

      this.output = new JTextArea(5, 20);
      this.add(this.output);

      this.db = new Database(); // load the zipcodes
    }

    class SubmitButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses submit

            // get the zipcode out of the textfield

            String code = zipcode.getText();

            Zipcode zc = db.search(code);

            WeatherObservation wob = zc.getWeatherData();

            output.setText(wob.toString());

        }

    }

}
