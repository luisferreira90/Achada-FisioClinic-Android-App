package com.achadafisioclinic;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ContactosActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contactos);
	}
	
	public void onClickShowMap(View view) {
		Intent i = new
				Intent(android.content.Intent.ACTION_VIEW,
						Uri.parse("geo:32.652346, -16.916524?q=32.652346,-16.916524"));
		startActivity(i);
	}
	
	public void onClickShowCarreira(View view) {
		Intent i = new Intent("com.achadafisioclinic.CarreiraActivity");
		startActivity(i);
	}
	
	public void onClickTelefone(View view) {
		PackageManager pm = getBaseContext().getPackageManager();
	    if(!pm.hasSystemFeature(PackageManager.FEATURE_TELEPHONY)) {
	    	Toast.makeText(getBaseContext(), "Este dispositivo não pode fazer chamadas.", Toast.LENGTH_SHORT).show();    	
	    }
	    else {
			Intent i = new
					Intent(android.content.Intent.ACTION_DIAL,
							Uri.parse("tel:929093025"));
			startActivity(i);
	    }
	}
	
	public void onClickEmail(View view) {
		Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
	            "mailto","geral@achadafisioclinic.com", null));
	startActivity(Intent.createChooser(emailIntent, "Enviar e-mail"));
	}
}
