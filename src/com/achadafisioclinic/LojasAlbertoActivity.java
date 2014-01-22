package com.achadafisioclinic;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class LojasAlbertoActivity extends Activity {
	
	String tag;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lojas_alberto);
	}
	
	public void onClickShowMap(View view) {
		tag = (String) view.getTag();
		Intent i = new
				Intent(android.content.Intent.ACTION_VIEW,
						Uri.parse("geo:"+tag));
		startActivity(i);
	}

}
