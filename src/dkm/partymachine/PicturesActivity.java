package dkm.partymachine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PicturesActivity extends Activity {
	public void onCreate(Bundle saveInstantState) {
		
		super.onCreate(saveInstantState);
		
		TextView textview = new TextView(this);
		textview.setText("This is for pictures");
		setContentView(textview);
	}

}
