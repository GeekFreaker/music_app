package android.example.music_app.Adapters;

import android.content.Context;
import android.content.Intent;
import android.example.music_app.AlbumActivity;
import android.example.music_app.Art.Song;
import android.example.music_app.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SongsAdapter extends ArrayAdapter<Song> {

    public SongsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Song> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.albums_layout, parent, false);
        }
        TextView SongTitleView = convertView.findViewById(R.id.txtSongTitle);
        TextView SongVGenreiew = convertView.findViewById(R.id.txtSongGenre);
        TextView DurationView = convertView.findViewById(R.id.txtSongDuration);
        TextView PriceView = convertView.findViewById(R.id.txtSongPrice);

        String TrackData = getItem(position).getmTrackNumber()+"). "+getItem(position).getmTitle();
        SongTitleView.setText(TrackData);
        SongVGenreiew.setText(getItem(position).getmGenre());
        DurationView.setText(getItem(position).getmTrackLength().toString());
        PriceView.setText(String.valueOf(getItem(position).getmPrice()));



        return convertView;
    }
}
