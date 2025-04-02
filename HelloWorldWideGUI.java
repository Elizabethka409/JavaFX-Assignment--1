import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*; // changed to * for more variety in action features
import javafx.scene.layout.*; // change so we can use vbox as well
import javafx.geometry.*;

public class HelloWorldWideGUI extends Application
{
   public static void main(String[] args)
   {
      launch(args); // does many steps of things to basically allow for stage to exist
   }
      
   public void start(Stage primaryStage)
   {
      // think as hbox and messageLabel as one collective actor
      Label messageLabel = new Label("Hello World!"); // script
      
      Label messageLabel2 = new Label("Click any button below to change the language:");
      
      // create buttons  
      Button english = new Button("English"); // text displayed on button
      
      english.setOnAction(e ->{ // attribute
         messageLabel.setText("Hello World!"); // inline function
      });
      
      Button french = new Button("French");
      
      french.setOnAction(e ->{
         messageLabel.setText("Salut tout le monde!");
      });
      
      Button german = new Button("German");
      german.setOnAction(e ->{
         messageLabel.setText("Hallo Welt!");
      });
      
      Button italian = new Button("Italian");
      italian.setOnAction(e ->{
         messageLabel.setText("Salve, Mondo!");
      });
      
      Button japanese = new Button("Japanese");
      japanese.setOnAction(e ->{
         messageLabel.setText("Kon'nichiwa sekai!");
      });
      
      Button spanish = new Button("Spanish");
      spanish.setOnAction(e ->{
         messageLabel.setText("Hola Mundo!");
      });
      
      Button exit = new Button("Exit");
         exit.setOnAction(e ->{
         System.exit(0);
      });
      
      HBox hbox = new HBox(messageLabel); // actor; read the script hbox! (messsageLabel)
      
      VBox vbox = new VBox(10, hbox, messageLabel2, english, french, german, italian, japanese, spanish, exit); // all that we want to include on stage from this actor
  
      hbox.setAlignment(Pos.TOP_CENTER); // set alignment of hbox
      
      vbox.setAlignment(Pos.TOP_CENTER); // set alignment of vbox
      
      // scene is where this collective actor is going to actually perform in the actual scene
      Scene scene = new Scene(vbox, 300, 325);
      // number parameters added so GUI box has a set look where you don't need to stretch the window out if too small
      
      // now set the scene on the respective stage
      primaryStage.setScene(scene);
      
      primaryStage.setTitle("Hello World From Around The World!");
      primaryStage.show(); // shows the stage
   }
}