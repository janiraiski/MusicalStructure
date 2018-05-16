package com.example.raiski.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView nowPlayingArtist = (TextView) findViewById(R.id.artist_name_now_playing);
		Button exploreButton = (Button) findViewById(R.id.explore_button_now_playing);
		ImageView playPause = (ImageView) findViewById(R.id.button_play_pause);
		ImageView previousSong = (ImageView) findViewById(R.id.button_previous_song);
		ImageView nextSong = (ImageView) findViewById(R.id.button_next_song);



		// Set a click listener on that View
		nowPlayingArtist.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				// Create a new intent to open the {@link NumbersActivity}
				Intent infoIntent = new Intent(MainActivity.this, InfoActivity.class);

				// Start the new activity
				startActivity(infoIntent);
			}
		});

		exploreButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				// Create a new intent to open the {@link NumbersActivity}
				Intent exploreIntent = new Intent(MainActivity.this, ExploreActivity.class);

				// Start the new activity
				startActivity(exploreIntent);
			}
		});

	}

}
