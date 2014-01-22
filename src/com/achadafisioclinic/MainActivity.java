package com.achadafisioclinic;

import com.achadafisioclinic.R;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void onClickCartao(View view) {
		startActivity(new Intent("com.achadafisioclinic.CartaoActivity"));
	}
	
	public void onClickContactos(View view) {
		startActivity(new Intent("com.achadafisioclinic.ContactosActivity"));
	}
	
	public void onClickDirecoes(View view) {
		startActivity(new Intent("com.achadafisioclinic.DirecoesActivity"));
	}
	
	public void onClickProdutos(View view) {
		startActivity(new Intent("com.achadafisioclinic.ProdutosActivity"));
	}
	
	public void onClickQuem(View view) {
		startActivity(new Intent("com.achadafisioclinic.QuemActivity"));
	}
	
	public void onClickServicos(View view) {
		startActivity(new Intent("com.achadafisioclinic.ServicosActivity"));
	}

}
