package science.ghost.www.ghost_fantasy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schedule_ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("match_id")
    @Expose
    private String matchId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("homeimg")
    @Expose
    private String homeimg;
    @SerializedName("awayimg")
    @Expose
    private String awayimg;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("total")
    @Expose
    private String total;

    /**
     * No args constructor for use in serialization
     *
     */
    public Schedule_() {
    }

    /**
     *
     * @param total
     * @param id
     * @param title
     * @param matchId
     * @param awayimg
     * @param date
     * @param homeimg
     */
    public Schedule_(Integer id, String matchId, String title, String homeimg, String awayimg, String date, String total) {
        super();
        this.id = id;
        this.matchId = matchId;
        this.title = title;
        this.homeimg = homeimg;
        this.awayimg = awayimg;
        this.date = date;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}