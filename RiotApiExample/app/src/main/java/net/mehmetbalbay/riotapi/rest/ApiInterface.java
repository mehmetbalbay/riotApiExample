package net.mehmetbalbay.riotapi.rest;

import net.mehmetbalbay.riotapi.model.Staticdataitems.ItemListDto;
import net.mehmetbalbay.riotapi.model.UpdateResponse;
import net.mehmetbalbay.riotapi.model.Updates;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("status/v3/shard-data")
    Call<UpdateResponse> getStatus(@Query("api_key") String api_key);

    @GET("static-data/v3/items")
    Call<ItemListDto> getSTitems (@Query("api_key") String api_key);
}

