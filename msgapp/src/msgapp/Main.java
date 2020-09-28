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
import javafx.scene.text.*;

import java.net.URL;

public class Main extends Application { // 1

    @FXML
    public Text button_pressed;
    public void openChoiceMenu(Event o) {
        System.out.println("Asking for the choice menu.");
        button_pressed.setText("Choice menu asked");
        // Opening the choice menu

    }

    @FXML
    public Text S_button_pressed;
    public void reactToClickServer(Event s) {
        System.out.println("Server chosen");
        S_button_pressed.setText("You chose Server.");
        // Opening the Server Window

    }

    @FXML
    public Text C_button_pressed;
    public void reactToClickClient(Event c) {
        System.out.println("Client chosen");
        C_button_pressed.setText("You chose Client.");
        // Opening the Client Window
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {    // 2
        //  ---------------------------------------------------------------
        //  First window, principal    ------------------------------------
        FXMLLoader prm_loader = new FXMLLoader();
        prm_loader.setLocation(new URL("file:/Users/sinatrablue/Documents/MsgApp/msgapp/src/msgapp/welcome.fxml"));
        VBox prm_box = prm_loader.<VBox>load();
        Scene prm_scene = new Scene(prm_box, 300, 300);
        Stage prm_stage = new Stage();
        prm_stage.setScene(prm_scene);
        primaryStage.setTitle("Welcome page");

        /*  NO LONGER USEFULL, ALL IN FXML
        // 4 -> adding a scene
        Label label = new Label("Future interface");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);
        */
        //  End Window 1    -----------------------------------------------
        //  ---------------------------------------------------------------

        /*  NOT USED FOR NOW
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
        */
        //  End Window 2    ----------------------------------------------
        //  --------------------------------------------------------------


        //  ---------------------------------------------------------------
        //  Test Loading from FXML
        FXMLLoader st2_loader = new FXMLLoader();
        st2_loader.setLocation(new URL("file:/Users/sinatrablue/Documents/MsgApp/msgapp/src/msgapp/choice_menu.fxml"));
        VBox vBox_2 = st2_loader.<VBox>load();
        Scene scene_2 = new Scene(vBox_2, 500, 500);
        Stage stage_2 = new Stage();
        stage_2.setScene(scene_2);
        stage_2.setTitle("Choice menu Window");

        primaryStage.show();    // show vs showAndWait
        System.out.println("Welcome page opened.");
        //stage_1.showAndWait();
        stage_2.showAndWait();
    }

    public static void main(String[] args) {    // 3
        Application.launch(args);
    }
}
