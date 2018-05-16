package com.example.raiski.musicalstructure;


public class Music {

	private String mArtist;
	private String mSong;
	private String mAlbum;
	private String mArtistInfo;

	public Music(String artist, String song, String album, String artistInfo) {
		mArtist = artist;
		mAlbum = album;
		mSong = song;
		mArtistInfo = artistInfo;
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

	public String getArtistInfo() {
		return mArtistInfo;
	}

}
