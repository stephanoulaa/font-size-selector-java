import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class FontSizeSelector extends Application {
 
    public static void main(String[] args) {   
        //launch application
        launch(args);   
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        //constants for the scene dimensions
        final double WIDTH = 300.0, HEIGHT = 200.0;
        
        //create sample text
        Label sampleText = new Label("Sample Text");
        
        //create the menu bar
        MenuBar menuBar = new MenuBar();
        
        //create file menu
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.getItems().add(exitItem);
        
        //register an event handler for the exit item
        exitItem.setOnAction(event -> {
            primaryStage.close();
        });
        
        Menu fontSizeMenu = new Menu("Font Size");
        MenuItem item6 = new MenuItem("6 points");
        MenuItem item9 = new MenuItem("9 points");
        MenuItem item12 = new MenuItem("12 points");
        MenuItem item18 = new MenuItem("18 points");
        MenuItem item24 = new MenuItem("24 points");
        fontSizeMenu.getItems().addAll(item6, item9, item12, item18, item24);
        
        //change font size for each item
        item6.setOnAction(event -> {
            sampleText.setStyle("-fx-font-size: 6pt");   
            }
        );
        
        item9.setOnAction(event -> {
            sampleText.setStyle("-fx-font-size: 9pt");   
            }
        );
        
        item12.setOnAction(event -> {
            sampleText.setStyle("-fx-font-size: 12pt");   
            }
        );
        
        item18.setOnAction(event -> {
            sampleText.setStyle("-fx-font-size: 18pt");   
            }
        );
        
        item24.setOnAction(event -> {
            sampleText.setStyle("-fx-font-size: 24pt");   
            }
        );
        
        //add menu to menu bar
        menuBar.getMenus().addAll(fileMenu, fontSizeMenu);
        
        //create a borderpane with the sample text in the center
        BorderPane borderPane = new BorderPane(sampleText);
        
        //add menu bar to top region
        borderPane.setTop(menuBar);
        
        //create a Scene and display it
        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}