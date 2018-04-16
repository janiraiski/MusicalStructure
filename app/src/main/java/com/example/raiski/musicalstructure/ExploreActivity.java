package com.example.raiski.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_explore);

		ArrayList<Music> musics =  new ArrayList<Music>();

		musics.add(new Music("Behemoth", "Chant for Ezkaton 2000 E.V.", "Ezkaton"));
		musics.add(new Music("Behemoth", "Blow Your Trumpets Gabriel", "Satanist"));
		musics.add(new Music("Vader", "Thriumph of Death", "Tibi et igni"));

	}

}
