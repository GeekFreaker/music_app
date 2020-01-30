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

    public Album(String mTitle, String mYear, String mSummary, String mGenre, Double mPrice, ArrayList<Song> mTracks, int ImageResource) {
        this.mTitle = mTitle;
        this.mYear = mYear;
        this.mSummary = mSummary;
        this.mGenre = mGenre;
        this.mPrice = mPrice;
        this.mTracks = mTracks;
        this.albumart = ImageResource;
    }

//    protected Album(Parcel in) {
//        mTitle = in.readString();
//        mYear = in.readString();
//        mSummary = in.readString();
//        mGenre = in.readString();
//        if (in.readByte() == 0) {
//            mPrice = null;
//        } else {
//            mPrice = in.readDouble();
//        }
//        mTracks = in.createTypedArrayList(Song.CREATOR);
//        albumart = in.readInt();
//    }
//
//    public static final Creator<Album> CREATOR = new Creator<Album>() {
//        @Override
//        public Album createFromParcel(Parcel in) {
//            return new Album(in);
//        }
//
//        @Override
//        public Album[] newArray(int size) {
//            return new Album[size];
//        }
//    };

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

//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(mTitle);
//        dest.writeString(mYear);
//        dest.writeString(mSummary);
//        dest.writeString(mGenre);
//        dest.writeDouble(mPrice);
//        dest.writeList(this.mTracks);
//    }
//
//    private void readFromParcel(Parcel dest) {
//        mGenre = dest.readString();
//        mPrice = dest.readDouble();
//        mTitle = dest.readString();
//        mYear = dest.readString();
//        mSummary = dest.readString();
////        mTracks = dest.readArrayList(this.mTracks, Song.class.getClassLoader());
//    }
}
