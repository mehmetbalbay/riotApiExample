package net.mehmetbalbay.riotapi.model.Staticdataitems;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupDto {
    @SerializedName("MaxGroupOwnable")
    @Expose
    private String MaxGroupOwnable;
    @SerializedName("key")
    @Expose
    private String key;

    public GroupDto(String maxGroupOwnable, String key) {
        MaxGroupOwnable = maxGroupOwnable;
        this.key = key;
    }

    public String getMaxGroupOwnable() {
        return MaxGroupOwnable;
    }

    public void setMaxGroupOwnable(String maxGroupOwnable) {
        MaxGroupOwnable = maxGroupOwnable;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
