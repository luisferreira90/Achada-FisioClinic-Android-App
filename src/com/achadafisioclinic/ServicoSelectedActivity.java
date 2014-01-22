package com.achadafisioclinic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ServicoSelectedActivity extends Activity {

	int choice;
	String title;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.consultas);
		title = getIntent().getStringExtra("title");
		
		choice = getIntent().getIntExtra("choice", 0);
		switch(choice) {
		case 0: setContentView(R.layout.consultas);
				break;
		case 1: setContentView(R.layout.medtrabalho);
				break;
		case 2: setContentView(R.layout.fisioterapia);
				break;
		case 3: setContentView(R.layout.psicologia);
				break;
		case 4: setContentView(R.layout.terapiafala);
				break;
		case 5: setContentView(R.layout.nutricao);
				break;
		case 6: setContentView(R.layout.consultoria);
				break;
		case 7: setContentView(R.layout.cuidados_enfermagem);
				break;
		case 8: setContentView(R.layout.medtradicional);
				break;
		case 9: setContentView(R.layout.osteopatia);
				break;
		case 10: setContentView(R.layout.terapiashiatsu);
				break;
		case 11: setContentView(R.layout.massagem);
				break;
		case 12: setContentView(R.layout.exames_complementares);
				break;
		default: setContentView(R.layout.consultas);
				break;
		}
		
		TextView titleView = (TextView)findViewById(R.id.txtTitle);
		titleView.setText(title);
	}
}
