package science.ghost.www.ghost_fantasy.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Development_PC on 4/2/2018.
 */

public class ApiClient {
    public static final String BASE_URL = "http://ioptics.xyz/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
