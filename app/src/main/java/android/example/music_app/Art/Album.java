package android.example.music_app.Art;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class Album implements Serializable {
    private String mTitle;
    private String mYear;
    private String mSummary;
    private String mGenre;
    private Double mPrice;
    private ArrayList<Song> mTracks;//should be an array in future
    private int albumart;

    public Album() {
    }

    public Album(String mTitle, String mYear, String mSummary, String mGenre, Double mPrice, ArrayList<Song> mTracks,int ImageResource) {
        this.mTitle = mTitle;
        this.mYear = mYear;
        this.mSummary = mSummary;
        this.mGenre = mGenre;
        this.mPrice = mPrice;
        this.mTracks = mTracks;
        this.albumart = ImageResource;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getAlbumart() {
        return albumart;
    }

    public void setAlbumart(int albumart) {
        this.albumart = albumart;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }

    public String getmSummary() {
        return mSummary;
    }

    public void setmSummary(String mSummary) {
        this.mSummary = mSummary;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public Double getmPrice() {
        return mPrice;
    }

    public void setmPrice(Double mPrice) {
        this.mPrice = mPrice;
    }

    public ArrayList<? extends Parcelable> getmTracks() {
        return mTracks;
    }

    public void setmTracks(ArrayList<Song> mTracks) {
        this.mTracks = mTracks;
    }
}
