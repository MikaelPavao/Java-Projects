/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Mikael
 */
public class FXMLDocumentController implements Initializable {
    Scanner sc = new Scanner(System.in);
        
    @FXML
    private Label lblTexto;
    private Button btnBotao;
    private TextField txtMensagem;

    public FXMLDocumentController() {
        
    }
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("ffdfddffdfddf");
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
