package com.mettadore.lightdroid;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.BitSet;

import org.apache.commons.net.telnet.TelnetClient;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class LightDroid extends TabActivity // implements
											// OnSeekBarChangeListener
{
	String telnet_server;
	String server_ip;
	int server_port;
	TelnetClient telnet = new TelnetClient();
	InputStream in;
	PrintStream out;
	OnClickListener connectionListener;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab

		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, ButtonActivity.class);

		// Initialize a TabSpec for each tab and add it to the TabHost
		spec = tabHost
				.newTabSpec("buttons")
				.setIndicator("Buttons",
						res.getDrawable(R.drawable.ic_tab_artists))
				.setContent(intent);
		tabHost.addTab(spec);

		// Do the same for the other tabs
		intent = new Intent().setClass(this, SliderActivity.class);
		spec = tabHost
				.newTabSpec("sliders")
				.setIndicator("Sliders",
						res.getDrawable(R.drawable.ic_tab_artists))
				.setContent(intent);
		tabHost.addTab(spec);

		// Do the same for the other tabs
		intent = new Intent().setClass(this, CueActivity.class);
		spec = tabHost
				.newTabSpec("cues")
				.setIndicator("Cues",
						res.getDrawable(R.drawable.ic_tab_artists))
				.setContent(intent);
		tabHost.addTab(spec);

		tabHost.setCurrentTab(0);
		final ToggleButton connectbutton = (ToggleButton) findViewById(R.id.connectbutton);

		OnClickListener connectionlistener = new OnClickListener() {
			public void onClick(View v) {
				if (((ToggleButton) v).isChecked()) {
					try {
						telnet.connect("192.168.2.9", 3100);
						toast("Connected to telnet server");
					} catch (Exception e) {
						e.printStackTrace();
						toast("Cannot connect to server");
					}
				} else {
					try {
						telnet.disconnect();
						toast("Disconnect from telnet server");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						toast("Problem disconnecting");
					}
				}
			}
		};
		connectbutton.setOnClickListener(connectionlistener);
	}

	public void sendTelnetCommand(String command) {
		try {
			// Get input and output stream references
			in = telnet.getInputStream();
			out = new PrintStream(telnet.getOutputStream());
			out.println(command);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void toast(String message) {
		Toast.makeText(LightDroid.this, message, Toast.LENGTH_SHORT).show();
	}

}
