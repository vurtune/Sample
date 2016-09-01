package sample.controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class Main extends Application {
    static Stage dialogStage;
    static Stage mainStage;
    static int i = 1;

    @Override
    public void start(Stage myStage) throws Exception
    {
        mainStage = myStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        myStage.setTitle("Расписание");
        Scene myScene = new Scene(root);
        myStage.setScene(myScene);
        myStage.setMaximized(true);
        myStage.setResizable(false);
        myStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
