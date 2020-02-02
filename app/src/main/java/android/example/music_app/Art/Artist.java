package android.example.music_app.Art;

import java.io.Serializable;

public class Artist implements Serializable {
    private String mName;
    private String mSurname;
    private String mAlias;
    private Album [] mAlbum;

    public Artist() {
    }

    public Artist(String mName, String mSurname, String mAlias, Album[] mAlbum) {
        this.mName = mName;
        this.mSurname = mSurname;
        this.mAlias = mAlias;
        this.mAlbum = mAlbum;//array
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSurname() {
        return mSurname;
    }

    public void setmSurname(String mSurname) {
        this.mSurname = mSurname;
    }

    public String getmAlias() {
        return mAlias;
    }

    public void setmAlias(String mAlias) {
        this.mAlias = mAlias;
    }

    public Album[] getmAlbum() {
        return mAlbum;
    }

    public void setmAlbum(Album[] mAlbum) {
        this.mAlbum = mAlbum;
    }
}
