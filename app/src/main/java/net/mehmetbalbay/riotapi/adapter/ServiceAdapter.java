package net.mehmetbalbay.riotapi.adapter;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.mehmetbalbay.riotapi.R;
import net.mehmetbalbay.riotapi.model.Service;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MovieViewHolder> {

    private List<Service> serviceList;
    private int rowLayout;
    private Context context;


    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout serviceLayout;
        TextView servicedurum;


        public MovieViewHolder(View v) {
            super(v);
            serviceLayout = (ConstraintLayout) v.findViewById(R.id.mConstra);
            servicedurum = (TextView) v.findViewById(R.id.servicedurum);
        }
    }

    public ServiceAdapter(List<Service> serviceList, int rowLayout, Context context) {
        this.serviceList = serviceList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public ServiceAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
    }

    @Override
    public int getItemCount() {
        return serviceList.size();
    }
}