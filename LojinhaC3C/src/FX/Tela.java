package FX;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Tela {
    
    @FXML
    private Button botaoEntrar;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private TextField campoUser;

    @FXML
    private Label labelResult;

    private Stage palco;
    private Scene cena;
    private Parent root;
    
    @FXML
    void clicou (ActionEvent event) throws IOException {
        if(campoUser.getText().equals("admin") && campoSenha.getText().equals("123456")) {
            labelResult.setText("Você está logado!");
            //wait(3000);
            root = FXMLLoader.load(getClass().getResource("Cena1.fxml"));
            palco = (Stage)((Node)event.getSource()).getScene().getWindow();
            cena = new Scene(root);
            palco.setScene(cena);
            palco.show();
        } else {
            labelResult.setText("Informações incorretas!");
            
        }
    }
}
