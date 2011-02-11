package com.mettadore.lightdroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SliderActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//		Intent settingsActivity = new Intent(getBaseContext(), Preferences.class);
		//		startActivity(settingsActivity);
		
		TextView textview = new TextView(this);
		textview.setText("Sliders");
		setContentView(textview);
	}

}
