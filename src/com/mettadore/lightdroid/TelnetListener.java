package com.mettadore.lightdroid;

import java.io.IOException;

import org.apache.commons.net.telnet.TelnetClient;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class TelnetListener implements OnClickListener {

	TelnetClient telnet = new TelnetClient();

	public void onClick(View v) {
		if (((ToggleButton) v).isChecked()) {
			try {
				telnet.connect("192.168.2.9", 3100);
				toast("Connected to telnet server");
			} catch (Exception e) {
				e.printStackTrace();
				toast(e.getMessage());
				// toast("Cannot connect to server");
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
	public void toast(String message) {
		Toast.makeText(ButtonActivity.this, message, Toast.LENGTH_SHORT).show();
	}

}
