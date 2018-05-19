package science.ghost.www.ghost_fantasy.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import science.ghost.www.ghost_fantasy.R;
import science.ghost.www.ghost_fantasy.adapter.schedule;
import science.ghost.www.ghost_fantasy.api.ApiClient;
import science.ghost.www.ghost_fantasy.api.ApiInterface;
import science.ghost.www.ghost_fantasy.model.Schedule;
import science.ghost.www.ghost_fantasy.model.Schedule_;


public class upcoming extends Fragment {
    ApiInterface apiInterface;
    RecyclerView recyclerView;
    TextView loading;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_upcoming,container,false);
        loading = (TextView) view.findViewById(R.id.loading);
        recyclerView = (RecyclerView) view.findViewById(R.id.liveSchedule);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        play();
        return view;
    }

    public void play(){
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        final Call<Schedule> schedule = apiInterface.getSchedule();
        schedule.enqueue(new Callback<Schedule>() {
            @Override
            public void onResponse(Call<Schedule> call, Response<Schedule> response) {
                List<Schedule_> live = (List<Schedule_>) response.body().getSchedule();
                Log.i("RETROFIT",""+live.get(0).getId());
                loading.setVisibility(View.GONE);
                recyclerView.setAdapter(new schedule((List<Schedule_>) live,R.layout.list_schedule,getContext()));
            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onFailure(Call<Schedule> call, Throwable t) {
                Log.e("ERROR",""+t.toString());
                loading.setVisibility(View.VISIBLE);
                loading.setText("Database connection error. Try later");
            }
        });
        // Inflate the layout for this fragment
    }

}
