package net.mehmetbalbay.riotapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import net.mehmetbalbay.riotapi.model.Staticdataitems.GroupDto;
import net.mehmetbalbay.riotapi.model.Staticdataitems.ItemDto;
import net.mehmetbalbay.riotapi.model.Staticdataitems.ItemListDto;
import net.mehmetbalbay.riotapi.model.UpdateResponse;
import net.mehmetbalbay.riotapi.model.Service;
import net.mehmetbalbay.riotapi.rest.ApiClient;
import net.mehmetbalbay.riotapi.rest.ApiInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private String api_key = "YOUR API KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<UpdateResponse> call = apiService.getStatus(api_key);

        call.enqueue(new Callback<UpdateResponse>() {
            @Override
            public void onResponse(Call<UpdateResponse> call, Response<UpdateResponse> response) {

                List<Service> services = response.body().getServices();
                Log.d("TAG","  "+services.get(2).getName()+" "+ services.get(2).getStatus()
                );

            }

            @Override
            public void onFailure(Call<UpdateResponse> call, Throwable t) {
                Log.d("TAG", String.valueOf(t.getMessage()));

            }
        });
    }
}
