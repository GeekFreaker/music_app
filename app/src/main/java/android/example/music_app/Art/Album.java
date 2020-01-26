package android.example.music_app.Art;

import java.sql.Time;

public class Album {
    private String mTitle;
    private Time mYear;
    private String mSummary;
    private String mGenre;
    private Float mPrice;
    private Song [] mTracks;

    public Album(String mTitle, Time mYear, String mSummary, String mGenre, Float mPrice, Song[] mTracks) {
        this.mTitle = mTitle;
        this.mYear = mYear;
        this.mSummary = mSummary;
        this.mGenre = mGenre;
        this.mPrice = mPrice;
        this.mTracks = mTracks;
    }
}
