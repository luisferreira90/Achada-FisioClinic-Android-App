package com.achadafisioclinic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CartaoSelectedActivity extends Activity {
	
	int choice;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		choice = getIntent().getIntExtra("choice", 0);
		setContentView(R.layout.cartao_selected);
		buildLayout(choice);
	}
	
	public void buildLayout(int choice) {
		TextView title = (TextView)findViewById(R.id.txtTitle);
		TextView text = (TextView)findViewById(R.id.txtCartao);
		if(choice==1) {
			title.setText(getString(R.string.title_cartao_premium));
			text.setText(getString(R.string.cartao_premium_long));
		}
		else {
			title.setText(getString(R.string.title_cartao_cliente));
			text.setText(getString(R.string.cartao_cliente_long));
		}
	}
	
	public void onClickDescontos(View view) {
		startActivity(new Intent("com.achadafisioclinic.DescontosActivity"));
	}
} 