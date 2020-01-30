package android.example.music_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.example.music_app.Adapters.SongsAdapter;
import android.example.music_app.Art.Song;
import android.os.Build;
import android.os.Bundle;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.*;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        Intent Content =  getIntent();
//        Bundle Received = Content.getParcelableExtra("Songs");
        ArrayList<Song> AlbumSongs = new ArrayList<>();
        //if(Received!=null) {
//           AlbumSongs =  Arrays.hashCode(new Serializable[]{Content.getSerializableExtra("Songs")});
        AlbumSongs = Content.<Song>getParcelableArrayListExtra("Songs");
//           assert AlbumSongs != null;
         SongsAdapter itemAdapter = new SongsAdapter(getApplicationContext(), R.layout.list_album, AlbumSongs);
           ListView listView = (ListView) findViewById(R.id.total_album_list);
           listView.setAdapter(itemAdapter);
        //}
    }
}
