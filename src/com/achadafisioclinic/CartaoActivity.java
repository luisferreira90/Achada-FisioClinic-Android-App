package com.achadafisioclinic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CartaoActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cartao);
	}
	
	public void onClickPremium(View view) {
		Intent i = new Intent("com.achadafisioclinic.CartaoSelectedActivity");
		i.putExtra("choice", 1);
		startActivityForResult(i,1);
	}
	
	public void onClickCliente(View view) {
		Intent i = new Intent("com.achadafisioclinic.CartaoSelectedActivity");
		i.putExtra("choice", 2);
		startActivityForResult(i,1);
	}
} 