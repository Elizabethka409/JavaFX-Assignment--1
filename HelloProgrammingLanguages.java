import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

// Showcases a GUI to display console out of "Hello world!" in
// different programming languages using buttons and labelled text.
public class HelloProgrammingLanguages extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   public void start(Stage primaryStage)
   {  
	   Label messageLabel = new Label("Hello World!");
      
      Label messageLabel2 = new Label("Click any button below to change the programming language:");
      
      // buttons for a progamming language
      Button java = new Button("Java");
      
      java.setOnAction(e ->{
         messageLabel.setText("System.out.println(\"Hello World!\");");
      });
      
      Button cplusplus = new Button("C++");
      
      cplusplus.setOnAction(e ->{
         messageLabel.setText("cout << \"Hello World!\";\nreturn 0;");
      });
      
      Button python = new Button("Python");
      python.setOnAction(e ->{
         messageLabel.setText("print(\"Hello World!\")");
      });
      
      Button javascript = new Button("JavaScript");
      javascript.setOnAction(e ->{
         messageLabel.setText("console.log(\"Hello World!\");");
      });
      
      Button csharp = new Button("C#");
      csharp.setOnAction(e ->{
         messageLabel.setText("System.Console.WriteLine(\"Hello World!\");");
      });
      
      Button php = new Button("PHP");
      php.setOnAction(e ->{
         messageLabel.setText("echo \"Hello World!\";");
      });
      
      Button exit = new Button("Exit");
      exit.setOnAction(e ->{
         System.exit(0);
      });
	  
	  HBox hbox = new HBox(messageLabel);
     
     VBox vbox = new VBox(10, hbox, messageLabel2, java, cplusplus, python, javascript, csharp, php, exit);
     
     hbox.setAlignment(Pos.TOP_CENTER);
     
     vbox.setAlignment(Pos.TOP_CENTER);
	  
	  Scene scene = new Scene(vbox, 425, 325); // made window wider to display title in full
	  
	  primaryStage.setScene(scene);
	  
	  primaryStage.setTitle("Hello World From Around the Virtual Globe!");
	  
      primaryStage.show();
   }
}