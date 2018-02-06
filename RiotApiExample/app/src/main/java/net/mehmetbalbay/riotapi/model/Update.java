package net.mehmetbalbay.riotapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Update {

    @SerializedName("severity")
    @Expose
    private String severity;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("created_at")
    @Expose
    private String created_At;
    @SerializedName("translations")
    @Expose
    private List<Object> translations = null;

}
