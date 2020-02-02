package android.example.music_app.Adapters;

import android.content.Context;
import android.content.Intent;
import android.example.music_app.AlbumActivity;
import android.example.music_app.Art.Album;
import android.example.music_app.Art.Artist;
import android.example.music_app.Art.Song;
import android.example.music_app.ArtistActivity;
import android.example.music_app.MainActivity;
import android.example.music_app.R;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.parceler.Parcel;
import org.parceler.Parcels;

import java.io.Serializable;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class AlbumAdapter extends ArrayAdapter<Album> {
    List<Album> Collection = new ArrayList<>();
    public AlbumAdapter(@NonNull Context context, int resource, @NonNull List<Album> objects) {
        super(context, resource, objects);
        Collection = objects;
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

        TitleView.setText(Collection.get(position).getmTitle());
        SummaryView.setText(Collection.get(position).getmSummary());
        String YearAndGenre = Collection.get(position).getmYear()+' '+Collection.get(position).getmYear();
        YearAndGenreView.setText(YearAndGenre);
        AlbumArt.setImageResource(Collection.get(position).getAlbumart());

        AlbumArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent TracView = new Intent(getContext(), AlbumActivity.class);
               ArrayList<Song> Songs = getItem(position).getmTracks();
//               Parcelable [] mSongs = new Parcelable[Songs.size()];
////               mSongs.length = Songs.size();
//               int i=0;
//                for (Song track: Songs) {
//                    mSongs[i] = Parcels.wrap(track);
//                    i++;
//                }
//               Bundle Transfer = new Bundle();
//                TracView.putExtra("Songs", Songs);
                TracView.putParcelableArrayListExtra("Songs", Songs);
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
                TracView.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(TracView);
            }
        });

        return convertView;
    }
}
