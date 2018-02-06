package net.mehmetbalbay.riotapi.model.Staticdataitems;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemTreeDto {
    @SerializedName("header")
    @Expose
    private String header;
    @SerializedName("tags")
    @Expose
    private List<String> tags;

}
