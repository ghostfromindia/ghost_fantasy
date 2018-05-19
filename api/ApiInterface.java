package science.ghost.www.ghost_fantasy.api;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import science.ghost.www.ghost_fantasy.model.Players;
import science.ghost.www.ghost_fantasy.model.Schedule;

/**
 * Created by Development_PC on 4/2/2018.
 */

public interface ApiInterface {
    @GET("/iplbeta.php?schedule")
    Call<Schedule> getSchedule();

    @GET("/iplbeta.php/")
    Call<Players> getPlayersData(@Query("id") int id);
}


