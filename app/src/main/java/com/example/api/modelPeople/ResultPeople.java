package com.example.api.modelPeople;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class ResultPeople {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("cast")
    @Expose
    private List<CastPeople> cast = null;
    @SerializedName("crew")
    @Expose
    private List<CrewPeople> crew = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<CastPeople> getCast() {
        return cast;
    }

    public void setCast(List<CastPeople> cast) {
        this.cast = cast;
    }

    public List<CrewPeople> getCrew() {
        return crew;
    }

    public void setCrew(List<CrewPeople> crew) {
        this.crew = crew;
    }

}
