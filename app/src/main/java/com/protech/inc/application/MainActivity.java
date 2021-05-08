package com.protech.inc.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.protech.inc.fancytoast.FancyToast;

public class MainActivity extends Activity {

    private Button successToast;
	private Button warningToast;
	private Button infoToast;
	private Button errorToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		successToast = findViewById(R.id.activitymainSuccess);
		warningToast = findViewById(R.id.activitymainWarning);
		infoToast = findViewById(R.id.activitymainInfo);
		errorToast = findViewById(R.id.activitymainError);

		successToast.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					FancyToast.makeText(getApplicationContext(), "Example of Success Toast Library", FancyToast.LENGTH_LONG, FancyToast.SUCCESS).show();
				}
			});

		warningToast.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					FancyToast.makeText(getApplicationContext(), "Example of Warning Toast Library", FancyToast.LENGTH_LONG, FancyToast.WARNING).show();
				}
			});

		infoToast.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					FancyToast.makeText(getApplicationContext(), "Example of Info Toast Library", FancyToast.LENGTH_LONG, FancyToast.INFO).show();
				}
			});

		errorToast.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					FancyToast.makeText(getApplicationContext(), "Example of Error Toast Library", FancyToast.LENGTH_LONG, FancyToast.ERROR).show();
				}
			});

    }

} 
/*don't forget to subscribe my YouTube channel for more Tutorial and mod*/
/*
https://youtube.com/channel/UC_lCMHEhEOFYgJL6fg1ZzQA */
