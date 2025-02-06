
/*
* File: SoulutionController.java
* Author: Markó Kevin
* Copyright: 2025, Markó Kevin
* Group: Szoft II-N
* Date: 2025-02-06
* Github: https://github.com/MKewin05/
* Licenc: MIT
*/

package green.weed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SolutionController {

    @FXML
    private TextField lenghtField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField resultField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        String l = lenghtField.getText();
        double lenght = Double.parseDouble(l);
        String r = radiusField.getText();
        double radius = Double.parseDouble(r);

        Double result = calcResult(radius, lenght);
        this.resultField.setText(result.toString());
    }

    public double calcResult(double radius, double length) {
        return 2 * Math.PI * radius * (radius + length);
    }
}
