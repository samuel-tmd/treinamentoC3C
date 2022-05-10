package FX;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Cenas {
    
    @FXML
    private Button btnCena2;

    @FXML
    private Button btnCena1;

    private Stage palco;
    private Scene cena;
    private Parent root;


    @FXML
    void goCena2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Cena2.fxml"));
        palco = (Stage)((Node)event.getSource()).getScene().getWindow();
        cena = new Scene(root);
        palco.setScene(cena);
        palco.show();
    }

    @FXML
    void goCena1(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Cena1.fxml"));
        palco = (Stage)((Node)event.getSource()).getScene().getWindow();
        cena = new Scene(root);
        palco.setScene(cena);
        palco.show();
    }

}
