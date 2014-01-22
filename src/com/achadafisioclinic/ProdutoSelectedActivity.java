package com.achadafisioclinic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ProdutoSelectedActivity extends Activity {

	int choice;
	String title;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xango);
		title = getIntent().getStringExtra("title");
		
		choice = getIntent().getIntExtra("choice", 0);
		switch(choice) {
		case 0: setContentView(R.layout.fisiocrem);
				break;
		case 1: setContentView(R.layout.xango);
				break;
		case 2: setContentView(R.layout.spiral);
				break;
		case 3: setContentView(R.layout.atex);
				break;
		case 4: setContentView(R.layout.life);
				break;
		default: setContentView(R.layout.fisiocrem);
				break;
		}
		
		TextView titleView = (TextView)findViewById(R.id.txtTitle);
		titleView.setText(title);
	}
}
