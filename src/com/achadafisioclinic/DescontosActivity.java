package com.achadafisioclinic;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DescontosActivity extends ListActivity {

	String descontos[];

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		descontos = getResources().getStringArray(R.array.descontos_array);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, descontos));
		ListView listDescontos = getListView();
		
		listDescontos.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, 
			View view, int position, long id) {   
				Intent i = new Intent("com.achadafisioclinic.DescontoSelectedActivity");
				i.putExtra("choice", position);
				startActivity(i);
			}	
		});	
	}
}
