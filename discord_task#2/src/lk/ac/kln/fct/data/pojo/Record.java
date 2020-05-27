package lk.ac.kln.fct.data.pojo;

import java.util.Date;

public class Record {
	
	private Date date;
	private int deaths;
	private int cases;
	private String countriesAndTerritories;
	private String continentExp;
	
	public Record(Date date, int deaths, int cases, String countriesAndTerritories, String continentExp) {
		this.date = date;
		this.deaths = deaths;
		this.cases = cases;
		this.countriesAndTerritories = countriesAndTerritories;
		this.continentExp = continentExp;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getCases() {
		return cases;
	}
	public void setCases(int cases) {
		this.cases = cases;
	}
	public String getCountriesAndTerritories() {
		return countriesAndTerritories;
	}
	public void setCountriesAndTerritories(String countriesAndTerritories) {
		this.countriesAndTerritories = countriesAndTerritories;
	}
	public String getContinentExp() {
		return continentExp;
	}
	public void setContinentExp(String continentExp) {
		this.continentExp = continentExp;
	}
	
}
