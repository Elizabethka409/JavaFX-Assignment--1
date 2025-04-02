import javafx.application.Application;
import javafx.stage.Stage;

public class FirstGUI extends Application
{
   public static void main(String[] args)
   {
      launch(args); // does many steps of things to basically allow for stage to exist
   }
      
   public void start(Stage primaryStage)
   {
      primaryStage.setTitle("My First GUI");
      primaryStage.show(); // shows the stage
   }
}