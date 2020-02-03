package android.example.music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Year;

public class ArtistActivity extends AppCompatActivity {

    String sSummary;
    String sGenre;
    String sYear;
    int sArt;

    TextView txtSummary;
    TextView txtGenre;
    TextView txtYear;

    ImageView imgBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        txtSummary = findViewById(R.id.albm_Summary);
        txtGenre = findViewById(R.id.albm_Genre);
        txtYear = findViewById(R.id.albm_Year);
        imgBtn = findViewById(R.id.albm_img);

        Intent Arts = getIntent();
        Bundle AlbumData = Arts.getExtras();

        sSummary = AlbumData.getString("Summary");
        sGenre = AlbumData.getString("Genre");
        sYear = AlbumData.getString("Year");
        sArt = AlbumData.getInt("Art");

        txtSummary.setText(sSummary);
        txtGenre.setText(sGenre);
        txtYear.setText(sYear);
        imgBtn.setImageDrawable(getResources().getDrawable(sArt));
    }
}
