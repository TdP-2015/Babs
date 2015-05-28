package it.polito.tdp.babs.model;

import it.polito.tdp.babs.db.BabsDAO;

import java.util.List;

public class Model {
	
	private List<Station> stations ;

	public List<Station> getStations() {
		return stations;
	}

	public void setStations(List<Station> stations) {
		this.stations = stations;
	}

	public void loadStations() {
		BabsDAO dao = new BabsDAO() ;
		
		stations = dao.getAllStations() ; 
	}

}
