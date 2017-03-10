
package one;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author kevinlang
 *
 */
public class Window extends Application{
	
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
	
	private Group layout;
	private Map map;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(javafx.stage.Stage primaryStage) throws Exception {
		
		// Create new layout pane
		layout = new Group();
		
		Scene scene = new Scene(layout, WIDTH, HEIGHT);
		
		// Create new map
		map = new Map("Map", 32);
		map.draw();
		
		// Create the scene and add the layout
		primaryStage.setTitle("Viking");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public Group getGroup() {
		return layout;
	}
}
