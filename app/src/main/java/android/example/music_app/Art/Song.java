package android.example.music_app.Art;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Song implements Serializable, Parcelable {
    private String mGenre;
    private double mPrice;
    private String mTitle;
    private int mTrackNumber;
    private Long mTrackLength;
    private boolean favorite;
    private String Lyrics;

    public Song(String mGenre, double mPrice, String mTitle, int mTrackNumber, Long mTrackLength) {
        this.mGenre = mGenre;
        this.mPrice = mPrice;
        this.mTitle = mTitle;
        this.mTrackNumber = mTrackNumber;
        this.mTrackLength = mTrackLength;
    }

    protected Song(Parcel in) {
        mGenre = in.readString();
        mPrice = in.readDouble();
        mTitle = in.readString();
        mTrackNumber = in.readInt();
        if (in.readByte() == 0) {
            mTrackLength = null;
        } else {
            mTrackLength = in.readLong();
        }
        favorite = in.readByte() != 0;
        Lyrics = in.readString();
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

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public double getmPrice() {
        return mPrice;
    }

    public void setmPrice(float mPrice) {
        this.mPrice = mPrice;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getmTrackNumber() {
        return mTrackNumber;
    }

    public void setmTrackNumber(int mTrackNumber) {
        this.mTrackNumber = mTrackNumber;
    }

    public Long getmTrackLength() {
        return mTrackLength;
    }

    public void setmTrackLength(Long mTrackLength) {
        this.mTrackLength = mTrackLength;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mGenre);
        dest.writeDouble(mPrice);
        dest.writeString(mTitle);
        dest.writeInt(mTrackNumber);
        dest.writeLong(mTrackLength);
    }

    private void readFromParcel(Parcel dest) {
        mGenre = dest.readString();
        mPrice = dest.readDouble();
        mTitle = dest.readString();
        mTrackNumber = dest.readInt();
        mTrackLength = dest.readLong();
    }
}
