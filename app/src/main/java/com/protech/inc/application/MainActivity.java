package com.protech.inc.application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.protech.inc.fancytoast.FancyTaost;

public class MainActivity extends Activity { 
    private Button SuccessToast;
	private Button WarningToast;
	private Button InfoToast;
	private Button ErrorToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		SuccessToast = findViewById(R.id.activitymainSuccess);
		WarningToast = findViewById(R.id.activitymainWarning);
		InfoToast = findViewById(R.id.activitymainInfo);
		ErrorToast = findViewById(R.id.activitymainError);



		SuccessToast.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {

					FancyTaost.makeText(getApplicationContext(), "Example of Success Toast Library", FancyTaost.LENGTH_LONG, FancyTaost.SUCCESS).show();


				}
			});
		WarningToast.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {

					FancyTaost.makeText(getApplicationContext(), "Example of Warning Toast Library", FancyTaost.LENGTH_LONG, FancyTaost.WARNING).show();


				}
			});
		InfoToast.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {

					FancyTaost.makeText(getApplicationContext(), "Example of Info Toast Library", FancyTaost.LENGTH_LONG, FancyTaost.INFO).show();


				}
			});
		ErrorToast.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {

					FancyTaost.makeText(getApplicationContext(), "Example of Error Toast Library", FancyTaost.LENGTH_LONG, FancyTaost.ERROR).show();


				}
			});

    }

} 
/*don't forget to subscribe my YouTube channel for more Tutorial and mod*/
/*
https://youtube.com/channel/UC_lCMHEhEOFYgJL6fg1ZzQA */
