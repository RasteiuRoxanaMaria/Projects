package rasteiu.roxana.lab9.ex5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static rasteiu.roxana.lab9.ex5.Traffic.*;

public class Action implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (Traffic.trains < 9) {
            if (display.getText() != null)
                display.setText(null);
            String stationN = Traffic.station.getText();
            String trainN = Traffic.train.getText();
            String destinatie = Traffic.destination.getText();
            int segmentId = Integer.parseInt(Traffic.segment.getText());
            if (trainN != null) {
                if (stationN != null) {
                    if (destinatie != null) {
                        if (Traffic.segment.getText() != null) {
                            t[trains] = new Train(Traffic.destination.getText(), Traffic.train.getText());
                            if (stationN.equals("Bucuresti") && segmentId >= 1 && segmentId < 4) {
                                Traffic.c1.arriveTrain(t[trains], segmentId);
                                c1.controlStep();
                            }
                            if (stationN.equals("Cluj-Napoca") && segmentId >= 4 && segmentId < 7) {
                                c2.arriveTrain(t[trains], segmentId);
                                c2.controlStep();
                            }
                            if (stationN.equals("Brasov") && segmentId >= 7 && segmentId < 10) {
                                c3.arriveTrain(t[trains], segmentId);
                                c3.controlStep();
                            }
                            destination.setText("");
                            segment.setText("");
                            station.setText("");
                            train.setText("");
                        } else display.append("You should write a segment in Segment section\n");
                    } else display.append("Write the destination\n");
                } else display.append("Write the train name\n");
            } else display.append("Station section isn't filled\n");
        } else display.append("Number of trains exceed\n");
        c1.displayStationState();
        c2.displayStationState();
        c3.displayStationState();
    }
}
