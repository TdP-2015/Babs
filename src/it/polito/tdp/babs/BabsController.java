package it.polito.tdp.babs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class BabsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> boxPartenza;

    @FXML
    private Button doTempoMedio;

    @FXML
    private TextArea txtResult;

    @FXML
    private ComboBox<?> boxArrivo;

    @FXML
    private Button doDettaglio;

    @FXML
    private DatePicker pickData;

    @FXML
    void initialize() {
        assert boxPartenza != null : "fx:id=\"boxPartenza\" was not injected: check your FXML file 'Babs.fxml'.";
        assert doTempoMedio != null : "fx:id=\"doTempoMedio\" was not injected: check your FXML file 'Babs.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Babs.fxml'.";
        assert boxArrivo != null : "fx:id=\"boxArrivo\" was not injected: check your FXML file 'Babs.fxml'.";
        assert doDettaglio != null : "fx:id=\"doDettaglio\" was not injected: check your FXML file 'Babs.fxml'.";
        assert pickData != null : "fx:id=\"pickData\" was not injected: check your FXML file 'Babs.fxml'.";

    }
}
