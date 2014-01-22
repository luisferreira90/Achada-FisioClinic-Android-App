package com.achadafisioclinic;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ServicosActivity extends ListActivity {

	String servicos[];

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		servicos = getResources().getStringArray(R.array.servicos_array);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, servicos));
		ListView listServicos = getListView();
		listServicos.setScrollBarStyle(R.drawable.scrollbar);

		
		listServicos.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, 
			View view, int position, long id) {   
				Intent i = new Intent("com.achadafisioclinic.ServicoSelectedActivity");
				i.putExtra("choice", position);
				i.putExtra("title", servicos[position]);
				startActivityForResult(i,1);
			}	
		});	
	}
}
