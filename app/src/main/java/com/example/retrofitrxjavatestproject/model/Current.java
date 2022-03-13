package com.example.retrofitrxjavatestproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Current {

    @SerializedName("last_updated_epoch")
    @Expose
    private Integer lastUpdatedEpoch;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("temp_c")
    @Expose
    private Double tempC;
    @SerializedName("temp_f")
    @Expose
    private Double tempF;
    @SerializedName("is_day")
    @Expose
    private Integer isDay;
    @SerializedName("condition")
    @Expose
    private Condition condition;
    @SerializedName("wind_mph")
    @Expose
    private Double windMph;
    @SerializedName("wind_kph")
    @Expose
    private Double windKph;
    @SerializedName("wind_degree")
    @Expose
    private Integer windDegree;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure_mb")
    @Expose
    private Double pressureMb;
    @SerializedName("pressure_in")
    @Expose
    private Double pressureIn;
    @SerializedName("precip_mm")
    @Expose
    private Double precipMm;
    @SerializedName("precip_in")
    @Expose
    private Double precipIn;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("cloud")
    @Expose
    private Integer cloud;
    @SerializedName("feelslike_c")
    @Expose
    private Double feelslikeC;
    @SerializedName("feelslike_f")
    @Expose
    private Double feelslikeF;
    @SerializedName("vis_km")
    @Expose
    private Double visKm;
    @SerializedName("vis_miles")
    @Expose
    private Double visMiles;
    @SerializedName("uv")
    @Expose
    private Double uv;
    @SerializedName("gust_mph")
    @Expose
    private Double gustMph;
    @SerializedName("gust_kph")
    @Expose
    private Double gustKph;

    public Integer getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    public Current withLastUpdatedEpoch(Integer lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
        return this;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Current withLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public Current withTempC(Double tempC) {
        this.tempC = tempC;
        return this;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public Current withTempF(Double tempF) {
        this.tempF = tempF;
        return this;
    }

    public Integer getIsDay() {
        return isDay;
    }

    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    public Current withIsDay(Integer isDay) {
        this.isDay = isDay;
        return this;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Current withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }

    public Double getWindMph() {
        return windMph;
    }

    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    public Current withWindMph(Double windMph) {
        this.windMph = windMph;
        return this;
    }

    public Double getWindKph() {
        return windKph;
    }

    public void setWindKph(Double windKph) {
        this.windKph = windKph;
    }

    public Current withWindKph(Double windKph) {
        this.windKph = windKph;
        return this;
    }

    public Integer getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    public Current withWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
        return this;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Current withWindDir(String windDir) {
        this.windDir = windDir;
        return this;
    }

    public Double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(Double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public Current withPressureMb(Double pressureMb) {
        this.pressureMb = pressureMb;
        return this;
    }

    public Double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public Current withPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
        return this;
    }

    public Double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(Double precipMm) {
        this.precipMm = precipMm;
    }

    public Current withPrecipMm(Double precipMm) {
        this.precipMm = precipMm;
        return this;
    }

    public Double getPrecipIn() {
        return precipIn;
    }

    public void setPrecipIn(Double precipIn) {
        this.precipIn = precipIn;
    }

    public Current withPrecipIn(Double precipIn) {
        this.precipIn = precipIn;
        return this;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Current withHumidity(Integer humidity) {
        this.humidity = humidity;
        return this;
    }

    public Integer getCloud() {
        return cloud;
    }

    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public Current withCloud(Integer cloud) {
        this.cloud = cloud;
        return this;
    }

    public Double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public Current withFeelslikeC(Double feelslikeC) {
        this.feelslikeC = feelslikeC;
        return this;
    }

    public Double getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public Current withFeelslikeF(Double feelslikeF) {
        this.feelslikeF = feelslikeF;
        return this;
    }

    public Double getVisKm() {
        return visKm;
    }

    public void setVisKm(Double visKm) {
        this.visKm = visKm;
    }

    public Current withVisKm(Double visKm) {
        this.visKm = visKm;
        return this;
    }

    public Double getVisMiles() {
        return visMiles;
    }

    public void setVisMiles(Double visMiles) {
        this.visMiles = visMiles;
    }

    public Current withVisMiles(Double visMiles) {
        this.visMiles = visMiles;
        return this;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Current withUv(Double uv) {
        this.uv = uv;
        return this;
    }

    public Double getGustMph() {
        return gustMph;
    }

    public void setGustMph(Double gustMph) {
        this.gustMph = gustMph;
    }

    public Current withGustMph(Double gustMph) {
        this.gustMph = gustMph;
        return this;
    }

    public Double getGustKph() {
        return gustKph;
    }

    public void setGustKph(Double gustKph) {
        this.gustKph = gustKph;
    }

    public Current withGustKph(Double gustKph) {
        this.gustKph = gustKph;
        return this;
    }

}