package android.example.music_app.Art;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Artist implements Serializable, Parcelable {
    private String mName;
    private String mSurname;
    private String mAlias;
    private Album[] mAlbum;

    public Artist() {
    }

    public Artist(String mName, String mSurname, String mAlias, Album[] mAlbum) {
        this.mName = mName;
        this.mSurname = mSurname;
        this.mAlias = mAlias;
        this.mAlbum = mAlbum;//array
    }

    protected Artist(Parcel in) {
        mName = in.readString();
        mSurname = in.readString();
        mAlias = in.readString();
        mAlbum = in.createTypedArray(Album.CREATOR);
    }

    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };

    public String getmName() {
        return mName;
    }

    public String getmSurname() {
        return mSurname;
    }

    public String getmAlias() {
        return mAlias;
    }

    public Album[] getmAlbum() {
        return mAlbum;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(mAlbum, i);
        parcel.writeString(mAlias);
        parcel.writeString(mName);
        parcel.writeString(mSurname);
    }
}
