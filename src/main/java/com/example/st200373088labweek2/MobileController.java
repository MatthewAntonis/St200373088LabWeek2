package com.example.st200373088labweek2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MobileController {

    @FXML
    private Label phoneLabel;

    public void initialize() {
        StringBuilder displayText = new StringBuilder();

        // Valid
        try {
            Mobile phone1 = new Mobile("Apple", "iPhone 15", 128);
            displayText.append(phone1.toString()).append("\n");
        } catch (IllegalArgumentException e) {
            displayText.append("Error for iPhone 15: ").append(e.getMessage()).append("\n");
        }

        // Invalid
        try {
            Mobile phone2 = new Mobile("Apple", "iPhone 8", 0);  // This will trigger the exception
            displayText.append(phone2.toString()).append("\n");
        } catch (IllegalArgumentException e) {
            displayText.append("Error for iPhone 8: ").append(e.getMessage()).append("\n");
        }

        phoneLabel.setText(displayText.toString());
    }


}
