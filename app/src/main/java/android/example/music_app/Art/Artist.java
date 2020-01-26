package android.example.music_app.Art;

public class Artist {
    private String mName;
    private String mSurname;
    private int mAlias;
    private Album [] mAlbum;

    public Artist(String mName, String mSurname, int mAlias, Album[] mAlbum) {
        this.mName = mName;
        this.mSurname = mSurname;
        this.mAlias = mAlias;
        this.mAlbum = mAlbum;
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

    public int getmAlias() {
        return mAlias;
    }

    public void setmAlias(int mAlias) {
        this.mAlias = mAlias;
    }

    public Album[] getmAlbum() {
        return mAlbum;
    }

    public void setmAlbum(Album[] mAlbum) {
        this.mAlbum = mAlbum;
    }
}
