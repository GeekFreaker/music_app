package android.example.music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.example.music_app.Adapters.SongsAdapter;
import android.example.music_app.Art.Song;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    ArrayList<Song> AlbumSongs = new ArrayList<Song>();
    ImageView imgVue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        Intent Content = getIntent();
        AlbumSongs = Content.getParcelableArrayListExtra("Songs");

        imgVue = findViewById(R.id.AlbumView);
        if (AlbumSongs.get(0).getmGenre().equals("R&B")) {
            imgVue.setImageDrawable(getResources().getDrawable(R.drawable.eight_seven_zero_two));
        } else {
            imgVue.setImageDrawable(getResources().getDrawable(R.drawable.illadelph_two));
        }

        SongsAdapter itemAdapter = new SongsAdapter(getApplicationContext(), R.layout.list_album, AlbumSongs);
        ListView listView = findViewById(R.id.total_album_list);
        listView.setAdapter(itemAdapter);
    }
}
