package net.mehmetbalbay.riotapi.model.Staticdataitems;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageDto {
    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("sprite")
    @Expose
    private Integer sprite;
    @SerializedName("h")
    @Expose
    private Integer h;
    @SerializedName("w")
    @Expose
    private Integer w;
    @SerializedName("y")
    @Expose
    private Integer y;
    @SerializedName("x")
    @Expose
    private Integer x;

    public ImageDto(String full, String group, Integer sprite, Integer h, Integer w, Integer y, Integer x) {
        this.full = full;
        this.group = group;
        this.sprite = sprite;
        this.h = h;
        this.w = w;
        this.y = y;
        this.x = x;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getSprite() {
        return sprite;
    }

    public void setSprite(Integer sprite) {
        this.sprite = sprite;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}
