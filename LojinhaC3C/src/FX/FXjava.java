package FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXjava extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        System.out.println(getClass().getResource("Tela.fxml"));
        Parent tela = FXMLLoader.load(getClass().getResource("Tela.fxml"));
        Scene scenario = new Scene(tela,400,300);
        arg0.setTitle("Janela FXML");
        arg0.setScene(scenario);

        arg0.show();
    }
    
}
