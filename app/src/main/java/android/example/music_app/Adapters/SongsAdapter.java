package android.example.music_app.Adapters;

import android.content.Context;
import android.content.Intent;
import android.example.music_app.AlbumActivity;
import android.example.music_app.Art.Song;
import android.example.music_app.LyricsActivity;
import android.example.music_app.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SongsAdapter extends ArrayAdapter<Song> {

    private ArrayList<Song> mSongs;

    public SongsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Song> objects) {
        super(context, resource, objects);
        mSongs = objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_album, parent, false);
        }
        TextView SongTitleView = convertView.findViewById(R.id.txtSongTitle);
        TextView SongGenreView = convertView.findViewById(R.id.txtSongGenre);
        TextView DurationView = convertView.findViewById(R.id.txtSongDuration);
        TextView PriceView = convertView.findViewById(R.id.txtSongPrice);
        Button LyricsView = convertView.findViewById(R.id.btnPay);

        if(mSongs.get(position)!=null) {
            String TrackData = mSongs.get(position).getmTrackNumber() + "). " + mSongs.get(position).getmTitle();
            String value = mSongs.get(position).getmTrackLength().toString();
            SongTitleView.setText(TrackData);
            SongGenreView.setText(mSongs.get(position).getmGenre());
            DurationView.setText(value);
            PriceView.setText(String.valueOf(mSongs.get(position).getmPrice()));

            LyricsView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent ShowLyrics = new Intent(getContext(), LyricsActivity.class);
                    ShowLyrics.putExtra("lyrics",mSongs.get(position).getLyrics());
                    ShowLyrics.putExtra("genre",mSongs.get(position).getmGenre());
                    ShowLyrics.putExtra("title",mSongs.get(position).getmTitle());
                    ShowLyrics.putExtra("price",mSongs.get(position).getmPrice());
                    //some random images
                    if (getItem(position).getmGenre().equals("Hip-Hop")) {
                        ShowLyrics.putExtra("art",R.drawable.illadelph_one);
                    } else {
                        ShowLyrics.putExtra("art",R.drawable.eight_seven_zero_one);
                    }
                    ShowLyrics.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(ShowLyrics);
                }
            });
        }

        return convertView;
    }
}
