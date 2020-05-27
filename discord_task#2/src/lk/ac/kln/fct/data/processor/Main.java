package lk.ac.kln.fct.data.processor;

import java.util.ArrayList;

import lk.ac.kln.fct.data.pojo.Record;

public class Main {
	private static final String FILE_PATH = "F:\\Eclipse\\discord_task#2\\src\\covid-19-data.json";
	private static final String DATE = "18/05/2020";
	
	public static void main(String[] args) {
		
		DataProcessor processor = new DataProcessor();
		ArrayList<Record> records = processor.getDataByDate(FILE_PATH, DATE);
		Main.sortAndPrint(records);
		
	}
		
	public static void sortAndPrint(ArrayList<Record> records) {
		records.sort((record1, record2)-> Integer.compare(record2.getCases(), record1.getCases()));
		
		for(Record reco : records) {
			if(reco.getCases()>=1000)
				System.out.println(reco.getCountriesAndTerritories()+" :" + reco.getCases()+ " :"+ reco.getDeaths());
			
		}	
	}
}

