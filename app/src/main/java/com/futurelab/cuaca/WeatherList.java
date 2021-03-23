package com.futurelab.cuaca;

public class WeatherList {
    String time, status, statusDetail;
    double tempMax, tempMin;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public WeatherList(String time, double tempMax, double tempMin, String status, String statusDetail) {
        this.time = time;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.status = status;
        this.statusDetail = statusDetail;
    }
}
