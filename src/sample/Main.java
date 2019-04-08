package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
/**
 * This is the main class of the reservation manager
 * Currently this class contains some dummy users and some dummy reservations.
 * Finally, after creating them, the main method of this class prints them out.
 *
 * Feel free to run the main method at any time. :)
 */


/**
 * @param args not used
 *
 * this method starts the application :)
 */


//creating the users
//creating reservations
//adding all the reservations to a list
//printing out the reservations
