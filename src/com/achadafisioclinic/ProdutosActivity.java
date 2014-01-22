package com.achadafisioclinic;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProdutosActivity extends ListActivity {

	String produtos[];

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		produtos = getResources().getStringArray(R.array.produtos_array);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, produtos));
		ListView listServicos = getListView();
		listServicos.setScrollBarStyle(R.drawable.scrollbar);

		
		listServicos.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, 
			View view, int position, long id) {   
				Intent i = new Intent("com.achadafisioclinic.ProdutoSelectedActivity");
				i.putExtra("choice", position);
				i.putExtra("title", produtos[position]);
				startActivityForResult(i,1);
			}	
		});	
	}
}
