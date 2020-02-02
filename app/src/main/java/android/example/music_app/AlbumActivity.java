package android.example.music_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.example.music_app.Adapters.SongsAdapter;
import android.example.music_app.Art.Song;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    ArrayList<Song> AlbumSongs = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        Intent Content =  getIntent();
        Bundle dundle = Content.getExtras();
        AlbumSongs = Content.getParcelableArrayListExtra("Songs");
        SongsAdapter itemAdapter = new SongsAdapter(getApplicationContext(), R.layout.list_album, AlbumSongs);
        ListView listView = findViewById(R.id.total_album_list);
        listView.setAdapter(itemAdapter);
    }
}
