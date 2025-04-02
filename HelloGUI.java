// now we're going to create a scene [for our stage from the firstGUI.java file]
// adding scene object into the stage class via importing and extending

// simple way to show for us to display a GUI to display "hello world" with a GUI with a title called "first GUI"

import javafx.application.Application;
import javafx.stage.Stage;
// new imports
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class HelloGUI extends Application
{
   public static void main(String[] args)
   {
      launch(args); // does many steps of things to basically allow for stage to exist
   }
      
   public void start(Stage primaryStage)
   {
      // think as hbox and messageLabel as one collective actor
      Label messageLabel = new Label("Hello World!"); // script
      
      HBox hbox = new HBox(messageLabel); // actor; read the script hbox! (messsageLabel)
      
      // scene is where this collective actor is going to actually perform in the actual scene
      Scene scene = new Scene(hbox, 300, 100);
      // number parameters added so GUI box has a set look where you don't need to stretch the window out if too small
      
      // now set the scene on the respective stage
      primaryStage.setScene(scene);
      
      primaryStage.setTitle("My First GUI");
      primaryStage.show(); // shows the stage
   }
}