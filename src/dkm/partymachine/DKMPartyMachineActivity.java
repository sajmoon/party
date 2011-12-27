package dkm.partymachine;

import android.app.Activity; 
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle; 
import android.widget.TabHost;
import android.widget.TextView; 

public class DKMPartyMachineActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            
            Resources res = getResources();
            TabHost tabHost = getTabHost();  // The activity TabHost
            TabHost.TabSpec spec;
            
            Intent intentDrinks;
            Intent intentEvents;
            Intent intentPictures;
            
            intentDrinks = new Intent().setClass(this, DrinksActivity.class);
            intentEvents = new Intent().setClass(this, EventsActivity.class);
            intentPictures = new Intent().setClass(this, PicturesActivity.class);
            
            spec = tabHost.newTabSpec("drinks").setIndicator("Drinks",
                    res.getDrawable(R.drawable.ic_launcher))
                .setContent(intentDrinks);
            
            tabHost.addTab(spec);

            // Do the same for the other tabs
            intentEvents = new Intent().setClass(this, EventsActivity.class);
            spec = tabHost.newTabSpec("events").setIndicator("Events",
                              res.getDrawable(R.drawable.ic_launcher))
                          .setContent(intentEvents);
            tabHost.addTab(spec);
            
            // Do the same for the other tabs
            intentPictures = new Intent().setClass(this, PicturesActivity.class);
            spec = tabHost.newTabSpec("pictures").setIndicator("Bilder",
                              res.getDrawable(R.drawable.ic_launcher))
                          .setContent(intentPictures);
            tabHost.addTab(spec);


            tabHost.setCurrentTab(0);
            
         // Set tabs Colors
            tabHost.setBackgroundColor(Color.BLACK);
            tabHost.getTabWidget().setBackgroundColor(Color.BLACK);
            
    }

}
