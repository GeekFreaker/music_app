package android.example.music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LyricsActivity extends AppCompatActivity {

    String sLyrics;
    String sGenre;
    String sTitle;
    int sPrice;
    int albm_Art;

    TextView txtLyrics;
    TextView txtGenre;
    TextView txtTitle;
    TextView txtPrice;
    ImageView txtlbm_Art;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);

        txtLyrics = findViewById(R.id.lyr_lyrics);
        txtGenre = findViewById(R.id.lyr_genre);
        txtTitle = findViewById(R.id.lyr_title);
        txtPrice = findViewById(R.id.lyr_song_price);
        txtlbm_Art = findViewById(R.id.img_album_art);

        Intent lyricalInformation= getIntent();
        Bundle SongData = lyricalInformation.getExtras();

        sLyrics = SongData.getString("lyrics");
        sGenre = SongData.getString("genre");
        sTitle = SongData.getString("title");
        sPrice =  SongData.getInt("price");
        albm_Art = SongData.getInt("art");

        txtLyrics.setText(sLyrics);
        txtGenre.setText(sGenre);
        txtTitle.setText(sTitle);
        txtPrice.setText(String.valueOf(sPrice));
        txtlbm_Art.setImageDrawable(getResources().getDrawable(albm_Art));
    }
}
