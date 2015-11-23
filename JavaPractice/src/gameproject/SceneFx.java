/**
 * 
 */
package gameproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <pre>
 * gameproject
 * |_SceneFx
	1. 개요 : 
	2. 작성일 :  2015. 11. 23.
	
 * @author : 김의찬
	@version : 1.0
 *
 * 
 */
public class SceneFx extends Application {
/* (non-Javadoc)
 * @see javafx.application.Application#start(javafx.stage.Stage)
 */
@Override
public void start(Stage stage) throws Exception {
	// TODO Auto-generated method stub
	  Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
     	
      Scene scene = new Scene(root, 1000, 1000);
      scene.setCursor(Cursor.HAND);
      stage.setTitle("FXML Welcome");
      
      stage.setScene(scene);
      
      stage.show();
}
public static void main(String[] args) {
	launch(args);
}
}
