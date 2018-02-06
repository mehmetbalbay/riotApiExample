package net.mehmetbalbay.riotapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Status {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("region_tag")
    @Expose
    private String regionTag;
    @SerializedName("hostname")
    @Expose
    private String hostname;
    @SerializedName("services")
    @Expose
    private List<Service> services = null;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("locales")
    @Expose
    private List<String> locales = null;

    public Status(String name, String regionTag, String hostname, List<Service> services, String slug, List<String> locales) {
        this.name = name;
        this.regionTag = regionTag;
        this.hostname = hostname;
        this.services = services;
        this.slug = slug;
        this.locales = locales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionTag() {
        return regionTag;
    }

    public void setRegionTag(String regionTag) {
        this.regionTag = regionTag;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
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
}
