package com.mettadore.lightdroid;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import android.widget.ToggleButton;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;

//import com.mettadore.*;

public class LightDroid extends Activity implements OnSeekBarChangeListener 
													{

	SharedPreferences settings;
//	private TelnetSample telnet;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        TelnetSample telnet = new TelnetSample("192.168.2.9", 3100);
	    SeekBar slider = (SeekBar) findViewById(R.id.slider);
	    slider.setOnSeekBarChangeListener(this);
	    slider.setMax(255);

	    final ToggleButton togglebutton1 = (ToggleButton) findViewById(R.id.togglebutton1);
	    final ToggleButton togglebutton2 = (ToggleButton) findViewById(R.id.togglebutton2);
	    final ToggleButton togglebutton3 = (ToggleButton) findViewById(R.id.togglebutton3);
	    final ToggleButton togglebutton4 = (ToggleButton) findViewById(R.id.togglebutton4);
	    final ToggleButton togglebutton5 = (ToggleButton) findViewById(R.id.togglebutton5);
	    final ToggleButton togglebutton6 = (ToggleButton) findViewById(R.id.togglebutton6);
	    final ToggleButton togglebutton7 = (ToggleButton) findViewById(R.id.togglebutton7);
	    final ToggleButton togglebutton8 = (ToggleButton) findViewById(R.id.togglebutton8);
	    final ToggleButton togglebutton9 = (ToggleButton) findViewById(R.id.togglebutton9);
	    final ToggleButton togglebutton10 = (ToggleButton) findViewById(R.id.togglebutton10);
	    final ToggleButton togglebutton11 = (ToggleButton) findViewById(R.id.togglebutton11);
	    final ToggleButton togglebutton12 = (ToggleButton) findViewById(R.id.togglebutton12);
	    final ToggleButton togglebutton13 = (ToggleButton) findViewById(R.id.togglebutton13);
	    final ToggleButton togglebutton14 = (ToggleButton) findViewById(R.id.togglebutton14);
	    final ToggleButton togglebutton15 = (ToggleButton) findViewById(R.id.togglebutton15);
	    final ToggleButton togglebutton16 = (ToggleButton) findViewById(R.id.togglebutton16);
	    final ToggleButton togglebutton17 = (ToggleButton) findViewById(R.id.togglebutton17);
	    final ToggleButton togglebutton18 = (ToggleButton) findViewById(R.id.togglebutton18);
	    final ToggleButton togglebutton19 = (ToggleButton) findViewById(R.id.togglebutton19);
	    final ToggleButton togglebutton20 = (ToggleButton) findViewById(R.id.togglebutton20);
	    final ToggleButton togglebutton21 = (ToggleButton) findViewById(R.id.togglebutton21);
	    final ToggleButton togglebutton22 = (ToggleButton) findViewById(R.id.togglebutton22);
	    final ToggleButton togglebutton23 = (ToggleButton) findViewById(R.id.togglebutton23);
	    final ToggleButton togglebutton24 = (ToggleButton) findViewById(R.id.togglebutton24);
	    final ToggleButton togglebutton25 = (ToggleButton) findViewById(R.id.togglebutton25);
	    final ToggleButton togglebutton26 = (ToggleButton) findViewById(R.id.togglebutton26);
	    final ToggleButton togglebutton27 = (ToggleButton) findViewById(R.id.togglebutton27);
	    final ToggleButton togglebutton28 = (ToggleButton) findViewById(R.id.togglebutton28);
	    final ToggleButton togglebutton29 = (ToggleButton) findViewById(R.id.togglebutton29);
	    final ToggleButton togglebutton30 = (ToggleButton) findViewById(R.id.togglebutton30);
	    final ToggleButton togglebutton31 = (ToggleButton) findViewById(R.id.togglebutton31);
	    final ToggleButton togglebutton32 = (ToggleButton) findViewById(R.id.togglebutton32);
	    final ToggleButton togglebutton33 = (ToggleButton) findViewById(R.id.togglebutton33);
	    final ToggleButton togglebutton34 = (ToggleButton) findViewById(R.id.togglebutton34);
	    final ToggleButton togglebutton35 = (ToggleButton) findViewById(R.id.togglebutton35);
	    final ToggleButton togglebutton36 = (ToggleButton) findViewById(R.id.togglebutton36);

	    final ToggleButton[] toggles = {
	    		togglebutton1,togglebutton2,togglebutton3, togglebutton4,togglebutton5,togglebutton6,
	    		togglebutton7,togglebutton8,togglebutton9,togglebutton10,togglebutton11,togglebutton12,
	    		togglebutton13,togglebutton14,togglebutton15,togglebutton16,togglebutton17,togglebutton18,
	    		togglebutton19,togglebutton20,togglebutton21,togglebutton22,togglebutton23,togglebutton24,
	    		togglebutton25,togglebutton26,togglebutton27,togglebutton28,togglebutton29,togglebutton30,
	    		togglebutton31,togglebutton32,togglebutton33,togglebutton34,togglebutton35,togglebutton36,
	    };

	    OnClickListener toggleclick = new OnClickListener() {
	        public void onClick(View v) {
	        	
	            // Perform action on clicks
	            if (togglebutton1.isChecked()) {
	                Toast.makeText(LightDroid.this, "checked", Toast.LENGTH_SHORT).show();
	            } else {
	                Toast.makeText(LightDroid.this, "Not checked", Toast.LENGTH_SHORT).show();
	            }
	        }
	    };
	    togglebutton1.setOnClickListener(toggleclick);
	    togglebutton2.setOnClickListener(toggleclick);
	    togglebutton3.setOnClickListener(toggleclick);
	    togglebutton4.setOnClickListener(toggleclick);
	    togglebutton5.setOnClickListener(toggleclick);
	    togglebutton6.setOnClickListener(toggleclick);
	    togglebutton7.setOnClickListener(toggleclick);
	    togglebutton8.setOnClickListener(toggleclick);
	    togglebutton9.setOnClickListener(toggleclick);
	    togglebutton10.setOnClickListener(toggleclick);
	    togglebutton11.setOnClickListener(toggleclick);
	    togglebutton12.setOnClickListener(toggleclick);
	    togglebutton13.setOnClickListener(toggleclick);
	    togglebutton14.setOnClickListener(toggleclick);
	    togglebutton15.setOnClickListener(toggleclick);
	    togglebutton16.setOnClickListener(toggleclick);
	    togglebutton17.setOnClickListener(toggleclick);
	    togglebutton18.setOnClickListener(toggleclick);
	    togglebutton19.setOnClickListener(toggleclick);
	    togglebutton20.setOnClickListener(toggleclick);
	    togglebutton21.setOnClickListener(toggleclick);
	    togglebutton22.setOnClickListener(toggleclick);
	    togglebutton23.setOnClickListener(toggleclick);
	    togglebutton24.setOnClickListener(toggleclick);
	    togglebutton25.setOnClickListener(toggleclick);
	    togglebutton26.setOnClickListener(toggleclick);
	    togglebutton27.setOnClickListener(toggleclick);
	    togglebutton28.setOnClickListener(toggleclick);
	    togglebutton29.setOnClickListener(toggleclick);
	    togglebutton30.setOnClickListener(toggleclick);
	    togglebutton31.setOnClickListener(toggleclick);
	    togglebutton32.setOnClickListener(toggleclick);
	    togglebutton33.setOnClickListener(toggleclick);
	    togglebutton34.setOnClickListener(toggleclick);
	    togglebutton35.setOnClickListener(toggleclick);
	    togglebutton36.setOnClickListener(toggleclick);

	    }

	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
//		freq_bar_value = progress;
	}

	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}

	public void onStopTrackingTouch(SeekBar seekBar) {
//		settings.edit().putInt("slider1level", seekBar.getProgress()).commit();
		int value = (int) seekBar.getProgress();
		String cmd;
		cmd = String.format("1 @ %d", value);
		Toast.makeText(this, cmd, 2).show();

		//telnet.sendCommand(cmd);
	}


}

