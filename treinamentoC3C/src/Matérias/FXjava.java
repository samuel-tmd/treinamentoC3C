package Matérias;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXjava extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("Minha Janela");
        Button botao = new Button("Clique Aqui");
        botao.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Clicou no botão!");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().addAll(botao);
        arg0.setScene(new Scene(root, 300, 200));
        arg0.show();
    }
    
}
