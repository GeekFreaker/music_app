package android.example.music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.example.music_app.Adapters.AlbumAdapter;
import android.example.music_app.Art.Album;
import android.example.music_app.Art.Artist;
import android.example.music_app.Art.Song;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    Artist Usher = new Artist();
    Artist BlackThought = new Artist();

    Album mEightSevenZeroOne = new Album();
    Album mIlladelphHalflife = new Album();
    Album[] AllAlbums = new Album[1];

    ArrayList<Song> mEightSevenZeroOneTracks;
    ArrayList<Song> mIlladeplhHalfLifeTracks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //all albums
        AllAlbums = new Album[2];

        // 1
        AllAlbums[0] = mEightSevenZeroOne;
        // the capability to add more than one album to an artist (for memory I limited it to 2 albums)
        // AllAlbum[1] = ...
        Usher = new Artist("Usher", "Raymond", "Usher", AllAlbums);
        createFirstAlbum();

        // 2
        AllAlbums[0] = mIlladelphHalflife;
        // the capability to add more than one album to an artist (for memory I limited it to 2 albums)
        // AllAlbum[1] = ...
        BlackThought = new Artist("Tariq", "Trotter", "Black Thought", AllAlbums);
        createSecondAlbum();

        // Ensure you add these albums to the UI in the scrollView
        ArrayList<Album> AllAddedAlbums = new ArrayList<Album>();
        AllAddedAlbums.add(mEightSevenZeroOne);
        AllAddedAlbums.add(mIlladelphHalflife);

        AlbumAdapter itemsAdapter = new AlbumAdapter(getApplicationContext(), R.layout.albums_layout, AllAddedAlbums);
        ListView listView = findViewById(R.id.albums_list);
        listView.setAdapter(itemsAdapter);
    }

    private void createFirstAlbum() {
        //album 1
        mEightSevenZeroOneTracks = new ArrayList<>();
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "Intro-Lude 8701", 1, TimeUnit.MILLISECONDS.toMinutes(26400)));//0:44
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "U remind me", 2, TimeUnit.MILLISECONDS.toMinutes(255600)));//4.22
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "I don't know", 3, TimeUnit.MILLISECONDS.toMinutes(255600)));//4.26
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "Twerk it out", 4, TimeUnit.MILLISECONDS.toMinutes(256200)));//4:42
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "U got it Bad", 5, TimeUnit.MILLISECONDS.toMinutes(175000)));//4:07
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "Pop Ya collar", 6, TimeUnit.MILLISECONDS.toMinutes(175000)));//3:35
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "If I want to", 7, TimeUnit.MILLISECONDS.toMinutes(175000)));//3:46
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "I can't let you go", 8, TimeUnit.MILLISECONDS.toMinutes(175000)));//3:28
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "U don't have to call", 9, TimeUnit.MILLISECONDS.toMinutes(175000)));//4:29
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "Without U (interlude)", 10, TimeUnit.MILLISECONDS.toMinutes(175000)));//0:53
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "Can U help me", 11, TimeUnit.MILLISECONDS.toMinutes(175000)));//5:35
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "How do I say", 12, TimeUnit.MILLISECONDS.toMinutes(175000)));//5:39
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "Hottest thing", 13, TimeUnit.MILLISECONDS.toMinutes(175000)));//3:49
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "Good Ol' Ghetto", 14, TimeUnit.MILLISECONDS.toMinutes(175000)));//4:00
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "U-Turn", 15, TimeUnit.MILLISECONDS.toMinutes(175000)));//3:09
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "TTP", 16, TimeUnit.MILLISECONDS.toMinutes(175000)));//3:38
        mEightSevenZeroOneTracks.add(new Song("R&B", 2.99, "Separated", 17, TimeUnit.MILLISECONDS.toMinutes(175000)));//4:24

        //Album created
        mEightSevenZeroOne = new Album("8701", "2001", "Rythmn and Blues by Usher Raymond", "R&B", 98.67, mEightSevenZeroOneTracks, R.drawable.usher_album, Usher);
    }

    private void createSecondAlbum() {
        //album 2
        mIlladeplhHalfLifeTracks = new ArrayList<>();
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Intro", 1, TimeUnit.MILLISECONDS.toMinutes(1000)));//0"34
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Respond/React", 2, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Section", 3, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Panic!!!!!", 4, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "It just don't stop", 5, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Episodes", 6, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Push up ya lighter", 7, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "What they do", 8, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "? vs Scratch", 9, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Concerto of the Desperado", 10, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "CLONES", 11, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Respond/React", 12, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "UNIverse at war", 13, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "No Alibi", 14, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Dave vs Us", 15, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "No Great Pretender", 16, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "The Hypnotic", 17, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Ital (The Universal Side)", 18, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "One Side", 19, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "The Adventures in Wonderland", 20, TimeUnit.MILLISECONDS.toMinutes(1000)));
        mIlladeplhHalfLifeTracks.add(new Song("Hip-Hop", 3.99, "Outro", 21, TimeUnit.MILLISECONDS.toMinutes(1000)));

        //album created
        mIlladelphHalflife = new Album("Illadelph HalfLife", "1996", "90's Hip-Hop Album by the Roots", "Hip Hop", 64.99, mIlladeplhHalfLifeTracks, R.drawable.illadelph_album, BlackThought);
    }
}