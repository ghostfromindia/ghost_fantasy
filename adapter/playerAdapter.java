package science.ghost.www.ghost_fantasy.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import science.ghost.www.ghost_fantasy.R;
import science.ghost.www.ghost_fantasy.model.Players;

public class playerAdapter extends BaseAdapter {


    private Context context;
    private List<String> data;

    public playerAdapter(Context context, List<String> data){
        //Getting all the values
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Creating a linear layout

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            convertView= LayoutInflater.from(context).inflate(R.layout.playerbox, null);
        }

        TextView name = (TextView) convertView.findViewById(R.id.name);
        name.setText(data.get(position).toString());
        Log.i("AJ","AJ");


        //Returnint the layout
        return convertView;
    }
}