package android.example.music_app.Art;

import java.sql.Time;

public class Song {
    private String mGenre;
    private float mPrice;
    private String mLyrics;
    private int mTrackNumber;
    private Time mTrackLength;

    public Song(String mGenre, float mPrice, String mLyrics, int mTrackNumber, Time mTrackLength) {
        this.mGenre = mGenre;
        this.mPrice = mPrice;
        this.mLyrics = mLyrics;
        this.mTrackNumber = mTrackNumber;
        this.mTrackLength = mTrackLength;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public float getmPrice() {
        return mPrice;
    }

    public void setmPrice(float mPrice) {
        this.mPrice = mPrice;
    }

    public String getmLyrics() {
        return mLyrics;
    }

    public void setmLyrics(String mLyrics) {
        this.mLyrics = mLyrics;
    }

    public int getmTrackNumber() {
        return mTrackNumber;
    }

    public void setmTrackNumber(int mTrackNumber) {
        this.mTrackNumber = mTrackNumber;
    }

    public Time getmTrackLength() {
        return mTrackLength;
    }

    public void setmTrackLength(Time mTrackLength) {
        this.mTrackLength = mTrackLength;
    }
}
