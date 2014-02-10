package com.achadafisioclinic;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DescontoSelectedActivity extends Activity {
	
	int choice;
	String phone, geo, email, phone2, geo2;	
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		choice = getIntent().getIntExtra("choice", 0);
		
		switch(choice) {
		case 0: setContentView(R.layout.achada);
				break;
		case 1: setContentView(R.layout.arriaga);
				phone = "291282590";
				geo = "32.64721,-16.91236?q=Ortoarriaga-sociedade Médica Unipessoal Lda";
				phone2="291976800";
				geo2="32.41825,-17.7017?q=32.41825,-17.7017"; 
				break;
		case 2: setContentView(R.layout.alberto);
				phone = "291000190";
				email = "geral@albertooculista.com";
				break;
		case 3: setContentView(R.layout.mmc);
				phone = "291003300";
				geo = "32.64914,-16.90327?q=MMC - Madeira Medical Center";
				email = "geral@madeiramedicalcenter.pt";
				break;
		case 4: setContentView(R.layout.homeinstead);
				phone = "291745320";
				geo = "32.65244,-16.91652?q=32.65244,-16.91652";
				break;
		case 5: setContentView(R.layout.slim);
				phone = "291105900";
				geo = "32.63825, -16.93132?q=32.63825, -16.93132";
				email = "slimandsvelte.funchal@gmail.com";
				break;
		case 6: setContentView(R.layout.labpsi);		
				phone = "291751393";
				geo = "32.65244,-16.91652?q=32.65244,-16.91652";
				break;
		case 7: setContentView(R.layout.podo);
				phone = "291630171";
				geo = "32.64881, -16.91145?q=32.64881, -16.91145";
				email = "podomedical@gmail.com";
				break;
		case 8: setContentView(R.layout.medinsular);
				phone = "291633245";
				geo = "32.64778,-16.91479?q=32.64778,-16.91479";
				email = "encomendas.ergo@netcabo.pt";
				break;
		default: Toast.makeText(getBaseContext(), "Ocorreu um problema com o seu pedido.", Toast.LENGTH_SHORT).show();
				break;
		}
	}	
	
	public void onClickShowMap(View view) {
		Intent i = new
				Intent(android.content.Intent.ACTION_VIEW,
						Uri.parse("geo:"+geo));
		startActivity(i);
	}

	public void onClickShowMap2(View view) {
		Intent i = new
				Intent(android.content.Intent.ACTION_VIEW,
						Uri.parse("geo:"+geo2));
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
							Uri.parse("tel:" + phone));
			startActivity(i);
	    }
	}
	
	public void onClickTelefone2(View view) {
		PackageManager pm = getBaseContext().getPackageManager();
	    if(!pm.hasSystemFeature(PackageManager.FEATURE_TELEPHONY)) {
	    	Toast.makeText(getBaseContext(), "Este dispositivo não pode fazer chamadas.", Toast.LENGTH_SHORT).show();    	
	    }
	    else {
			Intent i = new
					Intent(android.content.Intent.ACTION_DIAL,
							Uri.parse("tel:" + phone2));
			startActivity(i);
	    }
	}
	
	public void onClickEmail(View view) {
		Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
	            "mailto",email, null));
	startActivity(Intent.createChooser(emailIntent, "Enviar e-mail"));
	}
	
	public void onClickLojas(View view) {
		Intent i = new Intent("com.achadafisioclinic.LojasAlbertoActivity");
		startActivity(i);
	}
}
