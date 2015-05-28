package it.polito.tdp.babs;

import it.polito.tdp.babs.model.Model;
import it.polito.tdp.babs.model.Station;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class BabsController {
	
	private Model model ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Station> boxPartenza;

    @FXML
    private Button doTempoMedio;

    @FXML
    private TextArea txtResult;

    @FXML
    private ComboBox<Station> boxArrivo;

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

	public void setModel(Model model) {
		this.model = model;
		
		boxPartenza.getItems().addAll(model.getStations()) ;
		
		//Collections.sort
		// NO boxPartenza.setItems(model.getStations()) ;
		
		boxArrivo.getItems().addAll(model.getStations()) ;
	}
}
