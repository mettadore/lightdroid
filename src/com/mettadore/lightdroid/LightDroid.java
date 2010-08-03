package com.mettadore.lightdroid;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.apache.commons.net.telnet.TelnetClient;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.ToggleButton;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;

//import com.mettadore.*;

public class LightDroid extends Activity implements OnSeekBarChangeListener
{

	public static final String PREFS_NAME = "LightDroidPrefsFile";
	int seek_bar_value;
	int[] channel_values;
	ToggleButton[] toggles;
	String telnet_server;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final SeekBar slider = (SeekBar) findViewById(R.id.slider);
		slider.setOnSeekBarChangeListener(this);
		slider.setMax(255);
        Intent settingsActivity = new Intent(getBaseContext(), Preferences.class);
        startActivity(settingsActivity);

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

		toggles = new ToggleButton[] {
				togglebutton1,togglebutton2,togglebutton3, togglebutton4,togglebutton5,togglebutton6,
				togglebutton7,togglebutton8,togglebutton9,togglebutton10,togglebutton11,togglebutton12,
				togglebutton13,togglebutton14,togglebutton15,togglebutton16,togglebutton17,togglebutton18,
				togglebutton19,togglebutton20,togglebutton21,togglebutton22,togglebutton23,togglebutton24,
				togglebutton25,togglebutton26,togglebutton27,togglebutton28,togglebutton29,togglebutton30,
				togglebutton31,togglebutton32,togglebutton33,togglebutton34,togglebutton35,togglebutton36,
		};
		channel_values = new int[36];
		for (int value : channel_values) {
			value = 0;
		}

		OnClickListener toggleclick = new OnClickListener() {
			public void onClick(View v) {
			}
		};

		for (ToggleButton toggle : toggles) {
			toggle.setOnClickListener(toggleclick);
			}

		final Button gobutton = (Button) findViewById(R.id.gobutton);
		gobutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				updateValues();
			}
		});
		final Button allbutton = (Button) findViewById(R.id.allbutton);
		allbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				for (int i=0; i<36; i++) {
					toggles[i].setChecked(true);
				}
				toast("Select All");
			}
		});
		final Button nonebutton = (Button) findViewById(R.id.nonebutton);
		nonebutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				for (int i=0; i<36; i++) {
					toggles[i].setChecked(false);
				}
				toast("Select None");
			}
		});
		final Button resetbutton = (Button) findViewById(R.id.resetbutton);
		resetbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				sendTelnetCommand("All @ 0");
				slider.setProgress(0);
				for (int i=0; i<36; i++) {
					toggles[i].setChecked(false);
				}
				toast("Channels Reset");
			}
		});
    }
	public void toast(String message) {
		Toast.makeText(LightDroid.this, message, Toast.LENGTH_SHORT).show();
	}

	public int percentage() {
		int value = (int) ((seek_bar_value / 255.0) * 100.0);
		return value;
	}
	public void updateValues() {
		String channels = "0";
		String ch;
		for (int i=0; i<36; i++) {
			if (toggles[i].isChecked()) {
				ch = String.format("+%d", i+1);
				channels = channels.concat(ch);
			}
		}
		String str;
		String cmd;
		str = String.format("%s @ %d%%", channels, percentage());
		cmd = String.format("%s @ DMX %d", channels, (int) seek_bar_value);
		sendTelnetCommand(cmd);
	}

	public void sendTelnetCommand(String command) {
		// TODO: move back to the TelnetSample class and refactor
		TelnetClient telnet = new TelnetClient();
		InputStream in;
		PrintStream out;
		try {
			telnet.connect( "192.168.2.9", 23 );
			// Get input and output stream references
			in = telnet.getInputStream();
			out = new PrintStream( telnet.getOutputStream() );
		   try {
			 out.println( command );
			 out.flush();
		   }
		   catch( Exception e ) {
			 e.printStackTrace();
		   }
		   telnet.disconnect(); //HERE
			
		  } catch (SocketException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
		  } catch (IOException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
		  }
	}

	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		//		freq_bar_value = progress;
	}

	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub

	}

	public void onStopTrackingTouch(SeekBar seekBar) {
		seek_bar_value = seekBar.getProgress();
	}


}

