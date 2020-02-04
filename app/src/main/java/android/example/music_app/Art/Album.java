package android.example.music_app.Art;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class Album implements Serializable,Parcelable {
    private String mTitle;
    private String mYear;
    private String mSummary;
    private String mGenre;
    private Double mPrice;
    private ArrayList<Song> mTracks;//should be an array in future
    private int albumArt;
    private Artist artist;

    public Album() {
    }

    public Album(String mTitle, String mYear, String mSummary, String mGenre, Double mPrice, ArrayList<Song> mTracks, int ImageResource, Artist artist) {
        this.mTitle = mTitle;
        this.mYear = mYear;
        this.mSummary = mSummary;
        this.mGenre = mGenre;
        this.mPrice = mPrice;
        this.mTracks = mTracks;
        this.albumArt = ImageResource;
        this.artist = artist;
    }

    protected Album(Parcel in) {
        mTitle = in.readString();
        mYear = in.readString();
        mSummary = in.readString();
        mGenre = in.readString();
        if (in.readByte() == 0) {
            mPrice = null;
        } else {
            mPrice = in.readDouble();
        }
        mTracks = in.createTypedArrayList(Song.CREATOR);
        albumArt = in.readInt();
        artist = in.readParcelable(Album.class.getClassLoader());
;    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };

    public String getmTitle() {
        return mTitle;
    }

    public int getAlbumArt() {
        return albumArt;
    }

    public String getmYear() {
        return mYear;
    }

    public String getmSummary() {
        return mSummary;
    }

    public String getmGenre() {
        return mGenre;
    }

    public ArrayList<Song> getmTracks() {
        return mTracks;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(albumArt);
        dest.writeArray(new Artist[]{this.artist});
        dest.writeString(mGenre);
//        dest.writeDouble(mPrice);
        dest.writeString(mSummary);
        dest.writeTypedList(this.mTracks);
        dest.writeString(mYear);
        dest.writeString(mTitle);
    }

    public Artist getArtist() {
        return artist;
    }
}
