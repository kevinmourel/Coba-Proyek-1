/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kevin
 */
public class FXMLlatihanController implements Initializable {

    @FXML
    private TextField Nama;

    @FXML
    private TextField Absen;

    @FXML
    private TextField Alamat;

    @FXML
    private TextField Telepon;

    @FXML
    private JFXTextArea hasil;

    @FXML
    private JFXButton proses;
    
    @FXML
    private JFXButton hapus;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    void Proses(ActionEvent event) {
            String nama = Nama.getText();
            String absen = Absen.getText();
            String alamat = Alamat.getText();
            String telepon = Telepon.getText();
            
            hasil.setText("Nama anda "+nama+"\nAbsen Anda "+absen+"\nAlamat anda "+alamat+"\nNomor Telepon anda "+telepon);
    }
    
    @FXML
    void hapus(ActionEvent event) {
        hasil.setText("");
        Nama.setText("");
        Absen.setText("");
        Alamat.setText("");
        Telepon.setText("");
    }
}