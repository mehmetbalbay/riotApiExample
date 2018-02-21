package net.mehmetbalbay.riotapi.model.Staticdataitems;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoldDto {

    @SerializedName("sell")
    @Expose
    private int sell;
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("base")
    @Expose
    private int base;
    @SerializedName("purchasable")
    @Expose
    private int purchasable;
}
