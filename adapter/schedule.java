package science.ghost.www.ghost_fantasy.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import science.ghost.www.ghost_fantasy.R;
import science.ghost.www.ghost_fantasy.model.Schedule_;
import science.ghost.www.ghost_fantasy.singlematch;

public class schedule extends RecyclerView.Adapter<schedule.MovieViewHolder> {

    private List<Schedule_> schedule;
    private int rowLayout;
    private Context context;


    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        LinearLayout playinLayout;
        TextView title;
        TextView time;
        ImageView home;
        ImageView away;


        public MovieViewHolder(View v) {
            super(v);
            playinLayout = (LinearLayout) v.findViewById(R.id.scheduleLayout);
            title = (TextView) v.findViewById(R.id.title);
            home = (ImageView) v.findViewById(R.id.homeimg);
            away = (ImageView) v.findViewById(R.id.awayimg);
            time =(TextView) v.findViewById(R.id.time);
        }
    }

    public schedule(List<Schedule_> schedule, int rowLayout, Context context) {
        this.schedule = schedule;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public schedule.MovieViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        holder.title.setText(schedule.get(position).getTitle());
        holder.time.setText(schedule.get(position).getDate());
        Picasso.get().load(schedule.get(position).getHomeimg()).into(holder.home);
        Picasso.get().load(schedule.get(position).getAwayimg()).into(holder.away);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,singlematch.class);
                i.putExtra("id",schedule.get(position).getId());
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return schedule.size();
    }

}
