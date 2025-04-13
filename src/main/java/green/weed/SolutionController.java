/*
* File: SoulutionController.java
* Author: Markó Kevin
* Copyright: 2025, Markó Kevin
* Group: Szoft II-N
* Date: 2025-04-13
* Github: https://github.com/MKewin05/
* Licenc: MIT
*/

package green.weed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class SolutionController {

    @FXML
    private TextField lenghtField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField resultField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        try {
            String l = lenghtField.getText();
            double lenght = Double.parseDouble(l);
            String r = radiusField.getText();
            double radius = Double.parseDouble(r);

            Double result = calcResult(radius, lenght);
            this.resultField.setText(result.toString());

            // Eredmény fájlba írása
            writeResultToFile(radius, lenght, result);
        } catch (NumberFormatException e) {
            resultField.setText("Hibás bemenet!");
        } catch (IOException e) {
            resultField.setText("Fájl írási hiba!");
        }
    }

    public double calcResult(double radius, double length) {
        return 2 * Math.PI * radius * (radius + length);
    }

    private void writeResultToFile(double radius, double length, double result) throws IOException {
        String output = String.format("Sugár: %.2f cm, Hossz: %.2f cm, Eredmény: %.2f cm2%n", radius, length, result);
        Path filePath = Path.of("results.txt");
        Files.writeString(filePath, output, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}