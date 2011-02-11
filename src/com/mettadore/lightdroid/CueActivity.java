package com.mettadore.lightdroid;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.BitSet;

import org.apache.commons.net.telnet.TelnetClient;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class CueActivity extends Activity {

	String telnet_server;
	String server_ip;
	int server_port;
	TelnetClient telnet = new TelnetClient();
	InputStream in;
	PrintStream out;

	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//		Intent settingsActivity = new Intent(getBaseContext(), Preferences.class);
		//		startActivity(settingsActivity);
		
		setContentView(R.layout.cues);

		final Button offbutton = (Button) findViewById(R.id.go);
		offbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				sendTelnetCommand("cue playback go");
			}
		});
	}
}