package com.example.movieapp.Model;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilmlerResponse {@SerializedName("id")
@Expose
private Integer id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
//    @SerializedName("type")
//    @Expose
//    private String type;
//    @SerializedName("language")
//    @Expose
//    private String language;
//    @SerializedName("genres")
//    @Expose
//    private List<String> genres = null;
//    @SerializedName("status")
//    @Expose
//    private String status;
//    @SerializedName("runtime")
//    @Expose
//    private Integer runtime;
//    @SerializedName("averageRuntime")
//    @Expose
//    private Integer averageRuntime;
//    @SerializedName("premiered")
//    @Expose
//    private String premiered;
//    @SerializedName("ended")
//    @Expose
//    private String ended;
//    @SerializedName("officialSite")
//    @Expose
//    private String officialSite;
//    @SerializedName("rating")
//    @Expose
//    private Rating rating;
//    @SerializedName("weight")
//    @Expose
//    private Integer weight;
//    @SerializedName("network")
//    @Expose
//    private Network network;
//    @SerializedName("webChannel")
//    @Expose
//    private Object webChannel;
//    @SerializedName("dvdCountry")
//    @Expose
//    private Object dvdCountry;
//    @SerializedName("externals")
//    @Expose
//    private Externals externals;
    @SerializedName("image")
    @Expose
    private Image image;
//    @SerializedName("summary")
//    @Expose
//    private String summary;

//    @SerializedName("_links")
//    @Expose
//    private Links links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }
//
//    public List<String> getGenres() {
//        return genres;
//    }
//
//    public void setGenres(List<String> genres) {
//        this.genres = genres;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public Integer getRuntime() {
//        return runtime;
//    }
//
//    public void setRuntime(Integer runtime) {
//        this.runtime = runtime;
//    }
//
//    public Integer getAverageRuntime() {
//        return averageRuntime;
//    }
//
//    public void setAverageRuntime(Integer averageRuntime) {
//        this.averageRuntime = averageRuntime;
//    }
//
//    public String getPremiered() {
//        return premiered;
//    }
//
//    public void setPremiered(String premiered) {
//        this.premiered = premiered;
//    }
//
//    public String getEnded() {
//        return ended;
//    }
//
//    public void setEnded(String ended) {
//        this.ended = ended;
//    }
//
//    public String getOfficialSite() {
//        return officialSite;
//    }
//
//    public void setOfficialSite(String officialSite) {
//        this.officialSite = officialSite;
//    }
//
//    public Schedule getSchedule() {
//        return schedule;
//    }
//
//    public void setSchedule(Schedule schedule) {
//        this.schedule = schedule;
//    }
//
//    public Rating getRating() {
//        return rating;
//    }
//
//    public void setRating(Rating rating) {
//        this.rating = rating;
//    }
//
//    public Integer getWeight() {
//        return weight;
//    }
//
//    public void setWeight(Integer weight) {
//        this.weight = weight;
//    }
//
//    public Network getNetwork() {
//        return network;
//    }
//
//    public void setNetwork(Network network) {
//        this.network = network;
//    }
//
//    public Object getWebChannel() {
//        return webChannel;
//    }
//
//    public void setWebChannel(Object webChannel) {
//        this.webChannel = webChannel;
//    }
//
//    public Object getDvdCountry() {
//        return dvdCountry;
//    }
//
//    public void setDvdCountry(Object dvdCountry) {
//        this.dvdCountry = dvdCountry;
//    }
//
//    public Externals getExternals() {
//        return externals;
//    }
//
//    public void setExternals(Externals externals) {
//        this.externals = externals;
//    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

//    public String getSummary() {
//        return summary;
//    }
//
//    public void setSummary(String summary) {
//        this.summary = summary;
//    }
//
//    public Integer getUpdated() {
//        return updated;
//    }
//
//    public void setUpdated(Integer updated) {
//        this.updated = updated;
//    }
//
//    public Links getLinks() {
//        return links;
//    }
//
//    public void setLinks(Links links) {
//        this.links = links;
//    }

}
