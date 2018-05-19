package science.ghost.www.ghost_fantasy.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import science.ghost.www.ghost_fantasy.R;
import science.ghost.www.ghost_fantasy.adapter.playerAdapter;
import science.ghost.www.ghost_fantasy.api.ApiClient;
import science.ghost.www.ghost_fantasy.api.ApiInterface;
import science.ghost.www.ghost_fantasy.model.Players;

public class players extends Fragment {

    ApiInterface apiInterface;
    GridView gridView;
    private Bundle bundle;
    int myInt;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_players,container,false);
        gridView = (GridView) view.findViewById(R.id.playergrid);
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        bundle = this.getArguments();
        if (bundle != null) {
            myInt = bundle.getInt("id", 1);
        }else{
            myInt = 2;
        }
        Call<Players> callmenu = apiInterface.getPlayersData(myInt);

        callmenu.enqueue(new Callback<Players>() {
            @Override
            public void onResponse(Call<Players> call, Response<Players> response) {
                List<String> play = response.body().getPlayers();
                playerAdapter gridViewAdapter = new playerAdapter(getContext(),play);
                gridView.setAdapter(gridViewAdapter);


            }

            @Override
            public void onFailure(Call<Players> call, Throwable t) {
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
