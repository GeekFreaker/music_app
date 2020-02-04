package android.example.music_app.Adapters;

import android.content.Context;
import android.content.Intent;
import android.example.music_app.AlbumActivity;
import android.example.music_app.Art.Album;
import android.example.music_app.Art.Artist;
import android.example.music_app.ArtistActivity;
import android.example.music_app.ArtistInformationActivity;
import android.example.music_app.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AlbumAdapter extends ArrayAdapter<Album> {
    private List<Album> Collection;
    private Artist Artist;

    public AlbumAdapter(@NonNull Context context, int resource, @NonNull List<Album> objects) {// Artist artist
        super(context, resource, objects);
        Collection = objects;
        Artist = objects.get(0).getArtist();
    }

    @NonNull
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.albums_layout, parent, false);
        }
        LinearLayout Tracks = convertView.findViewById(R.id.album_click);
        TextView TitleView = convertView.findViewById(R.id.txtTAlbumName);
        TextView SummaryView = convertView.findViewById(R.id.txtSummary);
        TextView YearAndGenreView = convertView.findViewById(R.id.txtGenre_Year);
        ImageView AlbumArt = convertView.findViewById(R.id.album_snapshot);

        TitleView.setText(Collection.get(position).getmTitle());
        SummaryView.setText(Collection.get(position).getmSummary());
        String YearAndGenre = Collection.get(position).getmYear() + ' ' + Collection.get(position).getmYear();
        YearAndGenreView.setText(YearAndGenre);
        AlbumArt.setImageResource(Collection.get(position).getAlbumArt());

        AlbumArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TracView = new Intent(getContext(), AlbumActivity.class);
                TracView.putParcelableArrayListExtra("Songs", getItem(position).getmTracks());
                TracView.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(TracView);
            }
        });

        Tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TracView = new Intent(getContext(), ArtistActivity.class);
                TracView.putExtra("Summary", getItem(position).getmSummary());
                TracView.putExtra("Genre", getItem(position).getmGenre());
                TracView.putExtra("Year", getItem(position).getmYear());
                TracView.putExtra("Art", getItem(position).getAlbumArt());
                TracView.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(TracView);
            }
        });

        Tracks.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent TracView = new Intent(getContext(), ArtistInformationActivity.class);
                Artist = getItem(position).getArtist();
                TracView.putExtra("album", Artist.getmAlbum());
                TracView.putExtra("alias", Artist.getmAlias());
                TracView.putExtra("name", Artist.getmName());
                TracView.putExtra("surname", Artist.getmSurname());
                TracView.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(TracView);
                return false;
            }
        });

        return convertView;
    }
}
