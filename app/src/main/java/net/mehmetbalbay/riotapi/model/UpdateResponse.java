package net.mehmetbalbay.riotapi.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpdateResponse {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("locales")
    @Expose
    private List<String> locales = null;
    @SerializedName("hostname")
    @Expose
    private String hostname;
    @SerializedName("region_tag")
    @Expose
    private String regionTag;
    @SerializedName("services")
    @Expose
    private List<Service> services = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<String> getLocales() {
        return locales;
    }

    public void setLocales(List<String> locales) {
        this.locales = locales;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getRegionTag() {
        return regionTag;
    }

    public void setRegionTag(String regionTag) {
        this.regionTag = regionTag;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
