package com.example.raiski.musicalstructure;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music>{

	public MusicAdapter(Activity context, ArrayList<Music> musics) {
		super(context, 0, musics);
	}

	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
		View listItemView = convertView;
		if (listItemView == null) {
			listItemView = LayoutInflater.from(getContext()).inflate(
					R.layout.list_item, parent, false);
		}


		Music currentMusic = getItem(position);


		TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);

		songNameTextView.setText(currentMusic.getSong());


		TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.album_name_text_view);

		albumNameTextView.setText(currentMusic.getAlbum());


		TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);

		artistNameTextView.setText(currentMusic.getArtist());

		/*// Find the ImageView in the list_item.xml layout with the ID list_item_icon
		ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
		// Get the image resource ID from the current AndroidFlavor object and
		// set the image to iconView
		iconView.setImageResource(Word.getImageResourceId());*/

		return listItemView;

	}

}
