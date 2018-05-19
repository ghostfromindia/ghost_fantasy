package science.ghost.www.ghost_fantasy.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Players {

    @SerializedName("players")
    @Expose
    private List<String> players = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("homeimg")
    @Expose
    private String homeimg;
    @SerializedName("awayimg")
    @Expose
    private String awayimg;
    @SerializedName("description")
    @Expose
    private String description;

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHomeimg() {
        return homeimg;
    }

    public void setHomeimg(String homeimg) {
        this.homeimg = homeimg;
    }

    public String getAwayimg() {
        return awayimg;
    }

    public void setAwayimg(String awayimg) {
        this.awayimg = awayimg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}