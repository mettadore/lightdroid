package com.mettadore.lightdroid;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;

import com.mettadore.*;

public class LightDroid extends Activity implements OnSeekBarChangeListener {

	SharedPreferences settings;
	private TelnetSample telnet;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TelnetSample telnet = new TelnetSample("192.168.2.9", 3100);
	    SeekBar slider = (SeekBar) findViewById(R.id.slider);
	    slider.setOnSeekBarChangeListener(this);
	    slider.setMax(255);

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
		int value = seekBar.getProgress();
		String cmd;
		cmd = String.format("1 @ %i", value);
		//Toast.makeText(this, cmd, 2).show();

		//telnet.sendCommand(cmd);
	}

}

