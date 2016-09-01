package sample.controller;

import javafx.event.ActionEvent;

public class DialogController {

    public void ok(ActionEvent actionEvent) {
        Main.dialogStage.close();
    }

    public void cancel(ActionEvent actionEvent) {
        Main.mainStage.close();
    }
}
