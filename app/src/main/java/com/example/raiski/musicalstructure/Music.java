package com.example.raiski.musicalstructure;


public class Music {

	private String mArtist;
	private String mSong;
	private String mAlbum;

	public Music(String artist, String song, String album) {
		mArtist = artist;
		mAlbum = album;
		mSong = song;
	}

	public String getArtist() {
		return mArtist;
	}

	public String getSong() {
		return mSong;
	}

	public String getAlbum() {
		return mAlbum;
	}

}
