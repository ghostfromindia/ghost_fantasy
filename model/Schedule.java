package science.ghost.www.ghost_fantasy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Schedule {

    @SerializedName("schedule")
    @Expose
    private List<Schedule_> schedule = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Schedule() {
    }

    /**
     * 
     * @param schedule
     */
    public Schedule(List<Schedule_> schedule) {
        super();
        this.schedule = schedule;
    }

    public List<Schedule_> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule_> schedule) {
        this.schedule = schedule;
    }

}
