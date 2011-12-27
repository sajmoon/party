package dkm.partymachine;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DrinksActivity extends ListActivity{
	static final String[] COUNTRIES = new String[] {
	    "Lolly", "P2", "Gin Tonic", "Whiskey Cola", "Amsterdam"
	  };
	public void onCreate(Bundle saveInstantState) {
		
		super.onCreate(saveInstantState);
		
		setContentView(R.layout.main);
		  setListAdapter(new ArrayAdapter<String>(this,
		                          android.R.layout.simple_list_item_1,
		                          COUNTRIES));
	}

}
