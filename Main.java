import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Testing extends Application {
    @Override
    public void start(Stage stage) {
        GridPane images = new GridPane();

        try {
            // Replace these paths with the correct paths to your images
            String imagePathA = "C:\\Users\\nicho\\Downloads\\image\\image\\uk.gif";
            String imagePathB = "C:\\Users\\nicho\\Downloads\\image\\image\\ca.gif";
            String imagePathC = "C:\\Users\\nicho\\Downloads\\image\\image\\china.gif";
            String imagePathD = "C:\\Users\\nicho\\Downloads\\image\\image\\us.gif";

            // Add the images to the grid pane
            images.add(new ImageView(new Image(imagePathA)), 0, 0);
            images.add(new ImageView(new Image(imagePathB)), 1, 0);
            images.add(new ImageView(new Image(imagePathC)), 0, 1);
            images.add(new ImageView(new Image(imagePathD)), 1, 1);

            // Create a scene and set it on the stage
            Scene scene = new Scene(images);
            stage.setScene(scene);

            // Set the title of the stage
            stage.setTitle("Image Grid");

            // Show the stage
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception (e.g., show an error message)
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
