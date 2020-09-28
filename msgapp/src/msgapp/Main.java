//  Originaly stolen, I now modify it to learn

package msgapp;

import javafx.application.Application;  // 1
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;  // 4
import javafx.scene.layout.VBox;
import javafx.scene.Cursor;
import javafx.scene.Scene;  // 4
import javafx.stage.Modality;
import javafx.stage.Stage;  // 2
import javafx.stage.StageStyle;
import javafx.event.Event;

import java.net.URL;

public class Main extends Application { // 1

    @FXML
    public void reactToClickServer(Event s) {
        System.out.println("You chose Server");
    }
    @FXML
    public void reactToClickClient(Event c) {
        System.out.println("You chose Client");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {    // 2
        //  ---------------------------------------------------------------
        //  First window, principal    -----------------------------------
        primaryStage.setTitle("Messaging with JavaFX");

        // 4 -> adding a scene
        Label label = new Label("Future interface");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);
        //  End Window 1    -----------------------------------------------
        //  ---------------------------------------------------------------

        //  ---------------------------------------------------------------
        //  Second window, tests        -----------------------------------
        VBox vBox_1 = new VBox(new Label("--- vBox 1 ---"));
        Scene scene_1 = new Scene(vBox_1);
        //scene_1.setCursor(Cursor.OPEN_HAND);    // Others are available, like TEXT
        Stage stage_1 = new Stage();
        stage_1.setScene(scene_1);
        //stage_1.setFullScreen(true);  // if we want to set the window of this Stage to full screen
        stage_1.setTitle("Stage 1");
        stage_1.setX(50);
        stage_1.setY(50);
        stage_1.setWidth(600);
        stage_1.setHeight(450);    
        //stage_1.initModality(Modality.APPLICATION_MODAL);   // Will be displayed before any other
        //stage_1.initModality(Modality.WINDOW_MODAL);  // Blocks only the window of the Stage that owns this Stage
        stage_1.initModality(Modality.NONE);  // Blocks nothins
        stage_1.initOwner(primaryStage);    // stage_1 depends on primaryStage
        stage_1.initStyle(StageStyle.DECORATED);
        //  End Window 2    ----------------------------------------------
        //  --------------------------------------------------------------

        //  ---------------------------------------------------------------
        //  Test Loading from FXML
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:/Users/sinatrablue/Documents/HelloFX/IDE/Eclipse/Non-Modular/Java/hellofx/src/hellofx/hellofx.fxml"));

        VBox vBox_2 = loader.<VBox>load();
        Scene scene_2 = new Scene(vBox_2, 300, 300);
        Stage stage_2 = new Stage();
        stage_2.setScene(scene_2);
        stage_2.setTitle("Choice menu Window");

        primaryStage.show();    // show() vs showAndWait(
        //stage_1.showAndWait();
        stage_2.showAndWait();
    }

    public static void main(String[] args) {    // 3
        Application.launch(args);
    }
}
