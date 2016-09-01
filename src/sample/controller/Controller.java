package sample.controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.media.AudioClip;
import javafx.stage.Modality;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Controller {
    File file1 = new File("C:\\Program Files (x86)\\Java\\Программы\\Sample\\src\\sample\\Music\\http.mp3");
    File file2 = new File("C:\\Program Files (x86)\\Java\\Программы\\Sample\\src\\sample\\Music\\go on.mp3");
    String st1 = file1.toURI().toString();
    String st2 = file2.toURI().toString();
    AudioClip cl1 = new AudioClip(st1);
    AudioClip cl2 = new AudioClip(st2);
    @FXML
    private Label dd;
    @FXML
    private Label response;
    public void aa(ActionEvent actionEvent) {
        dd.setText("Понедельник");
        response.setText("1) \n2) \n3) \n4) \n5) \n6) \n7) \n8)");
    }
    public void bb(ActionEvent actionEvent) {
        dd.setText("Вторник");
        response.setText("1) \n2) \n3) \n4) \n5) \n6) \n7) \n8)");
    }
    public void cc(ActionEvent actionEvent) {
        dd.setText("Среда");
        response.setText("1) \n2) \n3) \n4) \n5) \n6) \n7) \n8)");
    }
    public void dd(ActionEvent actionEvent) {
        dd.setText("Четверг");
        response.setText("1) \n2) \n3) \n4) \n5) \n6) \n7) \n8)");
    }
    public void ee(ActionEvent actionEvent) {
        dd.setText("Пятница");
        response.setText("1) \n2) \n3) \n4) \n5) \n6) \n7) \n8)");
    }
    public void ff(ActionEvent actionEvent) {
        dd.setText("Суббота");
        response.setText("1) \n2) \n3) \n4) \n5) \n6) \n7) \n8)");
    }

    public void Exit(ActionEvent actionEvent) throws Exception {
        Main.mainStage.close();
    }
    public void showinfo(ActionEvent actionEvent) throws IOException {
        Main.dialogStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("dialog.fxml"));
        Main.dialogStage.setTitle("Об авторах");
        Main.dialogStage.setResizable(false);
        Main.dialogStage.initModality(Modality.WINDOW_MODAL);
        Main.dialogStage.setScene(new Scene(root));
        Main.dialogStage.initOwner(Main.mainStage);
        Main.dialogStage.show();
    }

    public void showhelp(ActionEvent actionEvent) throws IOException {
        Main.dialogStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("help.fxml"));
        Main.dialogStage.setTitle("Помощь");
        Main.dialogStage.setResizable(false);
        Main.dialogStage.initModality(Modality.WINDOW_MODAL);
        Main.dialogStage.setScene(new Scene(root));
        Main.dialogStage.initOwner(Main.mainStage);
        Main.dialogStage.show();
    }

    public void Used(ActionEvent actionEvent) throws IOException {
        Main.dialogStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("space.fxml"));
        Main.dialogStage.setTitle("Инструменты разработчика");
        Main.dialogStage.setResizable(false);
        Main.dialogStage.initModality(Modality.WINDOW_MODAL);
        Main.dialogStage.setScene(new Scene(root));
        Main.dialogStage.initOwner(Main.mainStage);
        Main.dialogStage.show();
    }

    public void in(ActionEvent actionEvent) {
        if(Main.i == 1) {
            if(cl1.isPlaying()){
                return;
            }
            cl1.play();
        }
        if(Main.i == 2) {
            if(cl2.isPlaying()) {
                return;
            }
            cl2.play();
        }
    }

    public void off(ActionEvent actionEvent) {
        if(Main.i == 1) {
            cl1.stop();
        }
        else cl2.stop();
    }

    public void SWITCH(ActionEvent actionEvent) {
        if(Main.i == 1) {
            Main.i = 2;
        }
        else Main.i = 1;
        cl1.stop();
        cl2.stop();
    }
}
