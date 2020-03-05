package com.lamndasols.weatherforecast.data;

import java.util.ArrayList;

import com.lamndasols.weatherforecast.model.Forecast;

public interface ForecastListAsyncResponse {
    void processFinished(ArrayList<Forecast> forecastArrayList);
}
