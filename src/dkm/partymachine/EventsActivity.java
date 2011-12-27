package dkm.partymachine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EventsActivity extends Activity {
	public void onCreate(Bundle savedInstantState) {
		super.onCreate(savedInstantState);
		
		TextView textview = new TextView(this);
		textview.setText("This is events");
		setContentView(textview);
	}

}
