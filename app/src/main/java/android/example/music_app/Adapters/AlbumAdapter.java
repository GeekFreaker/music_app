package android.example.music_app.Adapters;

import android.content.Context;
import android.content.Intent;
import android.example.music_app.AlbumActivity;
import android.example.music_app.Art.Album;
import android.example.music_app.Art.Artist;
import android.example.music_app.ArtistActivity;
import android.example.music_app.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(@NonNull Context context, int resource, @NonNull List<Album> objects) {
        super(context, resource, objects);
    }

    @NonNull
    public View getView( final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.albums_layout, parent, false);
        }
        LinearLayout Tracks = convertView.findViewById(R.id.album_click);
        TextView TitleView = convertView.findViewById(R.id.txtTAlbumName);
        TextView SummaryView = convertView.findViewById(R.id.txtSummary);
        TextView YearAndGenreView = convertView.findViewById(R.id.txtGenre_Year);
        ImageView AlbumArt = convertView.findViewById(R.id.album_snapshot);

        TitleView.setText(getItem(position).getmTitle());
        SummaryView.setText(getItem(position).getmSummary());
        String YearAndGenre = getItem(position).getmYear()+' '+getItem(position).getmYear();
        YearAndGenreView.setText(YearAndGenre);
        AlbumArt.setImageResource(getItem(position).getAlbumart());

        AlbumArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TracView = new Intent(getContext(), AlbumActivity.class);
//                TracView.putExtra("Tracks",getItem(position).getmTracks());
//                Bundle bundle = new Bundle();
//                bundle.putSerializable("Tracks", getItem(position).getmTracks());
                TracView.putParcelableArrayListExtra("Songs",getItem(position).getmTracks());
                TracView.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(TracView);

            }
        });

        Tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TracView = new Intent(getContext(), ArtistActivity.class);
                TracView.putExtra("Summary",getItem(position).getmSummary());
                TracView.putExtra("Genre",getItem(position).getmGenre());
                TracView.putExtra("Year",getItem(position).getmYear());
                TracView.putExtra("Tracks",getItem(position).getmTracks());
                Bundle bundle = new Bundle();
                bundle.putSerializable("Tracks", getItem(position).getmTracks());
                TracView.putExtras(bundle);
                TracView.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(TracView);
            }
        });

        return convertView;
    }
}
