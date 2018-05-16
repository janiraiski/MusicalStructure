package com.example.raiski.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class InfoActivity extends AppCompatActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);

		TextView artistName = findViewById(R.id.artist_name_info);
		TextView artistInfo = findViewById(R.id.artist_info);


	}

}
