package com.futurelab.cuaca;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WeatherListAdapter extends RecyclerView.Adapter<WeatherListHolder> {
    public ArrayList<WeatherList> mWeatherList;
    public WeatherListAdapter(ArrayList<WeatherList> mWeatherList){
        this.mWeatherList = mWeatherList;
    }
    @NonNull
    @Override
    public WeatherListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_weather, parent, false);
        return new WeatherListHolder(card);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherListHolder holder, int position) {
        WeatherList weatherList = mWeatherList.get(position);
        holder.updateUI(weatherList);
    }

    @Override
    public int getItemCount() {
        return mWeatherList.size();
    }
}
