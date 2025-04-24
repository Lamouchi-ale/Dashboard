package com.example.dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class canframe {

    @Id
    private String id;
    private String voitureId;
    private double vitesse;
    private double batterie;
    private double range;
    private String mode;
    private double autonomie;
    private double totalDistance;
    private double dailyDistance;
    private double tempMoteur;
    private double lat;
    private double lon;

    public canframe() {
    }

    public canframe(String voitureId, double vitesse, double batterie, double range, String mode,
                    double autonomie, double totalDistance, double dailyDistance,
                    double tempMoteur, double lat, double lon) {
        this.voitureId = voitureId;
        this.vitesse = vitesse;
        this.batterie = batterie;
        this.range = range;
        this.mode = mode;
        this.autonomie = autonomie;
        this.totalDistance = totalDistance;
        this.dailyDistance = dailyDistance;
        this.tempMoteur = tempMoteur;
        this.lat = lat;
        this.lon = lon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVoitureId() {
        return voitureId;
    }

    public void setVoitureId(String voitureId) {
        this.voitureId = voitureId;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public double getBatterie() {
        return batterie;
    }

    public void setBatterie(double batterie) {
        this.batterie = batterie;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public double getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(double autonomie) {
        this.autonomie = autonomie;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getDailyDistance() {
        return dailyDistance;
    }

    public void setDailyDistance(double dailyDistance) {
        this.dailyDistance = dailyDistance;
    }

    public double getTempMoteur() {
        return tempMoteur;
    }

    public void setTempMoteur(double tempMoteur) {
        this.tempMoteur = tempMoteur;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "CanFrame{" +
                "id='" + id + '\'' +
                ", voitureId='" + voitureId + '\'' +
                ", vitesse=" + vitesse +
                ", batterie=" + batterie +
                ", range=" + range +
                ", mode='" + mode + '\'' +
                ", autonomie=" + autonomie +
                ", totalDistance=" + totalDistance +
                ", dailyDistance=" + dailyDistance +
                ", tempMoteur=" + tempMoteur +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
