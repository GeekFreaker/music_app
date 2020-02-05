package android.example.music_app.Art;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Song implements Serializable, Parcelable {
    private String mGenre;
    private double mPrice;
    private String mTitle;
    private int mTrackNumber;
    private long mTrackLength;
    private int favorite;
    private String Lyrics;

    public Song(String mGenre, double mPrice, String mTitle, int mTrackNumber, long mTrackLength) {
        this.mGenre = mGenre;
        this.mPrice = mPrice;
        this.mTitle = mTitle;
        this.mTrackNumber = mTrackNumber;
        this.mTrackLength = mTrackLength;
        this.favorite = 0;
        this.Lyrics = "";
    }

    protected Song(Parcel in) {
        Lyrics = in.readString();
        favorite = in.readInt();
        mGenre = in.readString();
        mPrice = in.readDouble();
        mTitle = in.readString();
        mTrackLength = in.readLong();
        mTrackNumber = in.readInt();
    }

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    public String getmGenre() {
        return mGenre;
    }

    public double getmPrice() {
        return mPrice;
    }

    public String getmTitle() {
        return mTitle;
    }

    public int getmTrackNumber() {
        return mTrackNumber;
    }

    public Long getmTrackLength() {
        return mTrackLength;
    }

    public String getLyrics() {
        return Lyrics;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Lyrics);
        dest.writeInt(favorite);
        dest.writeString(mGenre);
        dest.writeDouble(mPrice);
        dest.writeString(mTitle);
        dest.writeLong(mTrackLength);
        dest.writeInt(mTrackNumber);
    }
}
