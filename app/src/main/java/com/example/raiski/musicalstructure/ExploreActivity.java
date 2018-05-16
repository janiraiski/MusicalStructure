package com.example.raiski.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_explore);

		ArrayList<Music> musics =  new ArrayList<Music>();

		musics.add(new Music("Behemoth", "Blow Your Trumpets Gabriel", "Satanist",
				"Nergal (Holocausto) and Baal Ravenlock (Sodomizer) initially called their" +
						" band Baphomet, but quickly changed the name to Behemoth due to there being" +
						" too many other bands with that name at that time.\n" +
						"\n" +
						"Krzysztof Azarewicz wrote many of the lyrics on the following albums: " +
						"Satanica, Thelema.6, Zos Kia Cultus, Conjuration, Demigod, The Apostasy, " +
						"and Evangelion.\n"));
		musics.add(new Music("Vader", "Thriumph of Death", "Tibi et igni",
				"Formed around 1983. Started off as a heavy/speed metal band. They started" +
						" achieving popularity in the Polish metal scene after the first Metalmania" +
						" edition show in 1986. After going through a number of line-up and music" +
						" direction changes, in 1987 they eventually embraced a death metal sound" +
						" with reminiscences of thrash."));

		MusicAdapter adapter = new MusicAdapter(this, musics);

		ListView listView = (ListView) findViewById(R.id.list);

		listView.setAdapter(adapter);



	}

}
