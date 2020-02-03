package android.example.music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ArtistInformationActivity extends AppCompatActivity {

    String sName;
    String sSurname;
    String sAlias;

    TextView txtName;
    TextView txtSurname;
    TextView txtAlias;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_information);

        txtAlias = findViewById(R.id.trc_alias);
        txtName = findViewById(R.id.trc_name);
        txtSurname = findViewById(R.id.trc_surname);

        Intent sCatch = getIntent();
        Bundle GotData = sCatch.getExtras();

        imgView = findViewById(R.id.art_image);

        sName = GotData.getString("name");
        sSurname = GotData.getString("surname");
        sAlias = GotData.getString("alias");

        if(sName.equals("Usher")){
            imgView.setImageDrawable(getResources().getDrawable(R.drawable.usher));
        }else{
            imgView.setImageDrawable(getResources().getDrawable(R.drawable.blackthought));
        }

        txtAlias.setText(sAlias);
        String Naam = "' "+sName+" '";
        txtName.setText(Naam);
        txtSurname.setText(sSurname);

    }
}
