package GUI;

import java.util.ArrayList;

import org.json.simple.JSONObject;

public interface JsonGUI{
	abstract public void insertCB(String[] headers);
	
	abstract public void deleteCB();
	
	abstract public void testing();
	
	abstract public JSONObject pullJson(ArrayList<String[]> allData, int row);
	
	
}
