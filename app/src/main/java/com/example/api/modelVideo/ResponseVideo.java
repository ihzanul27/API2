package com.example.api.modelVideo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
public class ResponseVideo {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("results")
    @Expose
    private List<ResultVideo> results = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ResultVideo> getResults() {
        return results;
    }

    public void setResults(List<ResultVideo> results) {
        this.results = results;
    }

}